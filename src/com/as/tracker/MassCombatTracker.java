package com.as.tracker;

import com.as.Beast;
import com.as.BeastDetails;
import com.as.Beasts;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class MassCombatTracker {
    private JPanel Tracker;
    private JPanel Buttons;
    private JScrollPane CreaturesScrollPane;
    private JComboBox monsterComboBox;
    private JButton AddButton;
    private JButton SortByGroup;
    private JPanel CreaturesPane;
    private JPanel CreatureListPane;
    private JPanel BeastsTemplate;
    private JPanel CreaturesListButtonPane;
    private JPanel CreaturesListPane;
    private JButton SortListButton;
    private JButton FilterListButton;
    private JComboBox FilterOption;
    private JTextField FilterText;
    private JButton ResetListButton;
    private JButton ShowListButton;
    private JPanel CreatureListTemplate;
    private final Beasts beastList;
    private List<Beast> currentBattle = new ArrayList<>();

    private List<Beast> beastSideList = new ArrayList<>();
    private boolean filtered = false;

    public MassCombatTracker(Beasts beastList) {
        this.beastList = beastList;
        config();
    }

    public void config() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) monsterComboBox.getModel();
        model.removeAllElements();
        model.addElement("");
        model.addAll(beastList.beasts.stream().map(Beast::getName).collect(Collectors.toList()));
        monsterComboBox.setModel(model);
        CreaturesPane.setLayout(new BoxLayout(CreaturesPane, BoxLayout.PAGE_AXIS));
        BeastsTemplate.setLayout(new BoxLayout(BeastsTemplate, BoxLayout.PAGE_AXIS));
        JPanel template = new JPanel();
        template.setLayout(new FlowLayout());
        JTextField Templateinitiative = new JTextField("Group nr");
        Templateinitiative.setColumns(5);
        Templateinitiative.setEditable(false);
        JTextField Templatename = new JTextField("Name");
        Templatename.setColumns(10);
        Templatename.setEditable(false);
        JTextArea Templateattacks = new JTextArea("Attacks");
        Templateattacks.setLineWrap(true);
        Templateattacks.setWrapStyleWord(true);
        Templateattacks.setEditable(false);
        JTextField TemplateunitHp = new JTextField("Max HP");
        TemplateunitHp.setColumns(5);
        TemplateunitHp.setEditable(false);
        JTextField TemplateMorale = new JTextField("Morale");
        TemplateMorale.setColumns(5);
        TemplateMorale.setEditable(false);
        JTextField TemplateunitAmount = new JTextField("Unit Amo");
        TemplateunitAmount.setColumns(5);
        TemplateunitAmount.setEditable(false);
        JTextField TemplateunitCurrHp = new JTextField("Cur HP");
        TemplateunitCurrHp.setColumns(5);
        TemplateunitCurrHp.setEditable(false);
        JTextField Templatekpsiecz = new JTextField("AC Slash");
        Templatekpsiecz.setColumns(5);
        Templatekpsiecz.setEditable(false);
        JTextField Templatekpobuch = new JTextField("AC Blund");
        Templatekpobuch.setColumns(5);
        Templatekpobuch.setEditable(false);
        JTextField Templatekpklot = new JTextField("AC Pierc");
        Templatekpklot.setColumns(5);
        Templatekpklot.setEditable(false);
        JTextField Templatespeed = new JTextField("Speed");
        Templatespeed.setColumns(5);
        Templatespeed.setEditable(false);
        JTextField Templatemana = new JTextField("Mana");
        Templatemana.setColumns(5);
        Templatemana.setEditable(false);
        JTextArea Templatestatuses = new JTextArea("Statuses");
        Templatestatuses.setLineWrap(true);
        Templatestatuses.setWrapStyleWord(true);
        Templatestatuses.setEditable(false);
        JButton Templatedelete = new JButton("Delete");
        Templatedelete.setEnabled(false);
        JButton Templatedetails = new JButton("Details");
        Templatedetails.setEnabled(false);
        JButton Templatecopy = new JButton("Copy");
        Templatecopy.setEnabled(false);
        JTextField TemplatedmgDelt = new JTextField("How much dmg");
        TemplatedmgDelt.setColumns(8);
        TemplatedmgDelt.setEnabled(false);
        JTextField TemplatedmgMultip = new JTextField("How many times");
        TemplatedmgMultip.setColumns(8);
        TemplatedmgMultip.setEnabled(false);
        JLabel TemplateadvatangeLabel = new JLabel("Advantage");
        TemplateadvatangeLabel.setEnabled(false);
        JCheckBox Templateadvantage = new JCheckBox();
        Templateadvantage.setEnabled(false);
        JLabel TemplatedissadvantageLabel = new JLabel("DisAdvantage");
        TemplatedissadvantageLabel.setEnabled(false);
        JCheckBox Templatedissadvantage = new JCheckBox();
        Templatedissadvantage.setEnabled(false);
        JButton TemplateDealButton = new JButton("Deal dmg");
        TemplateDealButton.setEnabled(false);
        template.add(Templateinitiative);
        template.add(Templatename);
        template.add(Templateattacks);
        template.add(TemplateunitHp);
        template.add(TemplateMorale);
        template.add(TemplateunitAmount);
        template.add(TemplateunitCurrHp);
        template.add(Templatekpsiecz);
        template.add(Templatekpobuch);
        template.add(Templatekpklot);
        template.add(Templatespeed);
        template.add(Templatemana);
        template.add(Templatestatuses);
        template.add(Templatedelete);
        template.add(Templatedetails);
        template.add(Templatecopy);
        template.add(TemplatedmgDelt);
        template.add(TemplatedmgMultip);
        template.add(TemplateadvatangeLabel);
        template.add(Templateadvantage);
        template.add(TemplatedissadvantageLabel);
        template.add(Templatedissadvantage);
        template.add(TemplateDealButton);
        BeastsTemplate.add(template);
        BeastsTemplate.revalidate();
        //TODO w dół wszystko zmieniać
        AddButton.addActionListener(e -> {
            addBeastToFray(new Beast(), false, true);
            CreaturesPane.revalidate();
        });
        SortByGroup.addActionListener(e -> {
            reset();
            currentBattle = currentBattle.stream().sorted(Comparator.comparingInt(Beast::getInit)).collect(Collectors.toList());
            currentBattle.forEach(beast -> addBeastToFray(beast, true, false));
            CreaturesPane.revalidate();
        });
        ShowListButton.addActionListener(e -> CreatureListPane.setVisible(!CreatureListPane.isVisible()));
        CreatureListTemplate.setLayout(new BoxLayout(CreatureListTemplate, BoxLayout.PAGE_AXIS));
        JPanel templateLineBeast = new JPanel(new FlowLayout());
        JTextField name = new JTextField("Name");
        name.setEnabled(false);
        JTextField level = new JTextField("Level");
        level.setEnabled(false);
        JTextField classs = new JTextField("Class");
        classs.setEnabled(false);
        JTextField race = new JTextField("Race");
        race.setEnabled(false);
        JTextField aligment = new JTextField("Alignment");
        aligment.setEnabled(false);
        JTextField size = new JTextField("Size");
        size.setEnabled(false);
        JButton addToFray = new JButton("Add to battle");
        addToFray.setEnabled(false);
        templateLineBeast.add(name);
        templateLineBeast.add(level);
        templateLineBeast.add(classs);
        templateLineBeast.add(race);
        templateLineBeast.add(aligment);
        templateLineBeast.add(size);
        templateLineBeast.add(addToFray);
        CreatureListTemplate.add(templateLineBeast);
        CreatureListTemplate.revalidate();
        CreaturesListPane.setLayout(new BoxLayout(CreaturesListPane, BoxLayout.PAGE_AXIS));
        beastSideList.addAll(beastList.beasts);
        readSideList();
        FilterListButton.addActionListener(e -> {
            if (!filtered) {
                filtered = true;
            }
            switch (FilterOption.getSelectedItem().toString()) {
                case "Name" -> beastSideList = beastSideList.stream()
                        .filter(beast -> beast.getName().contains(FilterText.getText()))
                        .collect(Collectors.toList());
                case "Level" -> beastSideList = beastSideList.stream()
                        .filter(beast -> beast.getLevel().contains(FilterText.getText()))
                        .collect(Collectors.toList());
                case "Class" -> beastSideList = beastSideList.stream()
                        .filter(beast -> beast.getClasss().contains(FilterText.getText()))
                        .collect(Collectors.toList());
                case "Race" -> beastSideList = beastSideList.stream()
                        .filter(beast -> beast.getRace().contains(FilterText.getText()))
                        .collect(Collectors.toList());
                case "Aligment" -> beastSideList = beastSideList.stream()
                        .filter(beast -> beast.getAligment().contains(FilterText.getText()))
                        .collect(Collectors.toList());
                case "Size" -> beastSideList = beastSideList.stream()
                        .filter(beast -> beast.getSize().contains(FilterText.getText()))
                        .collect(Collectors.toList());
            }
            resetSideList();
            readSideList();
        });
        SortListButton.addActionListener(e -> {
            if (!filtered) {
                filtered = true;
            }
            switch (FilterOption.getSelectedItem().toString()) {
                case "Name" -> beastSideList = beastSideList.stream()
                        .sorted(Comparator.comparing(Beast::getName))
                        .collect(Collectors.toList());
                case "Level" -> beastSideList = beastSideList.stream()
                        .sorted(Comparator.comparing(Beast::getLevel))
                        .collect(Collectors.toList());
                case "Class" -> beastSideList = beastSideList.stream()
                        .sorted(Comparator.comparing(Beast::getClasss))
                        .collect(Collectors.toList());
                case "Race" -> beastSideList = beastSideList.stream()
                        .sorted(Comparator.comparing(Beast::getRace))
                        .collect(Collectors.toList());
                case "Aligment" -> beastSideList = beastSideList.stream()
                        .sorted(Comparator.comparing(Beast::getAligment))
                        .collect(Collectors.toList());
                case "Size" -> beastSideList = beastSideList.stream()
                        .sorted(Comparator.comparing(Beast::getSize))
                        .collect(Collectors.toList());
            }
            resetSideList();
            readSideList();
        });
        ResetListButton.addActionListener(e -> {
            if (filtered) {
                beastSideList.clear();
                beastSideList.addAll(beastList.beasts);
                filtered = false;
                resetSideList();
                readSideList();
            }
        });
    }

    private void readSideList() {
        beastSideList.forEach(beast -> {
            JPanel newLineBeast = new JPanel(new FlowLayout());
            JTextField name = new JTextField(beast.getName());
            name.setEnabled(false);
            JTextField level = new JTextField(beast.getLevel());
            level.setEnabled(false);
            JTextField classs = new JTextField(beast.getClasss());
            classs.setEnabled(false);
            JTextField race = new JTextField(beast.getRace());
            race.setEnabled(false);
            JTextField aligment = new JTextField(beast.getAligment());
            aligment.setEnabled(false);
            JTextField size = new JTextField(beast.getSize());
            size.setEnabled(false);
            JButton addToFray = new JButton("Add to battle");
            addToFray.addActionListener(e -> {
                addBeastToFray(beast, true, true);
                CreaturesPane.revalidate();
            });
            newLineBeast.add(name);
            newLineBeast.add(level);
            newLineBeast.add(classs);
            newLineBeast.add(race);
            newLineBeast.add(aligment);
            newLineBeast.add(size);
            newLineBeast.add(addToFray);
            CreaturesListPane.add(newLineBeast);
        });
    }

    public void addBeastToFray(Beast readBeast, boolean reading, boolean saving) {
        final Beast[] beast = {readBeast};
        if (!Objects.equals(monsterComboBox.getSelectedItem(), "") && !reading) {
            try {
                beast[0] = beastList.beasts.stream()
                        .filter(beast1 -> beast1.getName().equals(monsterComboBox.getSelectedItem().toString()))
                        .findFirst()
                        .orElseThrow(() -> null);
            } catch (Throwable ex) {
                System.out.println("Error in finding beast: " + ex.getMessage());
            }
        }
        //Można, zamiast robić 'vektor' na zwierze to zrobić nowe i przepisać wszystkie pola co są potrzebne do detali do niego.
        JPanel newBeast = new JPanel();
        newBeast.setLayout(new FlowLayout());
        JTextField initiative = new JTextField(beast[0].getInit() + "");
        initiative.setColumns(5);
        JTextField name = new JTextField(beast[0].getName() + "");
        name.setColumns(10);
        JTextArea attacks = new JTextArea(beast[0].getAnS() + "");
        attacks.setLineWrap(true);
        attacks.setWrapStyleWord(true);
        JTextField maxhp = new JTextField(beast[0].getMaxhp() + "");
        maxhp.setColumns(5);
        JTextField morale = new JTextField("");
        morale.setColumns(5);
        JTextField unitAmount = new JTextField("");
        unitAmount.setColumns(5);
        JTextField curhp = new JTextField("");
        curhp.setColumns(5);
        JTextField kpsiecz = new JTextField(beast[0].getkPSieczne() + "");
        kpsiecz.setColumns(5);
        JTextField kpobuch = new JTextField(beast[0].getkPObuch() + "");
        kpobuch.setColumns(5);
        JTextField kpklot = new JTextField(beast[0].getkPKlote() + "");
        kpklot.setColumns(5);
        JTextField speed = new JTextField(beast[0].getSpeed() + "");
        speed.setColumns(5);
        JTextField mana = new JTextField(beast[0].getMana() + "");
        mana.setColumns(5);
        JTextArea statuses = new JTextArea("");
        statuses.setLineWrap(true);
        statuses.setWrapStyleWord(true);
        JButton delete = new JButton("Delete");
        Beast finalBeast = beast[0];
        delete.addActionListener(e1 -> {
            currentBattle.remove(finalBeast);
            CreaturesPane.remove(newBeast);
            CreaturesPane.revalidate();
        });
        JButton details = new JButton("Details");
        details.addActionListener(e1 -> {
            JFrame combatTracker = new JFrame();
            BeastDetails panel;
            panel = new BeastDetails(finalBeast);
            combatTracker.setContentPane(panel.getDetails());
            combatTracker.setDefaultCloseOperation(combatTracker.DISPOSE_ON_CLOSE);
            combatTracker.setSize(1100, 500);
            combatTracker.setVisible(true);
        });
        JButton copy = new JButton("Copy");
        copy.addActionListener(e1 -> {
            JPanel copyPanel = new JPanel();
            copyPanel.setLayout(new FlowLayout());
            Beast copyBeast = new Beast();
            JTextField Copyinitiative = new JTextField(initiative.getText());
            Copyinitiative.setColumns(5);
            JTextField Copyname = new JTextField(name.getText());
            Copyname.setColumns(10);
            JTextArea Copyattacks = new JTextArea(attacks.getText());
            Copyattacks.setLineWrap(true);
            Copyattacks.setWrapStyleWord(true);
            JTextField Copymaxhp = new JTextField(maxhp.getText());
            Copymaxhp.setColumns(5);
            JTextField Copymorale = new JTextField(morale.getText());
            Copymorale.setColumns(5);
            JTextField CopyunitAmount = new JTextField(unitAmount.getText());
            CopyunitAmount.setColumns(5);
            JTextField Copycurhp = new JTextField(curhp.getText());
            Copycurhp.setColumns(5);
            JTextField Copykpsiecz = new JTextField(kpsiecz.getText());
            Copykpsiecz.setColumns(5);
            JTextField Copykpobuch = new JTextField(kpobuch.getText());
            Copykpobuch.setColumns(5);
            JTextField Copykpklot = new JTextField(kpklot.getText());
            Copykpklot.setColumns(5);
            JTextField Copyspeed = new JTextField(speed.getText());
            Copyspeed.setColumns(5);
            JTextField Copymana = new JTextField(mana.getText());
            Copymana.setColumns(5);
            JTextArea Copystatuses = new JTextArea(statuses.getText());
            Copystatuses.setLineWrap(true);
            Copystatuses.setWrapStyleWord(true);
            JButton Copydelete = new JButton("Delete");
            Copydelete.addActionListener(e2 -> {
                currentBattle.remove(copyBeast);
                CreaturesPane.remove(copyPanel);
                CreaturesPane.revalidate();
            });
            JTextField CopydmgDelt = new JTextField();
            CopydmgDelt.setColumns(8);
            JTextField CopydmgMultip = new JTextField("");
            CopydmgMultip.setColumns(8);
            JLabel CopyadvatangeLabel = new JLabel("Advantage");
            JCheckBox Copyadvantage = new JCheckBox();
            JLabel CopydissadvantageLabel = new JLabel("DisAdvantage");
            JCheckBox Copydissadvantage = new JCheckBox();
            JButton CopydmgDeltButton = new JButton("Deal dmg");
            CopydmgDeltButton.addActionListener(e -> rollForDmg(true, CopydmgDelt, Copymaxhp, Copycurhp, CopyunitAmount, CopydmgMultip, Copyadvantage, Copydissadvantage));
            copyPanel.add(Copyinitiative);
            copyPanel.add(Copyname);
            copyPanel.add(Copyattacks);
            copyPanel.add(Copymaxhp);
            copyPanel.add(Copymorale);
            copyPanel.add(CopyunitAmount);
            copyPanel.add(Copycurhp);
            copyPanel.add(Copykpsiecz);
            copyPanel.add(Copykpobuch);
            copyPanel.add(Copykpklot);
            copyPanel.add(Copyspeed);
            copyPanel.add(Copymana);
            copyPanel.add(Copystatuses);
            copyPanel.add(Copydelete);
            copyPanel.add(CopydmgDelt);
            copyPanel.add(CopydmgMultip);
            copyPanel.add(CopyadvatangeLabel);
            copyPanel.add(Copyadvantage);
            copyPanel.add(CopydissadvantageLabel);
            copyPanel.add(Copydissadvantage);
            copyPanel.add(CopydmgDeltButton);
            currentBattle.add(copyBeast);
            CreaturesPane.add(copyPanel);
            CreaturesPane.revalidate();
        });
        JTextField dmgDelt = new JTextField();
        dmgDelt.setColumns(8);
        JTextField dmgMultip = new JTextField("");
        dmgMultip.setColumns(8);
        JLabel advatangeLabel = new JLabel("Advantage");
        JCheckBox advantage = new JCheckBox();
        JLabel dissadvantageLabel = new JLabel("DisAdvantage");
        JCheckBox dissadvantage = new JCheckBox();
        JButton dmgDeltButton = new JButton("Deal dmg");
        //TODO update for mass combat
        dmgDeltButton.addActionListener(e -> rollForDmg(true, dmgDelt, maxhp, curhp, unitAmount, dmgMultip, advantage, dissadvantage));
        newBeast.add(initiative);
        newBeast.add(name);
        newBeast.add(attacks);
        newBeast.add(maxhp);
        newBeast.add(morale);
        newBeast.add(unitAmount);
        newBeast.add(curhp);
        newBeast.add(kpsiecz);
        newBeast.add(kpobuch);
        newBeast.add(kpklot);
        newBeast.add(speed);
        newBeast.add(mana);
        newBeast.add(statuses);
        newBeast.add(delete);
        newBeast.add(details);
        newBeast.add(copy);
        newBeast.add(dmgDelt);
        newBeast.add(dmgMultip);
        newBeast.add(advatangeLabel);
        newBeast.add(advantage);
        newBeast.add(dissadvantageLabel);
        newBeast.add(dissadvantage);
        newBeast.add(dmgDeltButton);
        if (saving) currentBattle.add(beast[0]);
        CreaturesPane.add(newBeast);
    }

    public void rollForDmg(boolean isFirstTime, JTextField dmgDelt, JTextField maxhp, JTextField curhp, JTextField unitAmount, JTextField dmgMultip, JCheckBox advantage, JCheckBox disadvantage) {
        try {
            Random random = new Random();
            int dmg = Integer.parseInt(dmgDelt.getText());
            int oneUnitMaxHp = Integer.parseInt(maxhp.getText());
            String curHpString = curhp.getText();
            int hp;
            if (curHpString == null || curHpString.equals("")) {
                hp = oneUnitMaxHp * Integer.parseInt(unitAmount.getText());
            } else {
                hp = Integer.parseInt(curHpString);
            }
            final int[] howManyAttacks = new int[1];
            if (dmgMultip.getText() == null || dmgMultip.getText().equals("") || !isFirstTime) {
                howManyAttacks[0] = random.nextInt(Integer.parseInt(unitAmount.getText())) + 1;
            } else {
                howManyAttacks[0] = Integer.parseInt(dmgMultip.getText());
            }
            dmgMultip.setText(howManyAttacks[0] + "");
            ExecutorService executor = Executors.newFixedThreadPool(1);
            CompletableFuture.runAsync(() -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    if (advantage.isSelected() && !disadvantage.isSelected()) {
                        int secondAmount = random.nextInt(Integer.parseInt(unitAmount.getText())) + 1;
                        dmgMultip.setText(secondAmount + "");
                        TimeUnit.SECONDS.sleep(1);
                        if (howManyAttacks[0] < secondAmount) howManyAttacks[0] = secondAmount;
                        dmgMultip.setText(howManyAttacks[0] + "");
                        curhp.setText(hp - (dmg * howManyAttacks[0]) + "");
                        unitAmount.setText((int) (Math.ceil(Double.parseDouble(curhp.getText()) / (double) oneUnitMaxHp)) + "");
                    } else if (disadvantage.isSelected() && !advantage.isSelected()) {
                        int secondAmount = random.nextInt(Integer.parseInt(unitAmount.getText())) + 1;
                        dmgMultip.setText(secondAmount + "");
                        TimeUnit.SECONDS.sleep(1);
                        if (howManyAttacks[0] > secondAmount) howManyAttacks[0] = secondAmount;
                        dmgMultip.setText(howManyAttacks[0] + "");
                        curhp.setText(hp - (dmg * howManyAttacks[0]) + "");
                        unitAmount.setText((int) (Math.ceil(Double.parseDouble(curhp.getText()) / (double) oneUnitMaxHp)) + "");
                    } else {
                        dmgMultip.setText(howManyAttacks[0] + "");
                        curhp.setText(hp - (dmg * howManyAttacks[0]) + "");
                        unitAmount.setText((int) (Math.ceil(Double.parseDouble(curhp.getText()) / (double) oneUnitMaxHp)) + "");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, executor);
            executor.shutdown();
        } catch (NumberFormatException exception) {
            dmgDelt.setText("Can't convert hp to number");
        }
    }

    //TODO no way to save morales, unit amounts, curHps and statuses when reseting.
    public void reset() {
        Component[] components = CreaturesPane.getComponents();
        List<String> initiatives = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<String> attacks = new ArrayList<>();
        List<String> maxhps = new ArrayList<>();
        List<String> morales = new ArrayList<>();
        List<String> unitAmounts = new ArrayList<>();
        List<String> curHps = new ArrayList<>();
        List<String> kpsieczs = new ArrayList<>();
        List<String> kpobuchs = new ArrayList<>();
        List<String> kpklots = new ArrayList<>();
        List<String> speeds = new ArrayList<>();
        List<String> manas = new ArrayList<>();
        List<String> statuses = new ArrayList<>();
        for (Component component : components) {
            JPanel beast = (JPanel) component;
            Component[] stats = beast.getComponents();
            JTextField init = (JTextField) stats[0];
            initiatives.add(init.getText());
            init = (JTextField) stats[1];
            names.add(init.getText());
            JTextArea atak = (JTextArea) stats[2];
            attacks.add(atak.getText());
            init = (JTextField) stats[3];
            maxhps.add(init.getText());
            init = (JTextField) stats[4];
            morales.add(init.getText());
            init = (JTextField) stats[5];
            unitAmounts.add(init.getText());
            init = (JTextField) stats[6];
            curHps.add(init.getText());
            init = (JTextField) stats[7];
            kpsieczs.add(init.getText());
            init = (JTextField) stats[8];
            kpobuchs.add(init.getText());
            init = (JTextField) stats[9];
            kpklots.add(init.getText());
            init = (JTextField) stats[10];
            speeds.add(init.getText());
            init = (JTextField) stats[11];
            manas.add(init.getText());
            atak = (JTextArea) stats[12];
            statuses.add(atak.getText());
        }
        for (int i = 0; i < currentBattle.size(); i++) {
            currentBattle.get(i).setInit(Integer.parseInt(initiatives.get(i)));
            currentBattle.get(i).setName(names.get(i));
            currentBattle.get(i).setAnS(attacks.get(i));
            currentBattle.get(i).setMaxhp(Integer.parseInt(maxhps.get(i)));
            currentBattle.get(i).setkPSieczne(Integer.parseInt(kpsieczs.get(i)));
            currentBattle.get(i).setkPObuch(Integer.parseInt(kpobuchs.get(i)));
            currentBattle.get(i).setkPKlote(Integer.parseInt(kpklots.get(i)));
            currentBattle.get(i).setSpeed(Integer.parseInt(speeds.get(i)));
            currentBattle.get(i).setMana(Integer.parseInt(manas.get(i)));
        }

        for (Component component : CreaturesPane.getComponents()) {
            CreaturesPane.remove(component);
        }
        CreaturesPane.revalidate();
    }

    public void resetSideList() {
        for (Component component : CreaturesListPane.getComponents()) {
            CreaturesListPane.remove(component);
        }
        CreaturesListPane.revalidate();
    }

    public JPanel getTracker() {
        return Tracker;
    }
}

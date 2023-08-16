package com.as.casting;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.util.Comparator;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Spellbook {
    private JTabbedPane Circles;
    private JPanel Book;
    private JPanel Cantrips;
    private JPanel First;
    private JPanel Second;
    private JPanel Thrid;
    private JPanel Fourth;
    private JPanel Fifth;
    private JPanel Sixth;
    private JPanel Seventh;
    private JPanel Eighth;
    private JPanel Ninth;
    private JPanel Buttons;
    private JScrollPane FirstScroll;
    private JPanel FirstPane;
    private JToolBar ToolBar;
    private JButton SaveSpells;
    private JPanel CantripPane;
    private JPanel SecondPane;
    private JPanel ThirdPane;
    private JPanel FourthPane;
    private JPanel FifthPane;
    private JPanel SixthPane;
    private JPanel SeventhPane;
    private JPanel EighthPane;
    private JPanel NinthPane;
    private JButton ReadSpellsFromFile;
    private JButton FilterButton;
    private JComboBox FilterOption;
    private JButton ResetButton;
    private JTextField FilterText;
    private JButton SortButton;
    private SpellBooks spellBooks;
    private SpellBooks originalBook = new SpellBooks();
    private boolean filtered = false;
    //Schools of magic, made custom to out dnd, you can change naming as you like in here
    private static final String[] schools = {"",
            "Destrukcji",
            "Kontroli",
            "Paktu",
            "Sprowadzenia",
            "Przenoszenia",
            "Obrony",
            "Negacji",
            "Witalności",
            "Zrozumienia",
            "Prawdziwej Wizji",
            "Psychiki",
            "Wzmocnienia",
            "Związania",
            "Cienia",
            "Mirażu",
            "Konfuzji",
            "Krwi",
            "Animacji",
            "Zniszczenia",
            "Formy",
            "Przekształcenia",
            "Grawitacji"
    };
    //Element of spell, in original dnd5e it doesn't exists so you can just use empty string: "" or delete every string besides it.
    private static final String[] elementals = {"",
            "Ogień",
            "Woda",
            "Ziemia",
            "Powietrze",
            "Jasność",
            "Ciemność",
            "Para",
            "Lawa",
            "Dym",
            "Blask",
            "Chaos",
            "Błoto",
            "Lód",
            "Życiodajność",
            "Krew",
            "Piasek",
            "Bariera",
            "Korupcja",
            "Dźwięk",
            "Błyskawica",
            "Neutralny",
            "Metal",
            "Mróźny Płomień",
            "Plasma",
            "Wrząca Krew",
            "Popiół",
            "Eksplozja",
            "Piekielny Ogień",
            "Święty Ogień",
            "Ognista Burza",
            "Czarny Płomień",
            "Trucizna",
            "Drewno",
            "Kwas",
            "Grzyby",
            "Trupia Mgła",
            "Psychika",
            "Grawitacja",
            "Rozkład",
            "Kryształ",
            "Moc Astralna"
    };
    private static final java.lang.reflect.Type SPELL_TYPE = new TypeToken<SpellBooks>() {
    }.getType();

    public Spellbook() {
        spellBooks = new SpellBooks();
        config();
    }

    public Spellbook(SpellBooks spellBooks) {
        this.spellBooks = spellBooks;
        config();
        readSpells();
    }

    private void config() {
        Component[] panels = Circles.getComponents();
        int level = 0;
        for (Component Jcomponent : panels) {
            JPanel circle = (JPanel) Jcomponent;
            Component[] Jcomponents = circle.getComponents();
            JPanel buttons = (JPanel) Jcomponents[0];
            buttons.setLayout(new FlowLayout());
            JTextField addName = new JTextField("Name");
            addName.setColumns(10);
            JButton addButton = new JButton("Add Spell");
            JScrollPane spellScroll = (JScrollPane) Jcomponents[1];
            Component[] listcomponents = spellScroll.getComponents();
            JViewport viewport = (JViewport) listcomponents[0];
            JPanel spellPane = (JPanel) viewport.getView();

            spellPane.setLayout(new BoxLayout(spellPane, BoxLayout.PAGE_AXIS));

            int circleLevel = level;
            addButton.addActionListener(e -> {
                JPanel newSpell = new JPanel();
                newSpell.setLayout(new FlowLayout());
                JTextField id = new JTextField("");
                id.setVisible(false);
                JTextField name = new JTextField(addName.getText());
                name.setColumns(10);
                if (name.getText().isEmpty()) name.setText("Name");
                JComboBox<String> school = new JComboBox<>(schools);
                JTextArea classes = new JTextArea("Classes");
                classes.setColumns(10);
                classes.setLineWrap(true);
                classes.setWrapStyleWord(true);
                classes.setEditable(false);
                JComboBox<String> elemental = new JComboBox<>(elementals);
                JTextField castTime = new JTextField();
                castTime.setColumns(8);
                castTime.setText("Cast time");
                JTextField range = new JTextField();
                range.setColumns(8);
                range.setText("Range");
                JTextField duration = new JTextField();
                duration.setColumns(8);
                duration.setText("Duration");
                JTextField components = new JTextField();
                components.setColumns(8);
                components.setText("Components");
                JTextField manacost = new JTextField();
                manacost.setColumns(8);
                manacost.setText("Mana cost");
                JButton zapisz = new JButton("Save");
                zapisz.addActionListener(zap -> {
                    try {
                        saveChanges(circleLevel, id.getText(), name, school, castTime, range, duration, components, manacost, elemental);
                    } catch (Throwable ex) {
                        //System.out.println("Error: " + ex.getMessage() + "\nCause: " + ex.getCause());
                        ex.printStackTrace();
                    }
                });
                JButton usun = new JButton("Delete");
                usun.addActionListener(del -> {
                    spellBooks.book.get(circleLevel).removeSpell(id.getText());
                    spellPane.remove(newSpell);
                    spellPane.revalidate();
                });
                JButton szczegoly = new JButton("Details");
                szczegoly.addActionListener(szcz -> {
                    JFrame spelldetail = new JFrame();
                    SpellsDetails panel = null;
                    try {
                        panel = new SpellsDetails(spellBooks, circleLevel, id.getText());
                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                    spelldetail.setContentPane(panel.getDetail());
                    spelldetail.setDefaultCloseOperation(spelldetail.DISPOSE_ON_CLOSE);
                    spelldetail.setSize(500, 500);
                    spelldetail.setVisible(true);
                    //new spell details panel
                });
                SpellDetails spellT = new SpellDetails(name.getText(),
                        manacost.getText(),
                        school.getSelectedItem().toString(),
                        castTime.getText(),
                        range.getText(),
                        duration.getText(),
                        components.getText(),
                        new ArrayList<>(),
                        circleLevel,
                        "",
                        elemental.getSelectedItem().toString());
                spellBooks.book.get(circleLevel).spells.add(spellT);
                id.setText(spellT.getId().toString());
                newSpell.add(id);
                newSpell.add(name);
                newSpell.add(school);
                newSpell.add(classes);
                newSpell.add(elemental);
                newSpell.add(castTime);
                newSpell.add(range);
                newSpell.add(duration);
                newSpell.add(components);
                newSpell.add(manacost);
                newSpell.add(zapisz);
                newSpell.add(szczegoly);
                newSpell.add(usun);
                spellPane.add(newSpell);
                spellPane.revalidate();
            });
            buttons.add(addName);
            buttons.add(addButton);
            buttons.revalidate();
            level++;
        }
        SaveSpells.addActionListener(e -> {
            try {
                saveSpells();
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage() + "\nCause: " + ex.getCause());
            }
        });
        ReadSpellsFromFile.addActionListener(e -> {
            try {
                reset();
                spellBooks = readSpellsFromFile();
                readSpells();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        FilterButton.addActionListener(e -> {
            if (!filtered) {
                spellBooks.book.forEach(circleDetails -> originalBook.book.get(circleDetails.getLevel()).spells.addAll(circleDetails.spells));
                filtered = true;
            }
            spellBooks.book.forEach(circleDetails -> {
                switch (FilterOption.getSelectedItem().toString()) {
                    case "Name" -> circleDetails.spells = circleDetails.spells.stream()
                            .filter(spellDetails -> spellDetails.getName().contains(FilterText.getText()))
                            .collect(Collectors.toList());
                    case "Class" -> circleDetails.spells = circleDetails.spells.stream()
                            .filter(spellDetails -> {
                                for (String detailsClass : spellDetails.getClasses()) {
                                    if (detailsClass.contains(FilterText.getText())) return true;
                                }
                                return false;
                            })
                            .collect(Collectors.toList());
                    case "School" -> circleDetails.spells = circleDetails.spells.stream()
                            .filter(spellDetails -> spellDetails.getSchool().contains(FilterText.getText()))
                            .collect(Collectors.toList());
                    case "Cast Time" -> circleDetails.spells = circleDetails.spells.stream()
                            .filter(spellDetails -> spellDetails.getCastTime().contains(FilterText.getText()))
                            .collect(Collectors.toList());
                    case "Range" -> circleDetails.spells = circleDetails.spells.stream()
                            .filter(spellDetails -> spellDetails.getRange().contains(FilterText.getText()))
                            .collect(Collectors.toList());
                    case "Duration" -> circleDetails.spells = circleDetails.spells.stream()
                            .filter(spellDetails -> spellDetails.getDuration().contains(FilterText.getText()))
                            .collect(Collectors.toList());
                    case "Components" -> circleDetails.spells = circleDetails.spells.stream()
                            .filter(spellDetails -> spellDetails.getComponents().contains(FilterText.getText()))
                            .collect(Collectors.toList());
                    case "Element" -> circleDetails.spells = circleDetails.spells.stream()
                            .filter(spellDetails -> spellDetails.getElemental().contains(FilterText.getText()))
                            .collect(Collectors.toList());
                }
            });
            reset();
            readSpells();
        });
        SortButton.addActionListener(e -> {
            if (!filtered) {
                spellBooks.book.forEach(circleDetails -> originalBook.book.get(circleDetails.getLevel()).spells.addAll(circleDetails.spells));
                filtered = true;
            }
            spellBooks.book.forEach(circleDetails -> {
                switch (FilterOption.getSelectedItem().toString()) {
                    case "Name" -> circleDetails.spells = circleDetails.spells.stream()
                            .sorted(Comparator.comparing(SpellDetails::getName))
                            .collect(Collectors.toList());
                    case "Class" -> circleDetails.spells = circleDetails.spells.stream()
                            .sorted((spell1, spell2) -> {
                                if (spell1.getClasses().isEmpty() || spell2.getClasses().isEmpty())
                                    return -1; //-1 to spelle bez nazw na dole 1 to u góry
                                spell1.getClasses().sort(String::compareTo);
                                spell2.getClasses().sort(String::compareTo);
                                return spell1.getClasses().get(0).compareTo(spell2.getClasses().get(0));
                            })
                            .collect(Collectors.toList());
                    case "School" -> circleDetails.spells = circleDetails.spells.stream()
                            .sorted(Comparator.comparing(SpellDetails::getSchool))
                            .collect(Collectors.toList());
                    case "Cast Time" -> circleDetails.spells = circleDetails.spells.stream()
                            .sorted(Comparator.comparing(SpellDetails::getCastTime))
                            .collect(Collectors.toList());
                    case "Range" -> circleDetails.spells = circleDetails.spells.stream()
                            .sorted(Comparator.comparing(SpellDetails::getRange))
                            .collect(Collectors.toList());
                    case "Duration" -> circleDetails.spells = circleDetails.spells.stream()
                            .sorted(Comparator.comparing(SpellDetails::getDuration))
                            .collect(Collectors.toList());
                    case "Components" -> circleDetails.spells = circleDetails.spells.stream()
                            .sorted(Comparator.comparing(SpellDetails::getComponents))
                            .collect(Collectors.toList());
                    case "Element" -> circleDetails.spells = circleDetails.spells.stream()
                            .sorted(Comparator.comparing(SpellDetails::getElemental))
                            .collect(Collectors.toList());
                }
            });
            reset();
            readSpells();
        });
        ResetButton.addActionListener(e -> {
            if (filtered) {
                spellBooks = originalBook;
                originalBook = new SpellBooks();
                filtered = false;
                reset();
                readSpells();
            }
        });
    }

    private void reset() {
        Component[] panels = Circles.getComponents();
        for (Component Jcomponent : panels) {
            JPanel circle = (JPanel) Jcomponent;
            Component[] Jcomponents = circle.getComponents();
            JScrollPane spellListScroll = (JScrollPane) Jcomponents[1];
            Component[] listcomponents = spellListScroll.getComponents();
            JViewport viewport = (JViewport) listcomponents[0];
            JPanel spellList = (JPanel) viewport.getView();
            Component[] spellsInCircle = spellList.getComponents();
            for (Component onespell : spellsInCircle) {
                JPanel onespell2 = (JPanel) onespell;
                spellList.remove(onespell2);
            }
            spellList.revalidate();
        }
    }

    private void readSpells() {
        List<CircleDetails> circles = spellBooks.book;
        for (CircleDetails circle : circles) {
            int level = circle.getLevel();
            for (SpellDetails spellR : circle.spells) {
                JPanel spell = new JPanel();
                spell.setLayout(new FlowLayout());
                JTextField id = new JTextField("" + spellR.getId());
                id.setVisible(false);
                JTextField spellName = new JTextField(spellR.getName());
                spellName.setColumns(10);
                JComboBox<String> school = new JComboBox<>(schools);
                school.setSelectedItem(spellR.getSchool());
                JTextArea classes = new JTextArea();
                spellR.getClasses().forEach(classs -> {
                    if (classes.getText().equals("")) {
                        classes.setText(classs);
                    } else {
                        classes.setText(classes.getText() + "\n" + classs);
                    }
                });
                classes.setColumns(10);
                classes.setLineWrap(true);
                classes.setWrapStyleWord(true);
                classes.setEditable(false);
                JComboBox<String> elemental = new JComboBox<>(elementals);
                elemental.setSelectedItem(spellR.getElemental());
                JTextField castTime = new JTextField(spellR.getCastTime());
                castTime.setColumns(8);
                JTextField range = new JTextField(spellR.getRange());
                range.setColumns(8);
                JTextField duration = new JTextField(spellR.getDuration());
                duration.setColumns(8);
                JTextField components = new JTextField(spellR.getComponents());
                components.setColumns(8);
                JTextField manaCost = new JTextField(spellR.getManaCost());
                manaCost.setColumns(8);
                JButton zapisz = new JButton("Save");
                zapisz.addActionListener(zap -> {
                    try {
                        saveChanges(level, id.getText(), spellName, school, castTime, range, duration, components, manaCost, elemental);
                    } catch (Throwable ex) {
                        //System.out.println("Error: " + ex.getMessage() + "\nCause: " + ex.getCause());
                        ex.printStackTrace();
                    }
                });
                spell.add(id);
                spell.add(spellName);
                spell.add(school);
                spell.add(classes);
                spell.add(elemental);
                spell.add(castTime);
                spell.add(range);
                spell.add(duration);
                spell.add(components);
                spell.add(manaCost);
                spell.add(zapisz);
                JButton usunspell = new JButton("Delete");
                JButton wybierzspell = new JButton("Details");
                switch (level) {
                    case 0 -> makeSpell(spell, usunspell, CantripPane, level, id.getText(), wybierzspell);
                    case 1 -> makeSpell(spell, usunspell, FirstPane, level, id.getText(), wybierzspell);
                    case 2 -> makeSpell(spell, usunspell, SecondPane, level, id.getText(), wybierzspell);
                    case 3 -> makeSpell(spell, usunspell, ThirdPane, level, id.getText(), wybierzspell);
                    case 4 -> makeSpell(spell, usunspell, FourthPane, level, id.getText(), wybierzspell);
                    case 5 -> makeSpell(spell, usunspell, FifthPane, level, id.getText(), wybierzspell);
                    case 6 -> makeSpell(spell, usunspell, SixthPane, level, id.getText(), wybierzspell);
                    case 7 -> makeSpell(spell, usunspell, SeventhPane, level, id.getText(), wybierzspell);
                    case 8 -> makeSpell(spell, usunspell, EighthPane, level, id.getText(), wybierzspell);
                    case 9 -> makeSpell(spell, usunspell, NinthPane, level, id.getText(), wybierzspell);
                }
            }
        }
    }

    private void makeSpell(JPanel what, JButton action, JPanel where, int level, String id, JButton chose) {
        action.addActionListener(e -> {
            where.remove(what);
            spellBooks.book.get(level).removeSpell(id);
            where.revalidate();
        });
        chose.addActionListener(e -> {
            JFrame spelldetail = new JFrame();
            SpellsDetails panel = null;
            try {
                panel = new SpellsDetails(spellBooks, level, id);
            } catch (Throwable ex) {
                ex.printStackTrace();
            }
            spelldetail.setContentPane(panel.getDetail());
            spelldetail.setDefaultCloseOperation(spelldetail.DISPOSE_ON_CLOSE);
            spelldetail.setSize(700, 600);
            spelldetail.setVisible(true);
            //Odnośnik do zaklęcia w spellbook
        });
        what.add(chose);
        what.add(action);
        where.add(what);
        where.revalidate();
    }

    public void saveSpells() throws IOException {
        try {
            Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
            Writer writer = new FileWriter("spells.json");
            prettyGson.toJson(spellBooks, writer);
            writer.close();
        } catch (IOException er) {
            throw new IOException("" + er.getMessage(), er.getCause());
        }
    }

    public SpellBooks readSpellsFromFile() throws IOException {
        try {
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(new FileReader("spells.json"));
            return gson.fromJson(reader, SPELL_TYPE);
        } catch (IOException er) {
            throw new IOException("" + er.getMessage(), er.getCause());
        }
    }

    public void saveChanges(int level, String id, JTextField name, JComboBox school, JTextField castTime, JTextField range, JTextField duration, JTextField components, JTextField manaCost, JComboBox elemental) throws Throwable {
        spellBooks.book.get(level).getSpell(id).setName(name.getText());
        spellBooks.book.get(level).getSpell(id).setSchool(school.getSelectedItem().toString());
        spellBooks.book.get(level).getSpell(id).setCastTime(castTime.getText());
        spellBooks.book.get(level).getSpell(id).setRange(range.getText());
        spellBooks.book.get(level).getSpell(id).setDuration(duration.getText());
        spellBooks.book.get(level).getSpell(id).setComponents(components.getText());
        spellBooks.book.get(level).getSpell(id).setManaCost(manaCost.getText());
        spellBooks.book.get(level).getSpell(id).setElemental(elemental.getSelectedItem().toString());
    }

    public JPanel getBook() {
        return Book;
    }
}

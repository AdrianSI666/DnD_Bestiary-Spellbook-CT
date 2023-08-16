package com.as.casting;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class SpellsDetails {
    private JPanel Detail;
    private JButton SaveButton;
    private JTextField SpellId;
    private JPanel Buttons;
    private JTextField SpellName;
    private JTextField SpellLevel;
    private JTextField SpellManaCost;
    private JTextField SpellCastTime;
    private JTextField SpellRange;
    private JTextField SpellComonents;
    private JTextField SpellDuration;
    private JTextArea SpellDescription;
    private JComboBox ClassesComboBox;
    private JButton AddClassButton;
    private JPanel ClassesPane;
    private JPanel Fields;
    private JScrollPane Description;
    private JPanel Classes;
    private JComboBox<String> SpellElemental;
    private JComboBox<String> SpellSchool;
    private final SpellDetails currentSpell;
    private final SpellBooks spellBooks;
    private int oldSpellLevel;

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

    public SpellsDetails(SpellBooks spellBooks, int spellLevel, String spellID) throws Throwable {
        this.spellBooks = spellBooks;
        this.oldSpellLevel = spellLevel;
        currentSpell = spellBooks.book.get(spellLevel).getSpell(spellID);
        config();
    }

    private void config() {
        SpellSchool.setModel(new DefaultComboBoxModel<>(schools));
        SpellElemental.setModel(new DefaultComboBoxModel<>(elementals));
        SpellId.setText(currentSpell.getId().toString());
        SpellName.setText(currentSpell.getName());
        SpellLevel.setText(currentSpell.getLevel() + "");
        SpellSchool.setSelectedItem(currentSpell.getSchool());
        SpellElemental.setSelectedItem(currentSpell.getElemental());
        SpellManaCost.setText(currentSpell.getManaCost());
        SpellCastTime.setText(currentSpell.getCastTime());
        SpellRange.setText(currentSpell.getRange());
        SpellComonents.setText(currentSpell.getComponents());
        SpellDuration.setText(currentSpell.getDuration());
        SpellDescription.setText(currentSpell.getDescription());
        SpellDescription.setLineWrap(true);
        SpellDescription.setWrapStyleWord(true);
        ClassesPane.setLayout(new BoxLayout(ClassesPane, BoxLayout.PAGE_AXIS));
        currentSpell.getClasses().forEach(classs -> {
            JPanel oneClass = new JPanel(new FlowLayout());
            JTextField oneClassName = new JTextField(classs);
            JButton deleteOneClass = new JButton("Delete");
            deleteOneClass.addActionListener(e -> ClassesPane.remove(oneClass));
            oneClass.add(oneClassName);
            oneClass.add(deleteOneClass);
            ClassesPane.add(oneClass);
            ClassesPane.revalidate();
        });
        AddClassButton.addActionListener(e -> {
            JPanel oneClass = new JPanel();
            oneClass.setLayout(new FlowLayout());
            JTextField oneClassName = new JTextField(ClassesComboBox.getSelectedItem().toString());
            JButton deleteOneClass = new JButton("Delete");
            deleteOneClass.addActionListener(actionEvent -> {
                ClassesPane.remove(oneClass);
                ClassesPane.revalidate();
                currentSpell.getClasses().remove(ClassesComboBox.getSelectedItem().toString());
            });
            oneClass.add(oneClassName);
            oneClass.add(deleteOneClass);
            ClassesPane.add(oneClass);
            ClassesPane.revalidate();
            currentSpell.getClasses().add(ClassesComboBox.getSelectedItem().toString());
        });
        SaveButton.addActionListener(e -> {
            try {
                saveChanges();
                saveSpells();
            } catch (Throwable ex) {
                ex.printStackTrace();
            }
        });
    }

    public void saveChanges() throws Throwable {
        spellBooks.book.get(oldSpellLevel).getSpell(SpellId.getText()).setName(SpellName.getText());
        spellBooks.book.get(oldSpellLevel).getSpell(SpellId.getText()).setLevel(Integer.parseInt(SpellLevel.getText()));
        spellBooks.book.get(oldSpellLevel).getSpell(SpellId.getText()).setSchool(SpellSchool.getSelectedItem().toString());
        spellBooks.book.get(oldSpellLevel).getSpell(SpellId.getText()).setElemental(SpellElemental.getSelectedItem().toString());
        spellBooks.book.get(oldSpellLevel).getSpell(SpellId.getText()).setManaCost(SpellManaCost.getText());
        spellBooks.book.get(oldSpellLevel).getSpell(SpellId.getText()).setCastTime(SpellCastTime.getText());
        spellBooks.book.get(oldSpellLevel).getSpell(SpellId.getText()).setRange(SpellRange.getText());
        spellBooks.book.get(oldSpellLevel).getSpell(SpellId.getText()).setComponents(SpellComonents.getText());
        spellBooks.book.get(oldSpellLevel).getSpell(SpellId.getText()).setDuration(SpellDuration.getText());
        spellBooks.book.get(oldSpellLevel).getSpell(SpellId.getText()).setDescription(SpellDescription.getText());
        ArrayList<String> spellClassList = new ArrayList<>();
        for (Component component : ClassesPane.getComponents()) {
            JPanel oneSpell = (JPanel) component;
            Component[] spellComponent = oneSpell.getComponents();
            JTextField className = (JTextField) spellComponent[0];
            spellClassList.add(className.getText());
        }
        spellBooks.book.get(oldSpellLevel).getSpell(SpellId.getText()).setClasses(spellClassList);
        oldSpellLevel = Integer.parseInt(SpellLevel.getText());
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

    public JPanel getDetail() {
        return Detail;
    }
}

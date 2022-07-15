package com.as;

import com.as.casting.SpellBooks;
import com.as.casting.SpellDetails;
import com.as.casting.Spellbook;
import com.as.casting.SpellsDetails;
import com.as.tracker.CombatTracker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Bestiary extends JFrame {
    private static final Gson gson = new Gson();
    private static final java.lang.reflect.Type BEAST_TYPE = new TypeToken<Beasts>() {
    }.getType();
    private static final java.lang.reflect.Type SPELLBOOK_TYPE = new TypeToken<SpellBooks>() {
    }.getType();
    private JTabbedPane tabbedPane1;
    private JPanel Bestiarry;
    private JPanel Spells;
    private JPanel Descryption;
    private JPanel Stats;
    private JPanel SnS;
    private JPanel Combat;
    private JPanel Info;
    private JLabel LName;
    private JTextField Name;
    private JLabel LClass;
    private JPanel bestiary2;
    private JLabel LLevel;
    private JTextField Level;
    private JTextField Class;
    private JLabel LRace;
    private JTextField Race;
    private JLabel LAligment;
    private JComboBox Aligment;
    private JLabel LSize;
    private JTextField Size;
    private JLabel LID;
    private JTextField VId;
    private JTextField Strength;
    private JLabel LStrength;
    private JTextField VStrength;
    private JLabel LDexteriy;
    private JTextField Dexterity;
    private JTextField VDexterity;
    private JLabel LConstitution;
    private JTextField Constitution;
    private JTextField VConstitution;
    private JLabel LInteligence;
    private JTextField Inteligence;
    private JTextField VInteligence;
    private JLabel LWisdom;
    private JTextField Wisdom;
    private JTextField VWisdom;
    private JLabel LCharisma;
    private JTextField Charisma;
    private JTextField VCharisma;
    private JLabel LProfieciency;
    private JTextField Profieciency;
    private JPanel SavThrow;
    private JLabel ST;
    private JCheckBox PSTstr;
    private JTextField VSTstr;
    private JLabel LSTstr;
    private JCheckBox PSTdex;
    private JTextField VSTdex;
    private JLabel LSTdex;
    private JCheckBox PSTconst;
    private JTextField VSTconst;
    private JLabel LSTconst;
    private JCheckBox PSTint;
    private JTextField VSTint;
    private JLabel LSTint;
    private JCheckBox PSTwis;
    private JTextField VSTwis;
    private JLabel LSTwis;
    private JCheckBox PSTchar;
    private JTextField VSTchar;
    private JLabel LSTchar;
    private JLabel Lac;
    private JTextField ACSieczne;
    private JLabel LInitiative;
    private JTextField Initiative;
    private JLabel LSpeed;
    private JTextField Speed;
    private JButton saveButton;
    private JPanel mainPanel;
    private JTextField ASTstr;
    private JTextField ASTdex;
    private JTextField ASTconst;
    private JTextField ASTint;
    private JTextField ASTwis;
    private JTextField ASTchar;
    private JScrollPane FnT;
    private JScrollPane Eq;
    private JScrollPane LangnProf;
    private JLabel LAnS;
    private JLabel LFnT;
    private JLabel LEq;
    private JLabel LLnP;
    private JTextArea VFnT;
    private JTextArea VEq;
    private JTextArea VLnP;
    private JCheckBox PAthletics;
    private JTextField VAthletics;
    private JTextField AAthletics;
    private JButton newButton;
    private JButton nextButton;
    private JButton previousButton;
    private JButton firstButton;
    private JButton lastButton;
    private JButton findButton;
    private JComboBox findComboBox;
    private JTextField findTextField;
    private JScrollPane SkillScroll;
    private JLabel LHitPoints;
    private JTextField HitPoints;
    private JButton AddCantrip;
    private JTextArea VAnS;
    private JScrollPane ScrollAnS;
    private JComboBox CantripSelect;
    private JPanel CantripPane;
    private JScrollPane SpellsScroll;
    private JComboBox SpellcastingClass;
    private JLabel Lsc;
    private JLabel Lsa;
    private JLabel LsDC;
    private JTextField VSpellDC;
    private JTextField ASpellDC;
    private JLabel LSpellAB;
    private JTextField VSpellAB;
    private JTextField ASpellAB;
    private JComboBox VSpellType;
    private JTextField AMana;
    private JLabel LMana;
    private JPanel Buttons;
    private JPanel STProfs;
    private JPanel STValues;
    private JPanel STAdded;
    private JPanel STLabels;
    private JPanel SLabels;
    private JPanel SAdded;
    private JTextField AAcrobatic;
    private JTextField AAnimal;
    private JTextField AArcana;
    private JTextField ADeception;
    private JTextField AHistory;
    private JTextField AInsight;
    private JTextField AIntimidation;
    private JTextField AInvestigation;
    private JTextField AMedicine;
    private JTextField ANature;
    private JTextField APerception;
    private JTextField APerformance;
    private JTextField APersuasion;
    private JTextField AReligion;
    private JTextField ASoH;
    private JTextField AStealth;
    private JTextField ASurvival;
    private JTextField APasiveWisdom;
    private JPanel SValues;
    private JTextField VAcrobatic;
    private JTextField VAnimal;
    private JTextField VArcana;
    private JTextField VDeception;
    private JTextField VHistory;
    private JTextField VInsight;
    private JTextField VIntimidation;
    private JTextField VInvestigation;
    private JTextField VMedicine;
    private JTextField VNature;
    private JTextField VPerception;
    private JTextField VPerformance;
    private JTextField VPersuasion;
    private JTextField VReligion;
    private JTextField VSoH;
    private JTextField VStealth;
    private JTextField VSurvival;
    private JTextField VPasiveWisdom;
    private JPanel SProfs;
    private JCheckBox PAcrobatic;
    private JCheckBox PAnimal;
    private JCheckBox PArcana;
    private JCheckBox PDeception;
    private JCheckBox PHistory;
    private JCheckBox PInsight;
    private JCheckBox PIntimidation;
    private JCheckBox PInvestigation;
    private JCheckBox PMedicine;
    private JCheckBox PNature;
    private JCheckBox PPerception;
    private JCheckBox PPerformance;
    private JCheckBox PPersuasion;
    private JCheckBox PReligion;
    private JCheckBox PSoH;
    private JCheckBox PStealth;
    private JCheckBox PSurvival;
    private JPanel Circles;
    private JPanel Cantrips;
    private JScrollPane CantripScrollPane;
    private JLabel LCantrips;
    private JPanel First;
    private JScrollPane FirstScrollPane;
    private JPanel FirstPane;
    private JLabel FirstSpell;
    private JComboBox FirstSelect;
    private JButton AddFirst;
    private JPanel Second;
    private JScrollPane SecondScrollPane;
    private JPanel SecondPane;
    private JLabel SecondSpell;
    private JComboBox SecondSelect;
    private JButton AddSecond;
    private JPanel Third;
    private JScrollPane ThirdScrollPane;
    private JPanel ThirdPane;
    private JLabel ThirdSpell;
    private JComboBox ThirdSelect;
    private JButton AddThird;
    private JPanel Forth;
    private JScrollPane ForthScrollPane;
    private JPanel ForthPane;
    private JLabel ForthSpell;
    private JComboBox ForthSelect;
    private JButton AddForth;
    private JPanel Fifth;
    private JScrollPane FifthScrollPane;
    private JPanel FifthPane;
    private JLabel FifthSpell;
    private JComboBox FifthSelect;
    private JButton AddFifth;
    private JPanel Sixth;
    private JScrollPane SixthScrollPane;
    private JPanel SixthPane;
    private JLabel SixthSpell;
    private JComboBox SixthSelect;
    private JButton AddSixth;
    private JPanel Seventh;
    private JScrollPane SeventhScrollPane;
    private JPanel SeventhPane;
    private JLabel SeventhSpell;
    private JComboBox SeventhSelect;
    private JButton AddSeventh;
    private JPanel Eighth;
    private JScrollPane EighthScrollPane;
    private JPanel EighthPane;
    private JLabel EighthSpell;
    private JComboBox EighthSelect;
    private JButton AddEighth;
    private JPanel Ninth;
    private JScrollPane NinthScrollPane;
    private JPanel NinthPane;
    private JLabel NinthSpell;
    private JComboBox NinthSelect;
    private JButton AddNinth;
    private JButton removeButton;
    private JButton readButton;
    private JButton spellbookButton;
    private JButton combatTrackerButton;
    private JTextField ACObuch;
    private JTextField ACKlote;
    private JLabel LArkanizm;
    private JTextField Arkanizm;
    private JTextField VArkanizm;
    private JCheckBox PSTarc;
    private JTextField VSTarc;
    private JTextField ASTarc;
    private JLabel LSTarc;
    private JTextField AAlchemy;
    private JTextField VAlchemy;
    private JCheckBox PAlchemy;
    private JPanel Skills;
    private JLabel Sk;
    private JLabel LAcrobatic;
    private JLabel LAnimal;
    private JLabel LArcana;
    private JLabel LAthletics;
    private JLabel LDeception;
    private JLabel LHistory;
    private JLabel LInsight;
    private JLabel LIntimidation;
    private JLabel LInvestigation;
    private JLabel LMedicine;
    private JLabel LNature;
    private JLabel LPerception;
    private JLabel LPerformance;
    private JLabel LPersuasion;
    private JLabel LReligion;
    private JLabel LSoH;
    private JLabel LStealth;
    private JLabel LSurvival;
    private JLabel LPasiveWisdom;
    private JLabel LAlchemy;
    private JLabel LArmorsmith;
    private JLabel Crafting;
    private JLabel LEnchanting;
    private JLabel LMagicSenses;
    private JLabel LSmithing;
    private JTextField AArmorsmith;
    private JTextField ACrafting;
    private JTextField AEnchanting;
    private JTextField AMagicSenses;
    private JTextField ASmithing;
    private JTextField VArmorsmith;
    private JTextField VCrafting;
    private JTextField VEnchanting;
    private JTextField VMagicSenses;
    private JTextField VSmithing;
    private JCheckBox JustLook;
    private JCheckBox PArmorsmith;
    private JCheckBox PCrafting;
    private JCheckBox PEnchanting;
    private JCheckBox PMagicSenses;
    private JCheckBox PSmithing;
    private JPanel CreatureListPane;
    private JPanel CreaturesListPane;
    private JPanel CreaturesListButtonPane;
    private JButton SortListButton;
    private JButton FilterListButton;
    private JComboBox FilterOption;
    private JTextField FilterText;
    private JButton ResetListButton;
    private JPanel CreatureListTemplate;
    private JButton ShowListButton;
    private JButton OpenInDetailsButton;
    private Beasts beastList;
    private boolean saved;
    private int FindRepeat = 0;
    private String FindText = "";
    private SpellBooks spellBooks;
    private List<Beast> beastSideList = new ArrayList<>();
    private boolean filtered = false;

    Bestiary() {
        beastList = new Beasts();
        spellBooks = new SpellBooks();
        config();
        VId.setText(beastList.getI() + "");
    }

    Bestiary(Beasts file) {
        beastList = file;
        spellBooks = new SpellBooks();
        config();
        VId.setText(0 + "");
        readBeast(0);
    }

    Bestiary(Beasts file, SpellBooks spellsFile) {
        beastList = file;
        spellBooks = spellsFile;
        config();
        VId.setText(0 + "");
        readBeast(0);
    }

    private void config() {
        Stats.setLayout(new BoxLayout(Stats, BoxLayout.PAGE_AXIS));
        SkillScroll.getVerticalScrollBar().setUnitIncrement(14);

        Strength.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                List<JTextField> lista = new ArrayList<>();
                List<JCheckBox> listaCheck = new ArrayList<>();
                lista.add(Profieciency);    //0 prof zawsze
                lista.add(Strength);        //nieparszysta to liczba dodawana
                lista.add(VStrength);       //parzysta to tam gdzie wynik ma byc
                lista.add(ASTstr);
                lista.add(VSTstr);
                listaCheck.add(PSTstr);     //checkboxy osobno, po koleji dla skilli zerowy zawsze dla Saving Throwa

                //lista.add(AAthletics);
                //lista.add(VAthletics);
                //listaCheck.add(PAthletics); //reczny sposob

                Component[] Profs = SProfs.getComponents(); //sposob z 4 rownymi layaoutami
                Component[] Values = SValues.getComponents();
                Component[] Added = SAdded.getComponents();
                Component[] Labels = SLabels.getComponents();
                for (int skill = 0; skill < Profs.length; skill++) {
                    JCheckBox check = (JCheckBox) Profs[skill];
                    JTextField value = (JTextField) Values[skill];
                    JTextField add = (JTextField) Added[skill];
                    JLabel label = (JLabel) Labels[skill];
                    if (label.getText().contains("(Str)")) {
                        lista.add(add);
                        lista.add(value);
                        listaCheck.add(check);
                    }
                }
                writeStats(e, lista, listaCheck); //Wywołanie liczenia na podstawie podanych danych

            }
        });
        Dexterity.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                List<JTextField> lista = new ArrayList<>();
                List<JCheckBox> listaCheck = new ArrayList<>();
                lista.add(Profieciency);    //0 prof zawsze
                lista.add(Dexterity);        //nieparszysta to liczba dodawana
                lista.add(VDexterity);       //parzysta to tam gdzie wynik ma byc
                lista.add(ASTdex);
                lista.add(VSTdex);
                listaCheck.add(PSTdex);     //checkboxy osobno, po koleji dla skilli zerowy zawsze dla Saving Throwa

                Component[] Profs = SProfs.getComponents(); //sposob z 4 rownymi layaoutami
                Component[] Values = SValues.getComponents();
                Component[] Added = SAdded.getComponents();
                Component[] Labels = SLabels.getComponents();
                for (int skill = 0; skill < Profs.length; skill++) {
                    JCheckBox check = (JCheckBox) Profs[skill];
                    JTextField value = (JTextField) Values[skill];
                    JTextField add = (JTextField) Added[skill];
                    JLabel label = (JLabel) Labels[skill];
                    if (label.getText().contains("(Dex)")) {
                        lista.add(add);
                        lista.add(value);
                        listaCheck.add(check);
                    }
                }
                writeStats(e, lista, listaCheck); //Wywołanie liczenia na podstawie podanych danych
            }
        });
        Constitution.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                List<JTextField> lista = new ArrayList<>();
                List<JCheckBox> listaCheck = new ArrayList<>();
                lista.add(Profieciency);    //0 prof zawsze
                lista.add(Constitution);        //nieparszysta to liczba dodawana
                lista.add(VConstitution);       //parzysta to tam gdzie wynik ma byc
                lista.add(ASTconst);
                lista.add(VSTconst);
                listaCheck.add(PSTconst);     //checkboxy osobno, po koleji dla skilli zerowy zawsze dla Saving Throwa

                Component[] Profs = SProfs.getComponents(); //sposob z 4 rownymi layaoutami
                Component[] Values = SValues.getComponents();
                Component[] Added = SAdded.getComponents();
                Component[] Labels = SLabels.getComponents();
                for (int skill = 0; skill < Profs.length; skill++) {
                    JCheckBox check = (JCheckBox) Profs[skill];
                    JTextField value = (JTextField) Values[skill];
                    JTextField add = (JTextField) Added[skill];
                    JLabel label = (JLabel) Labels[skill];
                    if (label.getText().contains("(Con)")) {
                        lista.add(add);
                        lista.add(value);
                        listaCheck.add(check);
                    }
                }
                writeStats(e, lista, listaCheck); //Wywołanie liczenia na podstawie podanych danych
            }
        });
        Inteligence.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                List<JTextField> lista = new ArrayList<>();
                List<JCheckBox> listaCheck = new ArrayList<>();
                lista.add(Profieciency);    //0 prof zawsze
                lista.add(Inteligence);        //nieparszysta to liczba dodawana
                lista.add(VInteligence);       //parzysta to tam gdzie wynik ma byc
                lista.add(ASTint);
                lista.add(VSTint);
                listaCheck.add(PSTint);     //checkboxy osobno, po koleji dla skilli zerowy zawsze dla Saving Throwa

                Component[] Profs = SProfs.getComponents(); //sposob z 4 rownymi layaoutami
                Component[] Values = SValues.getComponents();
                Component[] Added = SAdded.getComponents();
                Component[] Labels = SLabels.getComponents();
                for (int skill = 0; skill < Profs.length; skill++) {
                    JCheckBox check = (JCheckBox) Profs[skill];
                    JTextField value = (JTextField) Values[skill];
                    JTextField add = (JTextField) Added[skill];
                    JLabel label = (JLabel) Labels[skill];
                    if (label.getText().contains("(Int)")) {
                        lista.add(add);
                        lista.add(value);
                        listaCheck.add(check);
                    }
                }
                writeStats(e, lista, listaCheck); //Wywołanie liczenia na podstawie podanych danych
            }
        });
        Wisdom.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                List<JTextField> lista = new ArrayList<>();
                List<JCheckBox> listaCheck = new ArrayList<>();
                lista.add(Profieciency);    //0 prof zawsze
                lista.add(Wisdom);        //nieparszysta to liczba dodawana
                lista.add(VWisdom);       //parzysta to tam gdzie wynik ma byc
                lista.add(ASTwis);
                lista.add(VSTwis);
                listaCheck.add(PSTwis);     //checkboxy osobno, po koleji dla skilli zerowy zawsze dla Saving Throwa

                Component[] Profs = SProfs.getComponents(); //sposob z 4 rownymi layaoutami
                Component[] Values = SValues.getComponents();
                Component[] Added = SAdded.getComponents();
                Component[] Labels = SLabels.getComponents();
                for (int skill = 0; skill < Profs.length; skill++) {
                    JCheckBox check = (JCheckBox) Profs[skill];
                    JTextField value = (JTextField) Values[skill];
                    JTextField add = (JTextField) Added[skill];
                    JLabel label = (JLabel) Labels[skill];
                    if (label.getText().contains("(Wis)")) {
                        lista.add(add);
                        lista.add(value);
                        listaCheck.add(check);
                    }
                }
                writeStats(e, lista, listaCheck); //Wywołanie liczenia na podstawie podanych danych
                int per = Integer.parseInt(VPerception.getText());
                VPasiveWisdom.setText(10 + per + getMod(APasiveWisdom) + "");
            }
        });
        Charisma.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                List<JTextField> lista = new ArrayList<>();
                List<JCheckBox> listaCheck = new ArrayList<>();
                lista.add(Profieciency);    //0 prof zawsze
                lista.add(Charisma);        //nieparszysta to liczba dodawana
                lista.add(VCharisma);       //parzysta to tam gdzie wynik ma byc
                lista.add(ASTchar);
                lista.add(VSTchar);
                listaCheck.add(PSTchar);     //checkboxy osobno, po koleji dla skilli zerowy zawsze dla Saving Throwa

                Component[] Profs = SProfs.getComponents(); //sposob z 4 rownymi layaoutami
                Component[] Values = SValues.getComponents();
                Component[] Added = SAdded.getComponents();
                Component[] Labels = SLabels.getComponents();
                for (int skill = 0; skill < Profs.length; skill++) {
                    JCheckBox check = (JCheckBox) Profs[skill];
                    JTextField value = (JTextField) Values[skill];
                    JTextField add = (JTextField) Added[skill];
                    JLabel label = (JLabel) Labels[skill];
                    if (label.getText().contains("(Cha)")) {
                        lista.add(add);
                        lista.add(value);
                        listaCheck.add(check);
                    }
                }
                writeStats(e, lista, listaCheck); //Wywołanie liczenia na podstawie podanych danych
            }
        });
        Arkanizm.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                List<JTextField> lista = new ArrayList<>();
                List<JCheckBox> listaCheck = new ArrayList<>();
                lista.add(Profieciency);    //0 prof zawsze
                lista.add(Arkanizm);        //nieparszysta to liczba dodawana
                lista.add(VArkanizm);       //parzysta to tam gdzie wynik ma byc
                lista.add(ASTarc);
                lista.add(VSTarc);
                listaCheck.add(PSTarc);     //checkboxy osobno, po koleji dla skilli zerowy zawsze dla Saving Throwa

                Component[] Profs = SProfs.getComponents(); //sposob z 4 rownymi layaoutami
                Component[] Values = SValues.getComponents();
                Component[] Added = SAdded.getComponents();
                Component[] Labels = SLabels.getComponents();
                for (int skill = 0; skill < Profs.length; skill++) {
                    JCheckBox check = (JCheckBox) Profs[skill];
                    JTextField value = (JTextField) Values[skill];
                    JTextField add = (JTextField) Added[skill];
                    JLabel label = (JLabel) Labels[skill];
                    if (label.getText().contains("(Arc)")) {
                        lista.add(add);
                        lista.add(value);
                        listaCheck.add(check);
                    }
                }
                writeStats(e, lista, listaCheck); //Wywołanie liczenia na podstawie podanych danych
            }
        });
        Component[] STProf = STProfs.getComponents();
        Component[] STValue = STValues.getComponents();
        Component[] STAdd = STAdded.getComponents();
        Component[] STLabel = STLabels.getComponents();

        Component[] Profs = SProfs.getComponents(); //sposob z 4 rownymi layaoutami
        Component[] Values = SValues.getComponents();
        Component[] Added = SAdded.getComponents();
        Component[] Labels = SLabels.getComponents();
        Profieciency.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                int pureProf = getTyped(e, Profieciency);
                for (int skill = 0; skill < STProf.length; skill++) {
                    JCheckBox check = (JCheckBox) STProf[skill];
                    JTextField value = (JTextField) STValue[skill];
                    JTextField add = (JTextField) STAdd[skill];
                    JLabel label = (JLabel) STLabel[skill];
                    if (check.isSelected()) {
                        String[] reg = {"Str", "Dex", "Con", "Int", "Wis", "Cha", "Arc"};
                        int pureStat = readStat(label, reg);
                        int mod = getMod(add);
                        value.setText(pureProf + pureStat + mod + "");
                    }
                }
                for (int skill = 0; skill < Profs.length - 1; skill++) {
                    JCheckBox check = (JCheckBox) Profs[skill];
                    JTextField value = (JTextField) Values[skill];
                    JTextField add = (JTextField) Added[skill];
                    JLabel label = (JLabel) Labels[skill];
                    if (check.isSelected()) {
                        String[] reg = {"(Str)", "(Dex)", "(Con)", "(Int)", "(Wis)", "(Cha)", "(Arc)"};
                        int pureStat = readStat(label, reg);
                        int mod = getMod(add);
                        value.setText(pureProf + pureStat + mod + "");
                    }
                }
            }
        });
        for (int button = 0; button < STProf.length; button++) {
            JCheckBox check = (JCheckBox) STProf[button];
            JTextField value = (JTextField) STValue[button];
            JTextField add = (JTextField) STAdd[button];
            JLabel label = (JLabel) STLabel[button];
            String[] reg = {"Str", "Dex", "Con", "Int", "Wis", "Cha", "Arc"};
            check.addActionListener(e -> {
                int pureStat = readStat(label, reg);
                int mod = getMod(add);
                int pureProf = getMod(Profieciency);
                if (check.isSelected()) {
                    value.setText(pureProf + pureStat + mod + "");
                } else {
                    value.setText(pureStat + mod + "");
                }
            });
            add.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    int pureStat = readStat(label, reg);
                    int mod = getTyped(e, add);
                    int pureProf = getMod(Profieciency);
                    if (check.isSelected()) {
                        value.setText(pureProf + pureStat + mod + "");
                    } else {
                        value.setText(pureStat + mod + "");
                    }
                }
            });
        }
        for (int button = 0; button < Profs.length - 1; button++) {
            JCheckBox check = (JCheckBox) Profs[button];
            JTextField value = (JTextField) Values[button];
            JTextField add = (JTextField) Added[button];
            JLabel label = (JLabel) Labels[button];
            String[] reg = {"(Str)", "(Dex)", "(Con)", "(Int)", "(Wis)", "(Cha)", "(Arc)"};
            check.addActionListener(e -> {
                int pureStat = readStat(label, reg);
                int mod = getMod(add);
                int pureProf = getMod(Profieciency);
                if (check.isSelected()) {
                    value.setText(pureProf + pureStat + mod + "");
                } else {
                    value.setText(pureStat + mod + "");
                }
            });
            add.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    int pureStat = readStat(label, reg);
                    int mod = getTyped(e, add);
                    int pureProf = getMod(Profieciency);
                    if (check.isSelected()) {
                        value.setText(pureProf + pureStat + mod + "");
                    } else {
                        value.setText(pureStat + mod + "");
                    }
                }
            });
        }
        APasiveWisdom.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int pureStat = getMod(VPerception);
                int mod = getTyped(e, APasiveWisdom);
                VPasiveWisdom.setText(10 + pureStat + mod + "");
            }
        });
        VSpellType.addActionListener(e -> {
            int mainstat = getSpellAbilityType(VSpellType);
            VSpellDC.setText(8 + mainstat + getMod(Profieciency) + getMod(ASpellDC) + "");
            VSpellAB.setText(mainstat + getMod(Profieciency) + getMod(ASpellAB) + "");
        });
        ASpellDC.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                int value = getTyped(e, ASpellDC);
                int mainstat = getSpellAbilityType(VSpellType);
                VSpellDC.setText(8 + mainstat + getMod(Profieciency) + value + "");
            }
        });
        ASpellAB.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int value = getTyped(e, ASpellAB);
                int mainstat = getSpellAbilityType(VSpellType);
                VSpellAB.setText(mainstat + getMod(Profieciency) + value + "");
            }
        });
        Component[] Circle = Circles.getComponents();
        for (Component circle : Circle) {
            JPanel panel = (JPanel) circle;
            Component[] components = panel.getComponents();
            JScrollPane spellListScroll = (JScrollPane) components[0];
            JLabel circleName = (JLabel) components[1];
            int spellLevel;
            if (circleName.getText().contains("Cantrip")) spellLevel = 0;
            else spellLevel = Integer.parseInt(circleName.getText());
            JComboBox addingOption = (JComboBox) components[2];
            ArrayList<String> spellsFromCircle = new ArrayList<>();
            spellsFromCircle.add("");
            String chosenClass = SpellcastingClass.getSelectedItem().toString();
            spellBooks.book.get(spellLevel).spells.stream().filter(spellDetails -> spellDetails.getClasses().contains(chosenClass)).forEach(spell -> spellsFromCircle.add(spell.getName()));
            addingOption.setModel(new DefaultComboBoxModel(spellsFromCircle.toArray()));
            JButton addingButton = (JButton) components[3];
            Component[] listcomponents = spellListScroll.getComponents();
            JViewport viewport = (JViewport) listcomponents[0];
            JPanel spellList = (JPanel) viewport.getView();
            spellList.setLayout(new BoxLayout(spellList, BoxLayout.PAGE_AXIS));
            addingButton.addActionListener(e -> {
                JPanel spell = new JPanel();
                spell.setLayout(new FlowLayout());
                String name = "";
                String manaCost = "0";
                String description = "";
                boolean spellExistInSpellBook = false;
                SpellDetails chosenSpell = null;
                if (!addingOption.getSelectedItem().toString().equals("")) {
                    try {
                        chosenSpell = spellBooks
                                .book
                                .get(spellLevel)
                                .spells
                                .stream()
                                .filter(spellDetails -> spellDetails.getName().equals(addingOption.getSelectedItem().toString()))
                                .findFirst()
                                .orElseThrow(() -> null);
                        name = chosenSpell.getName();
                        manaCost = chosenSpell.getManaCost();
                        description = chosenSpell.getDescription();
                        spellExistInSpellBook = true;
                    } catch (Throwable ex) {
                        throw new RuntimeException(ex);
                    }
                }
                JTextField spellName = new JTextField(name);
                spellName.setColumns(10);
                JTextField spellManaCost = new JTextField(manaCost);
                spellManaCost.setColumns(5);
                JTextArea spellDescription = new JTextArea(description);
                spellDescription.setColumns(10);
                spellDescription.setLineWrap(true);
                spellDescription.setWrapStyleWord(true);
                spell.add(spellName);
                spell.add(spellManaCost);
                spell.add(spellDescription);
                JButton usunspell = new JButton();
                usunspell.setText("Delete");
                usunspell.addActionListener(e1 -> {
                    spellList.remove(spell);
                    if (saved)
                        beastList.beasts.get(getMod(VId)).getKnownSpell().book.get(spellLevel).removeSpell(spellName.getText());
                    spellList.revalidate();
                });
                JButton chose = new JButton("Details");
                boolean finalSpellExistInSpellBook = spellExistInSpellBook;
                SpellDetails finalChosenSpell = chosenSpell;
                chose.addActionListener(en -> {
                    try {
                        if (finalSpellExistInSpellBook) {
                            JFrame spelldetail = new JFrame();
                            SpellsDetails newPanel = new SpellsDetails(spellBooks, spellLevel, finalChosenSpell.getId().toString());
                            spelldetail.setContentPane(newPanel.getDetail());
                            spelldetail.setDefaultCloseOperation(spelldetail.DISPOSE_ON_CLOSE);
                            spelldetail.setSize(500, 500);
                            spelldetail.setVisible(true);
                        }
                    } catch (Throwable ex) {
                        System.out.println(ex.getMessage());
                    }
                    //Odnośnik do zaklęcia w spellbook
                });
                spell.add(usunspell);
                spell.add(chose);
                spellList.add(spell);
                spellList.revalidate();
            });
        }
        SpellcastingClass.addActionListener(e -> {
            for (Component circle : Circle) {
                JPanel panel = (JPanel) circle;
                Component[] components = panel.getComponents();
                JLabel circleName = (JLabel) components[1];
                int spellLevel;
                if (circleName.getText().contains("Cantrip")) spellLevel = 0;
                else spellLevel = Integer.parseInt(circleName.getText());
                JComboBox addingOption = (JComboBox) components[2];
                String chosenClass = SpellcastingClass.getSelectedItem().toString();
                ArrayList<String> spellsFromCircle = new ArrayList<>();
                spellsFromCircle.add("");
                spellBooks.book.get(spellLevel).spells.stream().filter(spellDetails -> spellDetails.getClasses().contains(chosenClass)).forEach(spell -> spellsFromCircle.add(spell.getName()));
                addingOption.setModel(new DefaultComboBoxModel(spellsFromCircle.toArray()));
            }
        });
        saveButton.addActionListener(e -> {
            //Spells
            KnownSpell spells = getSpells();
            if (beastList.beasts.size() == Integer.parseInt(VId.getText())) {
                saveNew(spells);
            } else {
                saveChanges(spells);
            }
            saved = true;
            saveToFile();
        });
        newButton.addActionListener(e -> {
            if (getMod(VId) < beastList.beasts.size()) {
                KnownSpell spells = getSpells();
                saveChanges(spells);
                reset();
            }
        });

        nextButton.addActionListener(e -> {
            int id = getMod(VId);
            if (id + 1 < beastList.beasts.size()) {
                id++;
                resetSpells();
                readBeast(id);
            }
        });
        previousButton.addActionListener(e -> {
            int id = getMod(VId);
            if (id < beastList.beasts.size()) {
                if (id - 1 > -1) {
                    id--;
                    resetSpells();
                    readBeast(id);
                }
            }
        });
        firstButton.addActionListener(e -> {
            if (getMod(VId) < beastList.beasts.size()) {
                resetSpells();
                readBeast(0);
            }
        });
        lastButton.addActionListener(e -> {
            if (getMod(VId) < beastList.beasts.size()) {
                resetSpells();
                readBeast(beastList.beasts.size() - 1);
            }
        });

        findButton.addActionListener(e -> {
            int option = findComboBox.getSelectedIndex();
            if (FindText.equals(findTextField.getText())) {
                FindRepeat++;
            } else {
                FindRepeat = 0;
            }
            switch (option) {
                case 0 -> {
                    try {
                        if (beastList.beasts.get(getMod(findTextField)) != null) {
                            resetSpells();
                            readBeast(getMod(findTextField));
                        }
                    } catch (IndexOutOfBoundsException er) {
                        System.out.println(er.getMessage());
                    }
                }
                case 1 -> {
                    FindText = findTextField.getText();
                    try {
                        Beast idf = beastList.beasts.stream()
                                .filter(beast -> beast.getName().contains(FindText)).skip(FindRepeat)
                                .findAny().get();
                        resetSpells();
                        readBeast(beastList.beasts.indexOf(idf));
                    } catch (NoSuchElementException err) {
                        System.out.println(err.getMessage());
                    }
                }
                case 2 -> {
                    FindText = findTextField.getText();
                    try {
                        Beast idf = beastList.beasts.stream()
                                .filter(beast -> beast.getClasss().contains(FindText)).skip(FindRepeat)
                                .findAny().get();
                        resetSpells();
                        readBeast(beastList.beasts.indexOf(idf));
                    } catch (NoSuchElementException err) {
                        System.out.println(err.getMessage());
                    }
                }
                case 3 -> {
                    FindText = findTextField.getText();
                    try {
                        Beast idf = beastList.beasts.stream()
                                .filter(beast -> beast.getLevel().contains(FindText)).skip(FindRepeat)
                                .findAny().get();
                        resetSpells();
                        readBeast(beastList.beasts.indexOf(idf));
                    } catch (NoSuchElementException err) {
                        System.out.println(err.getMessage());
                    }
                }
                case 4 -> {
                    FindText = findTextField.getText();
                    try {
                        Beast idf = beastList.beasts.stream()
                                .filter(beast -> beast.getRace().contains(FindText)).skip(FindRepeat)
                                .findAny().get();
                        resetSpells();
                        readBeast(beastList.beasts.indexOf(idf));
                    } catch (NoSuchElementException err) {
                        System.out.println(err.getMessage());
                    }
                }
                case 5 -> {
                    FindText = findTextField.getText();
                    try {
                        Beast idf = beastList.beasts.stream()
                                .filter(beast -> beast.getAligment().contains(FindText)).skip(FindRepeat)
                                .findAny().get();
                        resetSpells();
                        readBeast(beastList.beasts.indexOf(idf));
                    } catch (NoSuchElementException err) {
                        System.out.println(err.getMessage());
                    }
                }
                case 6 -> {
                    FindText = findTextField.getText();
                    try {
                        Beast idf = beastList.beasts.stream()
                                .filter(beast -> beast.getSize().contains(FindText)).skip(FindRepeat)
                                .findAny().get();
                        resetSpells();
                        readBeast(beastList.beasts.indexOf(idf));
                    } catch (NoSuchElementException err) {
                        System.out.println(err.getMessage());
                    }
                }
            }
        });
        removeButton.addActionListener(e -> {
            int idr = getMod(VId);
            beastList.beasts.remove(idr);
            if (idr == beastList.beasts.size()) idr--;
            reset();
            if (idr > -1) readBeast(idr);
        });
        readButton.addActionListener(e -> {
            JsonReader reader = null;
            try {
                reader = new JsonReader(new FileReader("beasts.json"));
                beastList = gson.fromJson(reader, BEAST_TYPE);
            } catch (FileNotFoundException err) {
                beastList=new Beasts();
            }
            try {
                reader = new JsonReader(new FileReader("spells.json"));
                spellBooks = gson.fromJson(reader, SPELLBOOK_TYPE);
            } catch (FileNotFoundException err) {
                spellBooks=new SpellBooks();
            }
            readBeast(beastList.beasts.size() - 1);
            /*try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bestiary.dat"));
                beastList=(Beasts) ois.readObject();
                readBeast(beastList.beasts.size()-1);
            } catch (FileNotFoundException error) {
                beastList=new Beasts();
            } catch (IOException er) {
                er.printStackTrace();
            } catch (ClassNotFoundException error2) {
                error2.printStackTrace();
            } catch (IndexOutOfBoundsException err){

            }*/
        });
        spellbookButton.addActionListener(e -> {
            JFrame spellbook = new JFrame();
            Spellbook panel;
            if (spellBooks != null) panel = new Spellbook(spellBooks);
            else panel = new Spellbook();
            spellbook.setContentPane(panel.getBook());
            spellbook.setDefaultCloseOperation(spellbook.DISPOSE_ON_CLOSE);
            spellbook.setSize(1220, 400);
            spellbook.setVisible(true);
        });
        combatTrackerButton.addActionListener(e -> {
            JFrame combatTracker = new JFrame();
            CombatTracker panel;
            if (beastList != null) panel = new CombatTracker(beastList);
            else panel = new CombatTracker(beastList);
            combatTracker.setContentPane(panel.getTracker());
            combatTracker.setDefaultCloseOperation(combatTracker.DISPOSE_ON_CLOSE);
            combatTracker.setSize(1600, 400);
            combatTracker.setVisible(true);
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
        JButton selectForBestiary = new JButton("Select");
        selectForBestiary.setEnabled(false);
        templateLineBeast.add(name);
        templateLineBeast.add(level);
        templateLineBeast.add(classs);
        templateLineBeast.add(race);
        templateLineBeast.add(aligment);
        templateLineBeast.add(size);
        templateLineBeast.add(selectForBestiary);
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
        OpenInDetailsButton.addActionListener(e -> {
            JFrame combatTracker = new JFrame();
            BeastDetails panel;
            panel = new BeastDetails(beastList.beasts.get(Integer.parseInt(VId.getText())));
            combatTracker.setContentPane(panel.getDetails());
            combatTracker.setDefaultCloseOperation(combatTracker.DISPOSE_ON_CLOSE);
            combatTracker.setSize(1100, 500);
            combatTracker.setVisible(true);
        });
    }

    public JPanel getmainPanel() {
        return mainPanel;
    }

    private void saveNew(KnownSpell knownSpell) {
        VId.setText(beastList.beasts.size() + "");
        //Saving to array list
        Beast current = new Beast(
                Name.getText(),
                Class.getText(),
                Level.getText(),
                Race.getText(),
                Aligment.getSelectedItem().toString(),
                Size.getText(),
                getMod(VStrength),
                getMod(VDexterity),
                getMod(VConstitution),
                getMod(VInteligence),
                getMod(VWisdom),
                getMod(VCharisma),
                getMod(Profieciency),
                getMod(Initiative),
                getMod(Speed),
                getMod(HitPoints),
                getMod(VSTstr),
                getMod(VSTdex),
                getMod(VSTconst),
                getMod(VSTint),
                getMod(VSTwis),
                getMod(VSTchar),
                getMod(VAcrobatic),
                getMod(VAnimal),
                getMod(VArcana),
                getMod(VAthletics),
                getMod(VDeception),
                getMod(VHistory),
                getMod(VInsight),
                getMod(VIntimidation),
                getMod(VInvestigation),
                getMod(VMedicine),
                getMod(VNature),
                getMod(VPerception),
                getMod(VPerformance),
                getMod(VPersuasion),
                getMod(VReligion),
                getMod(VSoH),
                getMod(VStealth),
                getMod(VSurvival),
                getMod(VPasiveWisdom),
                VAnS.getText(),
                VFnT.getText(),
                VEq.getText(),
                VLnP.getText(),
                knownSpell,
                PSTstr.isSelected(),
                PSTdex.isSelected(),
                PSTconst.isSelected(),
                PSTint.isSelected(),
                PSTwis.isSelected(),
                PSTchar.isSelected(),
                PAcrobatic.isSelected(),
                PAnimal.isSelected(),
                PArcana.isSelected(),
                PAthletics.isSelected(),
                PDeception.isSelected(),
                PHistory.isSelected(),
                PInsight.isSelected(),
                PIntimidation.isSelected(),
                PInvestigation.isSelected(),
                PMedicine.isSelected(),
                PNature.isSelected(),
                PPerception.isSelected(),
                PPerformance.isSelected(),
                PPersuasion.isSelected(),
                PReligion.isSelected(),
                PSoH.isSelected(),
                PStealth.isSelected(),
                PSurvival.isSelected(),
                SpellcastingClass.getSelectedItem().toString(),
                VSpellType.getSelectedItem().toString(),
                getMod(VSpellDC),
                getMod(VSpellAB),
                getMod(AMana),
                getMod(ASTstr),
                getMod(ASTdex),
                getMod(ASTconst),
                getMod(ASTint),
                getMod(ASTwis),
                getMod(ASTchar),
                getMod(AAcrobatic),
                getMod(AAnimal),
                getMod(AArcana),
                getMod(AAthletics),
                getMod(ADeception),
                getMod(AHistory),
                getMod(AInsight),
                getMod(AIntimidation),
                getMod(AInvestigation),
                getMod(AMedicine),
                getMod(ANature),
                getMod(APerception),
                getMod(APerformance),
                getMod(APersuasion),
                getMod(AReligion),
                getMod(ASoH),
                getMod(AStealth),
                getMod(ASurvival),
                getMod(APasiveWisdom),
                getMod(ASpellDC),
                getMod(ASpellAB),
                getMod(Strength),
                getMod(Dexterity),
                getMod(Constitution),
                getMod(Inteligence),
                getMod(Wisdom),
                getMod(Charisma),
                getMod(ACSieczne),
                getMod(ACObuch),
                getMod(ACKlote),
                getMod(VArkanizm),
                getMod(Arkanizm),
                getMod(VSTarc),
                PSTarc.isSelected(),
                getMod(ASTarc),
                getMod(VAlchemy),
                getMod(AAlchemy),
                PAlchemy.isSelected(),
                getMod(VSmithing),
                getMod(ASmithing),
                PSmithing.isSelected(),
                getMod(VArmorsmith),
                getMod(AArmorsmith),
                PArmorsmith.isSelected(),
                getMod(VCrafting),
                getMod(ACrafting),
                PCrafting.isSelected(),
                getMod(VMagicSenses),
                getMod(AMagicSenses),
                PMagicSenses.isSelected(),
                getMod(VEnchanting),
                getMod(AEnchanting),
                PEnchanting.isSelected());
        beastList.add(current);
    }

    private void saveChanges(KnownSpell knownSpell) {
        beastList.beasts.get(getMod(VId)).setName(Name.getText());
        beastList.beasts.get(getMod(VId)).setClasss(Class.getText());
        beastList.beasts.get(getMod(VId)).setLevel(Level.getText());
        beastList.beasts.get(getMod(VId)).setRace(Race.getText());
        beastList.beasts.get(getMod(VId)).setAligment(Aligment.getSelectedItem().toString());
        beastList.beasts.get(getMod(VId)).setSize(Size.getText());
        beastList.beasts.get(getMod(VId)).setStr(getMod(VStrength));
        beastList.beasts.get(getMod(VId)).setDex(getMod(VDexterity));
        beastList.beasts.get(getMod(VId)).setCon(getMod(VConstitution));
        beastList.beasts.get(getMod(VId)).setInte(getMod(VInteligence));
        beastList.beasts.get(getMod(VId)).setWis(getMod(VWisdom));
        beastList.beasts.get(getMod(VId)).setCha(getMod(VCharisma));
        beastList.beasts.get(getMod(VId)).setProf(getMod(Profieciency));
        beastList.beasts.get(getMod(VId)).setInit(getMod(Initiative));
        beastList.beasts.get(getMod(VId)).setSpeed(getMod(Speed));
        beastList.beasts.get(getMod(VId)).setMaxhp(getMod(HitPoints));
        beastList.beasts.get(getMod(VId)).setSTstr(getMod(VSTstr));
        beastList.beasts.get(getMod(VId)).setSTdex(getMod(VSTdex));
        beastList.beasts.get(getMod(VId)).setSTcon(getMod(VSTconst));
        beastList.beasts.get(getMod(VId)).setSTint(getMod(VSTint));
        beastList.beasts.get(getMod(VId)).setSTwis(getMod(VSTwis));
        beastList.beasts.get(getMod(VId)).setSTcha(getMod(VSTchar));
        beastList.beasts.get(getMod(VId)).setSacro(getMod(VAcrobatic));
        beastList.beasts.get(getMod(VId)).setSanH(getMod(VAnimal));
        beastList.beasts.get(getMod(VId)).setSarca(getMod(VArcana));
        beastList.beasts.get(getMod(VId)).setSath(getMod(VAthletics));
        beastList.beasts.get(getMod(VId)).setSdec(getMod(VDeception));
        beastList.beasts.get(getMod(VId)).setShis(getMod(VHistory));
        beastList.beasts.get(getMod(VId)).setSinsig(getMod(VInsight));
        beastList.beasts.get(getMod(VId)).setSintim(getMod(VIntimidation));
        beastList.beasts.get(getMod(VId)).setSinvest(getMod(VInvestigation));
        beastList.beasts.get(getMod(VId)).setSmedic(getMod(VMedicine));
        beastList.beasts.get(getMod(VId)).setSnatu(getMod(VNature));
        beastList.beasts.get(getMod(VId)).setSpercept(getMod(VPerception));
        beastList.beasts.get(getMod(VId)).setSperform(getMod(VPerformance));
        beastList.beasts.get(getMod(VId)).setSpersuas(getMod(VPersuasion));
        beastList.beasts.get(getMod(VId)).setSrel(getMod(VReligion));
        beastList.beasts.get(getMod(VId)).setSSoH(getMod(VSoH));
        beastList.beasts.get(getMod(VId)).setSstelt(getMod(VStealth));
        beastList.beasts.get(getMod(VId)).setSsurv(getMod(VSurvival));
        beastList.beasts.get(getMod(VId)).setSPasivWis(getMod(VPasiveWisdom));
        beastList.beasts.get(getMod(VId)).setAnS(VAnS.getText());
        beastList.beasts.get(getMod(VId)).setFnT(VFnT.getText());
        beastList.beasts.get(getMod(VId)).setEq(VEq.getText());
        beastList.beasts.get(getMod(VId)).setLnP(VLnP.getText());
        beastList.beasts.get(getMod(VId)).setKnownSpell(knownSpell);
        beastList.beasts.get(getMod(VId)).setPSTstr(PSTstr.isSelected());
        beastList.beasts.get(getMod(VId)).setPSTdex(PSTdex.isSelected());
        beastList.beasts.get(getMod(VId)).setPSTcon(PSTconst.isSelected());
        beastList.beasts.get(getMod(VId)).setPSTint(PSTint.isSelected());
        beastList.beasts.get(getMod(VId)).setPSTwis(PSTwis.isSelected());
        beastList.beasts.get(getMod(VId)).setPSTchar(PSTchar.isSelected());
        beastList.beasts.get(getMod(VId)).setPSacro(PAcrobatic.isSelected());
        beastList.beasts.get(getMod(VId)).setPSanH(PAnimal.isSelected());
        beastList.beasts.get(getMod(VId)).setPSarca(PArcana.isSelected());
        beastList.beasts.get(getMod(VId)).setPSath(PAthletics.isSelected());
        beastList.beasts.get(getMod(VId)).setPSdec(PDeception.isSelected());
        beastList.beasts.get(getMod(VId)).setPShis(PHistory.isSelected());
        beastList.beasts.get(getMod(VId)).setPSinsig(PInsight.isSelected());
        beastList.beasts.get(getMod(VId)).setPSintim(PIntimidation.isSelected());
        beastList.beasts.get(getMod(VId)).setPSinvest(PInvestigation.isSelected());
        beastList.beasts.get(getMod(VId)).setPSmedic(PMedicine.isSelected());
        beastList.beasts.get(getMod(VId)).setPSnatu(PNature.isSelected());
        beastList.beasts.get(getMod(VId)).setPSpercept(PPerception.isSelected());
        beastList.beasts.get(getMod(VId)).setPSperform(PPerformance.isSelected());
        beastList.beasts.get(getMod(VId)).setPSpersuas(PPersuasion.isSelected());
        beastList.beasts.get(getMod(VId)).setPSrel(PReligion.isSelected());
        beastList.beasts.get(getMod(VId)).setPSSoH(PSoH.isSelected());
        beastList.beasts.get(getMod(VId)).setPSstelt(PStealth.isSelected());
        beastList.beasts.get(getMod(VId)).setPSsurv(PSurvival.isSelected());
        beastList.beasts.get(getMod(VId)).setSpellClass(SpellcastingClass.getSelectedItem().toString());
        beastList.beasts.get(getMod(VId)).setSpellAbility(VSpellType.getSelectedItem().toString());
        beastList.beasts.get(getMod(VId)).setSpellDC(getMod(VSpellDC));
        beastList.beasts.get(getMod(VId)).setSpellAC(getMod(VSpellAB));
        beastList.beasts.get(getMod(VId)).setMana(getMod(AMana));
        beastList.beasts.get(getMod(VId)).setASTstr(getMod(ASTstr));
        beastList.beasts.get(getMod(VId)).setASTdex(getMod(ASTdex));
        beastList.beasts.get(getMod(VId)).setASTcon(getMod(ASTconst));
        beastList.beasts.get(getMod(VId)).setASTint(getMod(ASTint));
        beastList.beasts.get(getMod(VId)).setASTwis(getMod(ASTwis));
        beastList.beasts.get(getMod(VId)).setASTcha(getMod(ASTchar));
        beastList.beasts.get(getMod(VId)).setASacro(getMod(AAcrobatic));
        beastList.beasts.get(getMod(VId)).setASanH(getMod(AAnimal));
        beastList.beasts.get(getMod(VId)).setASarca(getMod(AArcana));
        beastList.beasts.get(getMod(VId)).setASath(getMod(AAthletics));
        beastList.beasts.get(getMod(VId)).setASdec(getMod(ADeception));
        beastList.beasts.get(getMod(VId)).setAShis(getMod(AHistory));
        beastList.beasts.get(getMod(VId)).setASinsig(getMod(AInsight));
        beastList.beasts.get(getMod(VId)).setASintim(getMod(AIntimidation));
        beastList.beasts.get(getMod(VId)).setASinvest(getMod(AInvestigation));
        beastList.beasts.get(getMod(VId)).setASmedic(getMod(AMedicine));
        beastList.beasts.get(getMod(VId)).setASnatu(getMod(ANature));
        beastList.beasts.get(getMod(VId)).setASpercept(getMod(APerception));
        beastList.beasts.get(getMod(VId)).setASperform(getMod(APerformance));
        beastList.beasts.get(getMod(VId)).setASpersuas(getMod(APersuasion));
        beastList.beasts.get(getMod(VId)).setASrel(getMod(AReligion));
        beastList.beasts.get(getMod(VId)).setASSoH(getMod(ASoH));
        beastList.beasts.get(getMod(VId)).setASstelt(getMod(AStealth));
        beastList.beasts.get(getMod(VId)).setASsurv(getMod(ASurvival));
        beastList.beasts.get(getMod(VId)).setASPasivWis(getMod(APasiveWisdom));
        beastList.beasts.get(getMod(VId)).setASpellDC(getMod(ASpellDC));
        beastList.beasts.get(getMod(VId)).setASpellAC(getMod(ASpellAB));
        beastList.beasts.get(getMod(VId)).setAstr(getMod(Strength));
        beastList.beasts.get(getMod(VId)).setAdex(getMod(Dexterity));
        beastList.beasts.get(getMod(VId)).setAcon(getMod(Constitution));
        beastList.beasts.get(getMod(VId)).setAinte(getMod(Inteligence));
        beastList.beasts.get(getMod(VId)).setAwis(getMod(Wisdom));
        beastList.beasts.get(getMod(VId)).setAcha(getMod(Charisma));
        beastList.beasts.get(getMod(VId)).setkPSieczne(getMod(ACSieczne));
        beastList.beasts.get(getMod(VId)).setkPObuch(getMod(ACObuch));
        beastList.beasts.get(getMod(VId)).setkPKlote(getMod(ACKlote));
        beastList.beasts.get(getMod(VId)).setArcanum(getMod(VArkanizm));
        beastList.beasts.get(getMod(VId)).setAarc(getMod(Arkanizm));
        beastList.beasts.get(getMod(VId)).setSTarc(getMod(VSTarc));
        beastList.beasts.get(getMod(VId)).setPSTarc(PSTarc.isSelected());
        beastList.beasts.get(getMod(VId)).setASTarc(getMod(ASTarc));
        beastList.beasts.get(getMod(VId)).setAlchemy(getMod(VAlchemy));
        beastList.beasts.get(getMod(VId)).setAAlchemy(getMod(AAlchemy));
        beastList.beasts.get(getMod(VId)).setPAlchemy(PAlchemy.isSelected());
        beastList.beasts.get(getMod(VId)).setSmithing(getMod(VSmithing));
        beastList.beasts.get(getMod(VId)).setASmithing(getMod(ASmithing));
        beastList.beasts.get(getMod(VId)).setPSmithing(PSmithing.isSelected());
        beastList.beasts.get(getMod(VId)).setArmorsmithing(getMod(VArmorsmith));
        beastList.beasts.get(getMod(VId)).setAArmorsmithing(getMod(AArmorsmith));
        beastList.beasts.get(getMod(VId)).setPArmorsmithing(PArmorsmith.isSelected());
        beastList.beasts.get(getMod(VId)).setCrafting(getMod(VCrafting));
        beastList.beasts.get(getMod(VId)).setACrafting(getMod(ACrafting));
        beastList.beasts.get(getMod(VId)).setPCrafting(PCrafting.isSelected());
        beastList.beasts.get(getMod(VId)).setMagicSensen(getMod(VMagicSenses));
        beastList.beasts.get(getMod(VId)).setAMagicSensen(getMod(AMagicSenses));
        beastList.beasts.get(getMod(VId)).setPMagicSensen(PMagicSenses.isSelected());
        beastList.beasts.get(getMod(VId)).setEnchanting(getMod(VEnchanting));
        beastList.beasts.get(getMod(VId)).setAEnchanting(getMod(AEnchanting));
        beastList.beasts.get(getMod(VId)).setPEnchanting(PEnchanting.isSelected());
    }

    private void reset() {
        VId.setText(beastList.beasts.size() + "");
        Name.setText(null);
        Class.setText(null);
        Level.setText(null);
        Race.setText(null);
        Aligment.setSelectedIndex(0);
        Size.setText(null);
        Strength.setText(null);
        VStrength.setText(null);
        Dexterity.setText(null);
        VDexterity.setText(null);
        Constitution.setText(null);
        VConstitution.setText(null);
        Inteligence.setText(null);
        VInteligence.setText(null);
        Wisdom.setText(null);
        VWisdom.setText(null);
        Charisma.setText(null);
        VCharisma.setText(null);
        Profieciency.setText(null);
        Initiative.setText(null);
        Speed.setText(null);
        HitPoints.setText(null);
        ASTstr.setText(null);
        VSTstr.setText(null);
        ASTdex.setText(null);
        VSTdex.setText(null);
        ASTconst.setText(null);
        VSTconst.setText(null);
        ASTint.setText(null);
        VSTint.setText(null);
        ASTwis.setText(null);
        VSTwis.setText(null);
        ASTchar.setText(null);
        VSTchar.setText(null);
        AAcrobatic.setText(null);
        VAcrobatic.setText(null);
        AAnimal.setText(null);
        VAnimal.setText(null);
        AArcana.setText(null);
        VArcana.setText(null);
        AAthletics.setText(null);
        VAthletics.setText(null);
        ADeception.setText(null);
        VDeception.setText(null);
        AHistory.setText(null);
        VHistory.setText(null);
        AInsight.setText(null);
        VInsight.setText(null);
        AIntimidation.setText(null);
        VIntimidation.setText(null);
        AInvestigation.setText(null);
        VInvestigation.setText(null);
        AMedicine.setText(null);
        VMedicine.setText(null);
        ANature.setText(null);
        VNature.setText(null);
        APerception.setText(null);
        VPerception.setText(null);
        APerformance.setText(null);
        VPerformance.setText(null);
        APersuasion.setText(null);
        VPersuasion.setText(null);
        AReligion.setText(null);
        VReligion.setText(null);
        ASoH.setText(null);
        VSoH.setText(null);
        AStealth.setText(null);
        VStealth.setText(null);
        ASurvival.setText(null);
        VSurvival.setText(null);
        APasiveWisdom.setText(null);
        VPasiveWisdom.setText(null);
        VAnS.setText(null);
        VFnT.setText(null);
        VEq.setText(null);
        VLnP.setText(null);
        PSTstr.setSelected(false);
        PSTdex.setSelected(false);
        PSTconst.setSelected(false);
        PSTint.setSelected(false);
        PSTwis.setSelected(false);
        PSTchar.setSelected(false);
        PAcrobatic.setSelected(false);
        PAnimal.setSelected(false);
        PArcana.setSelected(false);
        PAthletics.setSelected(false);
        PDeception.setSelected(false);
        PHistory.setSelected(false);
        PInsight.setSelected(false);
        PIntimidation.setSelected(false);
        PInvestigation.setSelected(false);
        PMedicine.setSelected(false);
        PNature.setSelected(false);
        PPerception.setSelected(false);
        PPerformance.setSelected(false);
        PPersuasion.setSelected(false);
        PReligion.setSelected(false);
        PSoH.setSelected(false);
        PStealth.setSelected(false);
        PSurvival.setSelected(false);
        SpellcastingClass.setSelectedIndex(0);
        VSpellType.setSelectedIndex(0);
        ASpellDC.setText(null);
        VSpellDC.setText(null);
        ASpellAB.setText(null);
        VSpellAB.setText(null);
        AMana.setText(null);
        ACSieczne.setText(null);
        ACObuch.setText(null);
        ACKlote.setText(null);
        VArkanizm.setText(null);
        Arkanizm.setText(null);
        VSTarc.setText(null);
        PSTarc.setSelected(false);
        ASTarc.setText(null);
        VAlchemy.setText(null);
        AAlchemy.setText(null);
        PAlchemy.setSelected(false);
        VSmithing.setText(null);
        ASmithing.setText(null);
        PSmithing.setSelected(false);
        VArmorsmith.setText(null);
        AArmorsmith.setText(null);
        PArmorsmith.setSelected(false);
        VCrafting.setText(null);
        ACrafting.setText(null);
        PCrafting.setSelected(false);
        VMagicSenses.setText(null);
        AMagicSenses.setText(null);
        PMagicSenses.setSelected(false);
        VEnchanting.setText(null);
        AEnchanting.setText(null);
        PEnchanting.setSelected(false);
        resetSpells();
    }

    private void resetSpells() {
        Component[] Circle = Circles.getComponents();
        for (Component circle : Circle) {
            JPanel panel = (JPanel) circle;
            Component[] components = panel.getComponents();
            JScrollPane spellListScroll = (JScrollPane) components[0];

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

    private KnownSpell getSpells() {
        KnownSpell spells = new KnownSpell();
        Component[] Circle = Circles.getComponents();
        for (Component circle : Circle) {
            JPanel panel = (JPanel) circle;
            Component[] components = panel.getComponents();
            JScrollPane spellListScroll = (JScrollPane) components[0];
            JLabel circleName = (JLabel) components[1];
            int spellLevel;
            if (circleName.getText().contains("Cantrip")) spellLevel = 0;
            else spellLevel = Integer.parseInt(circleName.getText());
            Component[] listcomponents = spellListScroll.getComponents();
            JViewport viewport = (JViewport) listcomponents[0];
            JPanel spellList = (JPanel) viewport.getView();
            Component[] spellsInCircle = spellList.getComponents();
            for (Component onespell : spellsInCircle) {
                JPanel onespell2 = (JPanel) onespell;
                JTextField name = (JTextField) onespell2.getComponent(0);
                JTextField cost = (JTextField) onespell2.getComponent(1);
                JTextArea descr = (JTextArea) onespell2.getComponent(2);
                spells.book.get(spellLevel).addSpell(name.getText(), cost.getText(), descr.getText());
            }
        }
        return spells;
    }

    private static int getStat(KeyEvent press, JTextField pole) {
        String temp;
        int value;
        if (press.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
            temp = pole.getText();
        } else {
            temp = pole.getText() + press.getKeyChar();
        }
        try {
            value = Integer.parseInt(temp);
        } catch (Exception error) {
            value = 0;
        }
        if (value >= 10) {
            value = (value - 10) / 2;
        } else {
            value = (value - 11) / 2;
        }
        return value;
    }

    private static int getMod(JTextField pole) {
        int value;
        try {
            value = Integer.parseInt(pole.getText());
        } catch (Exception error) {
            value = 0;
        }
        return value;
    }

    private void writeStats(KeyEvent e, List<JTextField> pola, List<JCheckBox> polaCheck) {
        //Pure Stat
        String prefix = "";
        int pureStat = getStat(e, pola.get(1));
        if (pureStat >= 0) {
            prefix = "+";
        }
        pola.get(2).setText(prefix + pureStat);
        //Saving Throw
        int SavingThrow;
        if (polaCheck.get(0).isSelected()) {
            SavingThrow = pureStat + getMod(pola.get(0)) + getMod(pola.get(3));
        } else {
            SavingThrow = pureStat + getMod(pola.get(3));
        }
        if (SavingThrow >= 0) {
            prefix = "+";
        } else {
            prefix = "";
        }
        pola.get(4).setText(prefix + SavingThrow);
        //Skills
        int j = 1;
        for (int i = 5; i < pola.size(); i = i + 2) {
            int skillValue;
            if (polaCheck.get(j).isSelected()) {
                skillValue = pureStat + getMod(pola.get(0)) + getMod(pola.get(i));
            } else {
                skillValue = pureStat + getMod(pola.get(i));
            }
            if (skillValue >= 0) {
                prefix = "+";
            } else {
                prefix = "";
            }
            pola.get(i + 1).setText(prefix + skillValue);
            j++;
        }

    }

    private int getTyped(KeyEvent press, JTextField pole) {
        String temp;
        int value;
        if (press.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
            temp = pole.getText();
        } else {
            temp = pole.getText() + press.getKeyChar();
        }
        try {
            value = Integer.parseInt(temp);
        } catch (Exception error) {
            value = 0;
        }
        return value;
    }

    private int readStat(JLabel label, String[] checking) {
        int pureStat;
        if (label.getText().contains(checking[0])) {
            pureStat = getMod(VStrength);
        } else if (label.getText().contains(checking[1])) {
            pureStat = getMod(VDexterity);
        } else if (label.getText().contains(checking[2])) {
            pureStat = getMod(VConstitution);
        } else if (label.getText().contains(checking[3])) {
            pureStat = getMod(VInteligence);
        } else if (label.getText().contains(checking[4])) {
            pureStat = getMod(VWisdom);
        } else if (label.getText().contains(checking[5])) {
            pureStat = getMod(VCharisma);
        } else if (label.getText().contains(checking[6])) {
            pureStat = getMod(VArkanizm);
        } else {
            pureStat = 0;
        }
        return pureStat;
    }

    private int getSpellAbilityType(JComboBox type) {
        int value;
        switch (type.getSelectedItem().toString()) {
            case "Inteligence" -> value = getMod(VInteligence);
            case "Wisdom" -> value = getMod(VWisdom);
            case "Charisma" -> value = getMod(VCharisma);
            case "Arcanum" -> value = getMod(VArkanizm);
            default -> value = 0;
        }
        return value;
    }

    private void makeSpell(JPanel what, JButton action, JPanel where, int level, String spellname, JButton chose) {
        action.addActionListener(e -> {
            where.remove(what);
            if (saved)
                beastList.beasts.get(getMod(VId)).getKnownSpell().book.get(level).removeSpell(spellname);
            where.revalidate();
        });
        chose.addActionListener(e -> {
            //Odnośnik do zaklęcia w spellbook
            try {
                SpellDetails chosenSpell = spellBooks
                        .book
                        .get(level)
                        .spells
                        .stream()
                        .filter(spellDetails -> spellDetails.getName().equals(spellname))
                        .findFirst()
                        .orElseThrow(() -> null);
                JFrame spelldetail = new JFrame();
                SpellsDetails newPanel = new SpellsDetails(spellBooks, level, chosenSpell.getId().toString());
                spelldetail.setContentPane(newPanel.getDetail());
                spelldetail.setDefaultCloseOperation(spelldetail.DISPOSE_ON_CLOSE);
                spelldetail.setSize(500, 500);
                spelldetail.setVisible(true);
            } catch (Throwable ex) {
                System.out.println(ex.getMessage());
            }
        });
        what.add(action);
        what.add(chose);
        where.add(what);
        where.revalidate();
    }

    private void readBeast(int id) {
        VId.setText(id + "");
        Name.setText(beastList.beasts.get(id).getName());
        Class.setText(beastList.beasts.get(id).getClasss());
        Level.setText(beastList.beasts.get(id).getLevel());
        Race.setText(beastList.beasts.get(id).getRace());
        Aligment.setSelectedItem(beastList.beasts.get(id).getAligment());
        Size.setText(beastList.beasts.get(id).getSize());
        Strength.setText(beastList.beasts.get(id).getAstr() + "");
        VStrength.setText(beastList.beasts.get(id).getStr() + "");
        Dexterity.setText(beastList.beasts.get(id).getAdex() + "");
        VDexterity.setText(beastList.beasts.get(id).getDex() + "");
        Constitution.setText(beastList.beasts.get(id).getAcon() + "");
        VConstitution.setText(beastList.beasts.get(id).getCon() + "");
        Inteligence.setText(beastList.beasts.get(id).getAinte() + "");
        VInteligence.setText(beastList.beasts.get(id).getInte() + "");
        Wisdom.setText(beastList.beasts.get(id).getAwis() + "");
        VWisdom.setText(beastList.beasts.get(id).getWis() + "");
        Charisma.setText(beastList.beasts.get(id).getAcha() + "");
        VCharisma.setText(beastList.beasts.get(id).getCha() + "");
        Profieciency.setText(beastList.beasts.get(id).getProf() + "");
        Initiative.setText(beastList.beasts.get(id).getInit() + "");
        Speed.setText(beastList.beasts.get(id).getSpeed() + "");
        HitPoints.setText(beastList.beasts.get(id).getMaxhp() + "");
        ASTstr.setText(beastList.beasts.get(id).getASTstr() + "");
        VSTstr.setText(beastList.beasts.get(id).getSTstr() + "");
        ASTdex.setText(beastList.beasts.get(id).getASTdex() + "");
        VSTdex.setText(beastList.beasts.get(id).getSTdex() + "");
        ASTconst.setText(beastList.beasts.get(id).getASTcon() + "");
        VSTconst.setText(beastList.beasts.get(id).getSTcon() + "");
        ASTint.setText(beastList.beasts.get(id).getASTint() + "");
        VSTint.setText(beastList.beasts.get(id).getSTint() + "");
        ASTwis.setText(beastList.beasts.get(id).getASTwis() + "");
        VSTwis.setText(beastList.beasts.get(id).getSTwis() + "");
        ASTchar.setText(beastList.beasts.get(id).getASTcha() + "");
        VSTchar.setText(beastList.beasts.get(id).getSTcha() + "");
        AAcrobatic.setText(beastList.beasts.get(id).getASacro() + "");
        VAcrobatic.setText(beastList.beasts.get(id).getSacro() + "");
        AAnimal.setText(beastList.beasts.get(id).getASanH() + "");
        VAnimal.setText(beastList.beasts.get(id).getSanH() + "");
        AArcana.setText(beastList.beasts.get(id).getASarca() + "");
        VArcana.setText(beastList.beasts.get(id).getSarca() + "");
        AAthletics.setText(beastList.beasts.get(id).getASath() + "");
        VAthletics.setText(beastList.beasts.get(id).getSath() + "");
        ADeception.setText(beastList.beasts.get(id).getASdec() + "");
        VDeception.setText(beastList.beasts.get(id).getSdec() + "");
        AHistory.setText(beastList.beasts.get(id).getAShis() + "");
        VHistory.setText(beastList.beasts.get(id).getShis() + "");
        AInsight.setText(beastList.beasts.get(id).getASinsig() + "");
        VInsight.setText(beastList.beasts.get(id).getSinsig() + "");
        AIntimidation.setText(beastList.beasts.get(id).getASintim() + "");
        VIntimidation.setText(beastList.beasts.get(id).getSintim() + "");
        AInvestigation.setText(beastList.beasts.get(id).getASinvest() + "");
        VInvestigation.setText(beastList.beasts.get(id).getSinvest() + "");
        AMedicine.setText(beastList.beasts.get(id).getASmedic() + "");
        VMedicine.setText(beastList.beasts.get(id).getSmedic() + "");
        ANature.setText(beastList.beasts.get(id).getASnatu() + "");
        VNature.setText(beastList.beasts.get(id).getSnatu() + "");
        APerception.setText(beastList.beasts.get(id).getASpercept() + "");
        VPerception.setText(beastList.beasts.get(id).getSpercept() + "");
        APerformance.setText(beastList.beasts.get(id).getASperform() + "");
        VPerformance.setText(beastList.beasts.get(id).getSperform() + "");
        APersuasion.setText(beastList.beasts.get(id).getASpersuas() + "");
        VPersuasion.setText(beastList.beasts.get(id).getSpersuas() + "");
        AReligion.setText(beastList.beasts.get(id).getASrel() + "");
        VReligion.setText(beastList.beasts.get(id).getSrel() + "");
        ASoH.setText(beastList.beasts.get(id).getASSoH() + "");
        VSoH.setText(beastList.beasts.get(id).getSSoH() + "");
        AStealth.setText(beastList.beasts.get(id).getASstelt() + "");
        VStealth.setText(beastList.beasts.get(id).getSstelt() + "");
        ASurvival.setText(beastList.beasts.get(id).getASsurv() + "");
        VSurvival.setText(beastList.beasts.get(id).getSsurv() + "");
        APasiveWisdom.setText(beastList.beasts.get(id).getASPasivWis() + "");
        VPasiveWisdom.setText(beastList.beasts.get(id).getSPasivWis() + "");
        VAnS.setText(beastList.beasts.get(id).getAnS());
        VFnT.setText(beastList.beasts.get(id).getFnT());
        VEq.setText(beastList.beasts.get(id).getEq());
        VLnP.setText(beastList.beasts.get(id).getLnP());
        PSTstr.setSelected(beastList.beasts.get(id).isPSTstr()); //TUTAJ EDYTOWAC DALEJ
        PSTdex.setSelected(beastList.beasts.get(id).isPSTdex());
        PSTconst.setSelected(beastList.beasts.get(id).isPSTcon());
        PSTint.setSelected(beastList.beasts.get(id).isPSTint());
        PSTwis.setSelected(beastList.beasts.get(id).isPSTwis());
        PSTchar.setSelected(beastList.beasts.get(id).isPSTchar());
        PAcrobatic.setSelected(beastList.beasts.get(id).isPSacro());
        PAnimal.setSelected(beastList.beasts.get(id).isPSanH());
        PArcana.setSelected(beastList.beasts.get(id).isPSarca());
        PAthletics.setSelected(beastList.beasts.get(id).isPSath());
        PDeception.setSelected(beastList.beasts.get(id).isPSdec());
        PHistory.setSelected(beastList.beasts.get(id).isPShis());
        PInsight.setSelected(beastList.beasts.get(id).isPSinsig());
        PIntimidation.setSelected(beastList.beasts.get(id).isPSintim());
        PInvestigation.setSelected(beastList.beasts.get(id).isPSinvest());
        PMedicine.setSelected(beastList.beasts.get(id).isPSmedic());
        PNature.setSelected(beastList.beasts.get(id).isPSnatu());
        PPerception.setSelected(beastList.beasts.get(id).isPSpercept());
        PPerformance.setSelected(beastList.beasts.get(id).isPSperform());
        PPersuasion.setSelected(beastList.beasts.get(id).isPSpersuas());
        PReligion.setSelected(beastList.beasts.get(id).isPSrel());
        PSoH.setSelected(beastList.beasts.get(id).isPSSoH());
        PStealth.setSelected(beastList.beasts.get(id).isPSstelt());
        PSurvival.setSelected(beastList.beasts.get(id).isPSsurv());
        SpellcastingClass.setSelectedItem(beastList.beasts.get(id).getSpellClass());
        VSpellType.setSelectedItem(beastList.beasts.get(id).getSpellAbility());
        ASpellDC.setText(beastList.beasts.get(id).getASpellDC() + "");
        VSpellDC.setText(beastList.beasts.get(id).getSpellDC() + "");
        ASpellAB.setText(beastList.beasts.get(id).getASpellAC() + "");
        VSpellAB.setText(beastList.beasts.get(id).getSpellAC() + "");
        AMana.setText(beastList.beasts.get(id).getMana() + "");
        ACSieczne.setText(beastList.beasts.get(id).getkPSieczne() + "");
        ACObuch.setText(beastList.beasts.get(id).getkPObuch() + "");
        ACKlote.setText(beastList.beasts.get(id).getkPKlote() + "");
        VArkanizm.setText(beastList.beasts.get(id).getArcanum() + "");
        Arkanizm.setText(beastList.beasts.get(id).getAarc() + "");
        VSTarc.setText(beastList.beasts.get(id).getSTarc() + "");
        PSTarc.setSelected(beastList.beasts.get(id).isPSTarc());
        ASTarc.setText(beastList.beasts.get(id).getASTarc() + "");
        VAlchemy.setText(beastList.beasts.get(id).getAlchemy() + "");
        AAlchemy.setText(beastList.beasts.get(id).getAAlchemy() + "");
        PAlchemy.setSelected(beastList.beasts.get(id).isPAlchemy());
        VSmithing.setText(beastList.beasts.get(id).getSmithing() + "");
        ASmithing.setText(beastList.beasts.get(id).getASmithing() + "");
        PSmithing.setSelected(beastList.beasts.get(id).isPSmithing());
        VArmorsmith.setText(beastList.beasts.get(id).getArmorsmithing() + "");
        AArmorsmith.setText(beastList.beasts.get(id).getAArmorsmithing() + "");
        PArmorsmith.setSelected(beastList.beasts.get(id).isPArmorsmithing());
        VCrafting.setText(beastList.beasts.get(id).getCrafting() + "");
        ACrafting.setText(beastList.beasts.get(id).getACrafting() + "");
        PCrafting.setSelected(beastList.beasts.get(id).isPCrafting());
        VMagicSenses.setText(beastList.beasts.get(id).getMagicSensen() + "");
        AMagicSenses.setText(beastList.beasts.get(id).getAMagicSensen() + "");
        PMagicSenses.setSelected(beastList.beasts.get(id).isPMagicSensen());
        VEnchanting.setText(beastList.beasts.get(id).getEnchanting() + "");
        AEnchanting.setText(beastList.beasts.get(id).getAEnchanting() + "");
        PEnchanting.setSelected(beastList.beasts.get(id).isPEnchanting());
        //Pomysł na spellbooka
        List<Circle> circles = beastList.beasts.get(id).getKnownSpell().book;
        for (Circle circle : circles) {
            int level = circle.getLevel();
            for (Spell spellR : circle.spells) {

                JPanel spell = new JPanel();
                spell.setLayout(new FlowLayout());
                JTextField spellName = new JTextField(spellR.getName());
                spellName.setColumns(10);
                JTextField spellManaCost = new JTextField(spellR.getManacost());
                spellManaCost.setColumns(5);
                JTextArea spellDescryption = new JTextArea(spellR.getDescription());
                spellDescryption.setColumns(10);
                spellDescryption.setLineWrap(true);
                spellDescryption.setWrapStyleWord(true);
                spell.add(spellName);
                spell.add(spellManaCost);
                spell.add(spellDescryption);
                JButton usunspell = new JButton();
                usunspell.setText("Delete");
                JButton wybierzspell = new JButton();
                wybierzspell.setText("Details");
                switch (level) {
                    case 0 -> makeSpell(spell, usunspell, CantripPane, level, spellName.getText(), wybierzspell);
                    case 1 -> makeSpell(spell, usunspell, FirstPane, level, spellName.getText(), wybierzspell);
                    case 2 -> makeSpell(spell, usunspell, SecondPane, level, spellName.getText(), wybierzspell);
                    case 3 -> makeSpell(spell, usunspell, ThirdPane, level, spellName.getText(), wybierzspell);
                    case 4 -> makeSpell(spell, usunspell, ForthPane, level, spellName.getText(), wybierzspell);
                    case 5 -> makeSpell(spell, usunspell, FifthPane, level, spellName.getText(), wybierzspell);
                    case 6 -> makeSpell(spell, usunspell, SixthPane, level, spellName.getText(), wybierzspell);
                    case 7 -> makeSpell(spell, usunspell, SeventhPane, level, spellName.getText(), wybierzspell);
                    case 8 -> makeSpell(spell, usunspell, EighthPane, level, spellName.getText(), wybierzspell);
                    case 9 -> makeSpell(spell, usunspell, NinthPane, level, spellName.getText(), wybierzspell);
                }
            }
        }
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
            JButton selectForBestiary = new JButton("Select");
            selectForBestiary.addActionListener(e -> {
                AtomicInteger selID = new AtomicInteger();
                beastList.beasts.forEach(beast1 -> {
                    if (beast.getName().equals(beast1.getName()) && beast.getLevel().equals(beast1.getLevel())){
                        reset();
                        readBeast(selID.get());
                    }
                    selID.getAndIncrement();
                });
            });
            newLineBeast.add(name);
            newLineBeast.add(level);
            newLineBeast.add(classs);
            newLineBeast.add(race);
            newLineBeast.add(aligment);
            newLineBeast.add(size);
            newLineBeast.add(selectForBestiary);
            CreaturesListPane.add(newLineBeast);
        });
    }

    public void resetSideList() {
        for (Component component : CreaturesListPane.getComponents()) {
            CreaturesListPane.remove(component);
        }
        CreaturesListPane.revalidate();
    }

    public void saveToFile() {
        try {
            Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
            Writer writer = new FileWriter("beasts.json");
            prettyGson.toJson(beastList, writer);
            writer.close();
        } catch (IOException er) {
            er.printStackTrace();
        }
        /*try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("bestiary.dat"))) {
            out.writeObject(beastList);
        } catch (FileNotFoundException er) {
            er.printStackTrace();
        } catch (IOException er) {
            er.printStackTrace();
        }*/
    }
}

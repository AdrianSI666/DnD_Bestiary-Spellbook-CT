package com.as;

import javax.swing.*;
import java.awt.*;

public class BeastDetails {
    private JTextField Name;
    private JTextField Class;
    private JTextField Level;
    private JTextField Race;
    private JComboBox Aligment;
    private JTextField Size;
    private JPanel Details;
    private JPanel Bestiarry;
    private JPanel Descryption;
    private JLabel LName;
    private JLabel LClass;
    private JLabel LLevel;
    private JLabel LRace;
    private JLabel LAligment;
    private JLabel LSize;
    private JPanel Stats;
    private JLabel LStrength;
    private JTextField VStrength;
    private JLabel LDexteriy;
    private JTextField VDexterity;
    private JLabel LConstitution;
    private JTextField VConstitution;
    private JLabel LInteligence;
    private JTextField VInteligence;
    private JLabel LWisdom;
    private JTextField VWisdom;
    private JLabel LCharisma;
    private JTextField VCharisma;
    private JLabel LArkanizm;
    private JTextField VArkanizm;
    private JPanel bestiary2;
    private JPanel SnS;
    private JPanel SavThrow;
    private JPanel STValues;
    private JTextField VSTstr;
    private JTextField VSTdex;
    private JTextField VSTconst;
    private JTextField VSTint;
    private JTextField VSTwis;
    private JTextField VSTchar;
    private JTextField VSTarc;
    private JPanel STLabels;
    private JLabel LSTstr;
    private JLabel LSTdex;
    private JLabel LSTconst;
    private JLabel LSTint;
    private JLabel LSTwis;
    private JLabel LSTchar;
    private JLabel LSTarc;
    private JLabel ST;
    private JScrollPane SkillScroll;
    private JPanel Skills;
    private JLabel Sk;
    private JPanel SLabels;
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
    private JPanel SValues;
    private JTextField VAcrobatic;
    private JTextField VAnimal;
    private JTextField VArcana;
    private JTextField VAthletics;
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
    private JTextField VAlchemy;
    private JTextField VArmorsmith;
    private JTextField VCrafting;
    private JTextField VEnchanting;
    private JTextField VMagicSenses;
    private JTextField VSmithing;
    private JPanel Combat;
    private JLabel LProfieciency;
    private JTextField Profieciency;
    private JLabel Lac;
    private JTextField ACSieczne;
    private JTextField ACObuch;
    private JTextField ACKlote;
    private JLabel LInitiative;
    private JTextField Initiative;
    private JLabel LSpeed;
    private JTextField Speed;
    private JLabel LHitPoints;
    private JTextField HitPoints;
    private JPanel Info;
    private JScrollPane FnT;
    private JTextArea VFnT;
    private JScrollPane Eq;
    private JTextArea VEq;
    private JScrollPane LangnProf;
    private JTextArea VLnP;
    private JLabel LAnS;
    private JLabel LFnT;
    private JLabel LEq;
    private JLabel LLnP;
    private JScrollPane ScrollAnS;
    private JTextArea VAnS;
    private JTabbedPane tabbedPane1;
    private JPanel Spells;
    private JScrollPane SpellsScroll;
    private JPanel Circles;
    private JPanel Cantrips;
    private JScrollPane CantripScrollPane;
    private JPanel CantripPane;
    private JLabel LCantrips;
    private JPanel First;
    private JScrollPane FirstScrollPane;
    private JPanel FirstPane;
    private JLabel FirstSpell;
    private JPanel Second;
    private JScrollPane SecondScrollPane;
    private JPanel SecondPane;
    private JLabel SecondSpell;
    private JPanel Third;
    private JScrollPane ThirdScrollPane;
    private JPanel ThirdPane;
    private JLabel ThirdSpell;
    private JPanel Forth;
    private JScrollPane ForthScrollPane;
    private JPanel ForthPane;
    private JLabel ForthSpell;
    private JPanel Fifth;
    private JScrollPane FifthScrollPane;
    private JPanel FifthPane;
    private JLabel FifthSpell;
    private JPanel Sixth;
    private JScrollPane SixthScrollPane;
    private JPanel SixthPane;
    private JLabel SixthSpell;
    private JPanel Seventh;
    private JScrollPane SeventhScrollPane;
    private JPanel SeventhPane;
    private JLabel SeventhSpell;
    private JPanel Eighth;
    private JScrollPane EighthScrollPane;
    private JPanel EighthPane;
    private JLabel EighthSpell;
    private JPanel Ninth;
    private JScrollPane NinthScrollPane;
    private JPanel NinthPane;
    private JLabel NinthSpell;
    private JComboBox SpellcastingClass;
    private JLabel Lsc;
    private JLabel Lsa;
    private JComboBox VSpellType;
    private JLabel LsDC;
    private JTextField VSpellDC;
    private JLabel LSpellAB;
    private JTextField VSpellAB;
    private JLabel LMana;
    private JTextField AMana;
    private JTextField Strength;
    private JTextField Dexterity;
    private JTextField Constitution;
    private JTextField Inteligence;
    private JTextField Wisdom;
    private JTextField Charisma;
    private JTextField Arkanizm;
    private JTextArea notes;

    public BeastDetails(Beast beast) {
        Name.setText(beast.getName());
        Class.setText(beast.getClasss());
        Level.setText(beast.getLevel());
        Race.setText(beast.getRace());
        Aligment.setSelectedItem(beast.getAligment());
        Size.setText(beast.getSize());
        //Staty
        VStrength.setText(beast.getStr() + "");
        VDexterity.setText(beast.getDex() + "");
        VConstitution.setText(beast.getCon() + "");
        VInteligence.setText(beast.getInte() + "");
        VWisdom.setText(beast.getWis() + "");
        VCharisma.setText(beast.getCha() + "");
        VArkanizm.setText(beast.getArcanum() + "");
        Strength.setText(beast.getAstr() + "");
        Dexterity.setText(beast.getAdex() + "");
        Constitution.setText(beast.getAcon() + "");
        Inteligence.setText(beast.getAinte() + "");
        Wisdom.setText(beast.getAwis() + "");
        Charisma.setText(beast.getAcha() + "");
        Arkanizm.setText(beast.getAarc() + "");
        //Profy
        Profieciency.setText(beast.getProf() + "");
        ACSieczne.setText(beast.getkPSieczne() + "");
        ACObuch.setText(beast.getkPObuch() + "");
        ACKlote.setText(beast.getkPKlote() + "");
        Initiative.setText(beast.getInit() + "");
        Speed.setText(beast.getSpeed() + "");
        HitPoints.setText(beast.getMaxhp() + "");
        //ST
        VSTstr.setText(beast.getSTstr() + "");
        VSTdex.setText(beast.getSTdex() + "");
        VSTconst.setText(beast.getSTcon() + "");
        VSTint.setText(beast.getSTint() + "");
        VSTwis.setText(beast.getSTwis() + "");
        VSTchar.setText(beast.getSTcha() + "");
        VSTarc.setText(beast.getArcanum() + "");
        //Skills
        VAcrobatic.setText(beast.getSacro() + "");
        VAnimal.setText(beast.getSanH() + "");
        VArcana.setText(beast.getSarca() + "");
        VAthletics.setText(beast.getSath() + "");
        VDeception.setText(beast.getSdec() + "");
        VHistory.setText(beast.getShis() + "");
        VInsight.setText(beast.getSinsig() + "");
        VIntimidation.setText(beast.getSintim() + "");
        VInvestigation.setText(beast.getSinvest() + "");
        VMedicine.setText(beast.getSmedic() + "");
        VNature.setText(beast.getSnatu() + "");
        VPerception.setText(beast.getSpercept() + "");
        VPerformance.setText(beast.getSperform() + "");
        VPersuasion.setText(beast.getSpersuas() + "");
        VReligion.setText(beast.getSrel() + "");
        VSoH.setText(beast.getSSoH() + "");
        VStealth.setText(beast.getSstelt() + "");
        VSurvival.setText(beast.getSsurv() + "");
        VPasiveWisdom.setText(beast.getSPasivWis() + "");
        VAlchemy.setText(beast.getAlchemy() + "");
        VArmorsmith.setText(beast.getArmorsmithing() + "");
        VCrafting.setText(beast.getCrafting() + "");
        VEnchanting.setText(beast.getEnchanting() + "");
        VMagicSenses.setText(beast.getMagicSensen() + "");
        VSmithing.setText(beast.getSmithing() + "");
        //Info
        VFnT.setText(beast.getFnT());
        VEq.setText(beast.getEq());
        VAnS.setText(beast.getAnS());
        VLnP.setText(beast.getLnP());
        //Spelle
        SpellcastingClass.setSelectedItem(beast.getSpellClass());
        VSpellType.setSelectedItem(beast.getSpellAbility());
        VSpellDC.setText(beast.getSpellDC() + "");
        VSpellAB.setText(beast.getSpellAC() + "");
        AMana.setText(beast.getMana() + "");
        CantripPane.setLayout(new BoxLayout(CantripPane,BoxLayout.PAGE_AXIS));
        FirstPane.setLayout(new BoxLayout(FirstPane,BoxLayout.PAGE_AXIS));
        SecondPane.setLayout(new BoxLayout(SecondPane,BoxLayout.PAGE_AXIS));
        ThirdPane.setLayout(new BoxLayout(ThirdPane,BoxLayout.PAGE_AXIS));
        ForthPane.setLayout(new BoxLayout(ForthPane,BoxLayout.PAGE_AXIS));
        FifthPane.setLayout(new BoxLayout(FifthPane,BoxLayout.PAGE_AXIS));
        SixthPane.setLayout(new BoxLayout(SixthPane,BoxLayout.PAGE_AXIS));
        SeventhPane.setLayout(new BoxLayout(SeventhPane,BoxLayout.PAGE_AXIS));
        EighthPane.setLayout(new BoxLayout(EighthPane,BoxLayout.PAGE_AXIS));
        NinthPane.setLayout(new BoxLayout(NinthPane,BoxLayout.PAGE_AXIS));
        beast.getKnownSpell().book.forEach(circle-> {
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
                JButton wybierzspell = new JButton();
                wybierzspell.setText("Details");
                switch (level) {
                    case 0 -> makeSpell(spell, CantripPane);
                    case 1 -> makeSpell(spell, FirstPane);
                    case 2 -> makeSpell(spell, SecondPane);
                    case 3 -> makeSpell(spell, ThirdPane);
                    case 4 -> makeSpell(spell, ForthPane);
                    case 5 -> makeSpell(spell, FifthPane);
                    case 6 -> makeSpell(spell, SixthPane);
                    case 7 -> makeSpell(spell, SeventhPane);
                    case 8 -> makeSpell(spell, EighthPane);
                    case 9 -> makeSpell(spell, NinthPane);
                }
            }
        });
    }

    private void makeSpell(JPanel what, JPanel where) {
        /*chose.addActionListener(e -> {
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
        });*/
        where.add(what);
        where.revalidate();
    }

    public JPanel getDetails() {
        return Details;
    }
}

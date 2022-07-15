package com.as;

import java.io.Serializable;

public class Beast implements Serializable {
    private String name;
    private String classs;
    private String level;
    private String race;
    private String aligment;
    private String size;
    private int str;
    private int dex;
    private int con;
    private int inte;
    private int wis;
    private int cha;
    private int prof;
    private int kPSieczne;
    private int kPObuch;
    private int kPKlote;

    private int init;
    private int speed;
    private int maxhp;
    private int STstr;
    private int STdex;
    private int STcon;
    private int STint;
    private int STwis;
    private int STcha;
    private int Sacro;
    private int SanH;
    private int Sarca;
    private int Sath;
    private int Sdec;
    private int Shis;
    private int Sinsig;
    private int Sintim;
    private int Sinvest;
    private int Smedic;
    private int Snatu;
    private int Spercept;
    private int Sperform;
    private int Spersuas;
    private int Srel;
    private int SSoH;
    private int Sstelt;
    private int Ssurv;
    private int SPasivWis;
    private String AnS;
    private String FnT;
    private String Eq;
    private String LnP;
    private KnownSpell knownSpell;
    private boolean PSTstr;
    private boolean PSTdex;
    private boolean PSTcon;
    private boolean PSTint;
    private boolean PSTwis;
    private boolean PSTchar;
    private boolean PSacro;
    private boolean PSanH;
    private boolean PSarca;
    private boolean PSath;
    private boolean PSdec;
    private boolean PShis;
    private boolean PSinsig;
    private boolean PSintim;
    private boolean PSinvest;
    private boolean PSmedic;
    private boolean PSnatu;
    private boolean PSpercept;
    private boolean PSperform;
    private boolean PSpersuas;
    private boolean PSrel;
    private boolean PSSoH;
    private boolean PSstelt;
    private boolean PSsurv;

    private String SpellClass;
    private String SpellAbility;
    private int SpellDC;
    private int SpellAC;
    private int mana;

    private int ASTstr;
    private int ASTdex;
    private int ASTcon;
    private int ASTint;
    private int ASTwis;
    private int ASTcha;
    private int ASacro;
    private int ASanH;
    private int ASarca;
    private int ASath;
    private int ASdec;
    private int AShis;
    private int ASinsig;
    private int ASintim;
    private int ASinvest;
    private int ASmedic;
    private int ASnatu;
    private int ASpercept;
    private int ASperform;
    private int ASpersuas;
    private int ASrel;
    private int ASSoH;
    private int ASstelt;
    private int ASsurv;
    private int ASPasivWis;
    private int ASpellDC;
    private int ASpellAC;

    private int Astr;
    private int Adex;
    private int Acon;
    private int Ainte;
    private int Awis;
    private int Acha;
    private int arcanum;
    private int Aarc;
    private int STarc;
    private int ASTarc;
    private boolean PSTarc;
    private int Alchemy;
    private int AAlchemy;
    private boolean PAlchemy;
    private int Smithing;
    private int ASmithing;
    private boolean PSmithing;
    private int Armorsmithing;
    private int AArmorsmithing;
    private boolean PArmorsmithing;
    private int Crafting;
    private int ACrafting;
    private boolean PCrafting;
    private int MagicSensen;
    private int AMagicSensen;
    private boolean PMagicSensen;
    private int Enchanting;
    private int AEnchanting;
    private boolean PEnchanting;

    public Beast() {
    }

    @Override
    public String toString() {
        return "Beast{" +
                "name='" + name + '\'' +
                ", classs='" + classs + '\'' +
                ", level='" + level + '\'' +
                ", race='" + race + '\'' +
                ", aligment='" + aligment + '\'' +
                ", size='" + size + '\'' +
                ", str=" + str +
                ", dex=" + dex +
                ", con=" + con +
                ", inte=" + inte +
                ", wis=" + wis +
                ", cha=" + cha +
                ", prof=" + prof +
                ", kPSieczne=" + kPSieczne +
                ", kPObuch=" + kPObuch +
                ", kPKlote=" + kPKlote +
                ", init=" + init +
                ", speed=" + speed +
                ", maxhp=" + maxhp +
                ", STstr=" + STstr +
                ", STdex=" + STdex +
                ", STcon=" + STcon +
                ", STint=" + STint +
                ", STwis=" + STwis +
                ", STcha=" + STcha +
                ", Sacro=" + Sacro +
                ", SanH=" + SanH +
                ", Sarca=" + Sarca +
                ", Sath=" + Sath +
                ", Sdec=" + Sdec +
                ", Shis=" + Shis +
                ", Sinsig=" + Sinsig +
                ", Sintim=" + Sintim +
                ", Sinvest=" + Sinvest +
                ", Smedic=" + Smedic +
                ", Snatu=" + Snatu +
                ", Spercept=" + Spercept +
                ", Sperform=" + Sperform +
                ", Spersuas=" + Spersuas +
                ", Srel=" + Srel +
                ", SSoH=" + SSoH +
                ", Sstelt=" + Sstelt +
                ", Ssurv=" + Ssurv +
                ", SPasivWis=" + SPasivWis +
                ", AnS='" + AnS + '\'' +
                ", FnT='" + FnT + '\'' +
                ", Eq='" + Eq + '\'' +
                ", LnP='" + LnP + '\'' +
                ", knownSpell=" + knownSpell +
                ", PSTstr=" + PSTstr +
                ", PSTdex=" + PSTdex +
                ", PSTcon=" + PSTcon +
                ", PSTint=" + PSTint +
                ", PSTwis=" + PSTwis +
                ", PSTchar=" + PSTchar +
                ", PSacro=" + PSacro +
                ", PSanH=" + PSanH +
                ", PSarca=" + PSarca +
                ", PSath=" + PSath +
                ", PSdec=" + PSdec +
                ", PShis=" + PShis +
                ", PSinsig=" + PSinsig +
                ", PSintim=" + PSintim +
                ", PSinvest=" + PSinvest +
                ", PSmedic=" + PSmedic +
                ", PSnatu=" + PSnatu +
                ", PSpercept=" + PSpercept +
                ", PSperform=" + PSperform +
                ", PSpersuas=" + PSpersuas +
                ", PSrel=" + PSrel +
                ", PSSoH=" + PSSoH +
                ", PSstelt=" + PSstelt +
                ", PSsurv=" + PSsurv +
                ", SpellClass='" + SpellClass + '\'' +
                ", SpellAbility='" + SpellAbility + '\'' +
                ", SpellDC=" + SpellDC +
                ", SpellAC=" + SpellAC +
                ", mana=" + mana +
                ", ASTstr=" + ASTstr +
                ", ASTdex=" + ASTdex +
                ", ASTcon=" + ASTcon +
                ", ASTint=" + ASTint +
                ", ASTwis=" + ASTwis +
                ", ASTcha=" + ASTcha +
                ", ASacro=" + ASacro +
                ", ASanH=" + ASanH +
                ", ASarca=" + ASarca +
                ", ASath=" + ASath +
                ", ASdec=" + ASdec +
                ", AShis=" + AShis +
                ", ASinsig=" + ASinsig +
                ", ASintim=" + ASintim +
                ", ASinvest=" + ASinvest +
                ", ASmedic=" + ASmedic +
                ", ASnatu=" + ASnatu +
                ", ASpercept=" + ASpercept +
                ", ASperform=" + ASperform +
                ", ASpersuas=" + ASpersuas +
                ", ASrel=" + ASrel +
                ", ASSoH=" + ASSoH +
                ", ASstelt=" + ASstelt +
                ", ASsurv=" + ASsurv +
                ", ASPasivWis=" + ASPasivWis +
                ", ASpellDC=" + ASpellDC +
                ", ASpellAC=" + ASpellAC +
                ", Astr=" + Astr +
                ", Adex=" + Adex +
                ", Acon=" + Acon +
                ", Ainte=" + Ainte +
                ", Awis=" + Awis +
                ", Acha=" + Acha +
                ", arcanum=" + arcanum +
                ", Aarc=" + Aarc +
                ", STarc=" + STarc +
                ", ASTarc=" + ASTarc +
                ", PSTarc=" + PSTarc +
                ", Alchemy=" + Alchemy +
                ", AAlchemy=" + AAlchemy +
                ", PAlchemy=" + PAlchemy +
                ", Smithing=" + Smithing +
                ", ASmithing=" + ASmithing +
                ", PSmithing=" + PSmithing +
                ", Armorsmithing=" + Armorsmithing +
                ", AArmorsmithing=" + AArmorsmithing +
                ", PArmorsmithing=" + PArmorsmithing +
                ", Crafting=" + Crafting +
                ", ACrafting=" + ACrafting +
                ", PCrafting=" + PCrafting +
                ", MagicSensen=" + MagicSensen +
                ", AMagicSensen=" + AMagicSensen +
                ", PMagicSensen=" + PMagicSensen +
                ", Enchanting=" + Enchanting +
                ", AEnchanting=" + AEnchanting +
                ", PEnchanting=" + PEnchanting +
                '}';
    }

    public Beast(String name, String classs, String level, String race, String aligment, String size, int str, int dex, int con, int inte, int wis, int cha, int prof, int init, int speed, int maxhp, int STstr, int STdex, int STcon, int STint, int STwis, int STcha, int sacro, int sanH, int sarca, int sath, int sdec, int shis, int sinsig, int sintim, int sinvest, int smedic, int snatu, int spercept, int sperform, int spersuas, int srel, int SSoH, int sstelt, int ssurv, int SPasivWis, String anS, String fnT, String eq, String lnP, KnownSpell knownSpell, boolean PSTstr, boolean PSTdex, boolean PSTcon, boolean PSTint, boolean PSTwis, boolean PSTchar, boolean PSacro, boolean PSanH, boolean PSarca, boolean PSath, boolean PSdec, boolean PShis, boolean PSinsig, boolean PSintim, boolean PSinvest, boolean PSmedic, boolean PSnatu, boolean PSpercept, boolean PSperform, boolean PSpersuas, boolean PSrel, boolean PSSoH, boolean PSstelt, boolean PSsurv, String spellClass, String spellAbility, int spellDC, int spellAC, int mana, int ASTstr, int ASTdex, int ASTcon, int ASTint, int ASTwis, int ASTcha, int ASacro, int ASanH, int ASarca, int ASath, int ASdec, int AShis, int ASinsig, int ASintim, int ASinvest, int ASmedic, int ASnatu, int ASpercept, int ASperform, int ASpersuas, int ASrel, int ASSoH, int ASstelt, int ASsurv, int ASPasivWis, int ASpellDC, int ASpellAC, int astr, int adex, int acon, int ainte, int awis, int acha, int kpsieczne, int kpoboch, int kpklote, int arcanum,
                 int Aarc,
                 int STarc,
                 boolean PSTarc,
                 int ASTarc,
                 int Salchemy,
                 int ASalchemy,
                 boolean PSalchemy,
                 int Ssmithing,
                 int ASsmithing,
                 boolean PSsmithing,
                 int Sarmorsmithing,
                 int ASarmorsmithing,
                 boolean PSarmorsmithing,
                 int Scrafting,
                 int AScrafting,
                 boolean PScrafting,
                 int SmagicSensen,
                 int ASmagicSensen,
                 boolean PSmagicSensen,
                 int SEnchanting,
                 int ASEnchanting,
                 boolean PSEnchanting) {

        this.name = name;
        this.classs = classs;
        this.level = level;
        this.race = race;
        this.aligment = aligment;
        this.size = size;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.inte = inte;
        this.wis = wis;
        this.cha = cha;
        this.prof = prof;
        this.init = init;
        this.speed = speed;
        this.maxhp = maxhp;
        this.STstr = STstr;
        this.STdex = STdex;
        this.STcon = STcon;
        this.STint = STint;
        this.STwis = STwis;
        this.STcha = STcha;
        Sacro = sacro;
        SanH = sanH;
        Sarca = sarca;
        Sath = sath;
        Sdec = sdec;
        Shis = shis;
        Sinsig = sinsig;
        Sintim = sintim;
        Sinvest = sinvest;
        Smedic = smedic;
        Snatu = snatu;
        Spercept = spercept;
        Sperform = sperform;
        Spersuas = spersuas;
        Srel = srel;
        this.SSoH = SSoH;
        Sstelt = sstelt;
        Ssurv = ssurv;
        this.SPasivWis = SPasivWis;
        AnS = anS;
        FnT = fnT;
        Eq = eq;
        LnP = lnP;
        this.knownSpell = knownSpell;
        this.PSTstr = PSTstr;
        this.PSTdex = PSTdex;
        this.PSTcon = PSTcon;
        this.PSTint = PSTint;
        this.PSTwis = PSTwis;
        this.PSTchar = PSTchar;
        this.PSacro = PSacro;
        this.PSanH = PSanH;
        this.PSarca = PSarca;
        this.PSath = PSath;
        this.PSdec = PSdec;
        this.PShis = PShis;
        this.PSinsig = PSinsig;
        this.PSintim = PSintim;
        this.PSinvest = PSinvest;
        this.PSmedic = PSmedic;
        this.PSnatu = PSnatu;
        this.PSpercept = PSpercept;
        this.PSperform = PSperform;
        this.PSpersuas = PSpersuas;
        this.PSrel = PSrel;
        this.PSSoH = PSSoH;
        this.PSstelt = PSstelt;
        this.PSsurv = PSsurv;
        SpellClass = spellClass;
        SpellAbility = spellAbility;
        SpellDC = spellDC;
        SpellAC = spellAC;
        this.mana = mana;
        this.ASTstr = ASTstr;
        this.ASTdex = ASTdex;
        this.ASTcon = ASTcon;
        this.ASTint = ASTint;
        this.ASTwis = ASTwis;
        this.ASTcha = ASTcha;
        this.ASacro = ASacro;
        this.ASanH = ASanH;
        this.ASarca = ASarca;
        this.ASath = ASath;
        this.ASdec = ASdec;
        this.AShis = AShis;
        this.ASinsig = ASinsig;
        this.ASintim = ASintim;
        this.ASinvest = ASinvest;
        this.ASmedic = ASmedic;
        this.ASnatu = ASnatu;
        this.ASpercept = ASpercept;
        this.ASperform = ASperform;
        this.ASpersuas = ASpersuas;
        this.ASrel = ASrel;
        this.ASSoH = ASSoH;
        this.ASstelt = ASstelt;
        this.ASsurv = ASsurv;
        this.ASPasivWis = ASPasivWis;
        this.ASpellDC = ASpellDC;
        this.ASpellAC = ASpellAC;
        Astr = astr;
        Adex = adex;
        Acon = acon;
        Ainte = ainte;
        Awis = awis;
        Acha = acha;
        this.kPSieczne = kpsieczne;
        this.kPObuch = kpoboch;
        this.kPKlote = kpklote;
        this.arcanum = arcanum;
        this.Aarc = Aarc;
        this.STarc = STarc;
        this.PSTarc = PSTarc;
        this.ASTarc = ASTarc;
        this.Alchemy = Salchemy;
        this.AAlchemy = ASalchemy;
        this.PAlchemy = PSalchemy;
        this.Smithing = Ssmithing;
        this.ASmithing = ASsmithing;
        this.PSmithing = PSsmithing;
        this.Armorsmithing = Sarmorsmithing;
        this.AArmorsmithing = ASarmorsmithing;
        this.PArmorsmithing = PSarmorsmithing;
        this.Crafting = Scrafting;
        this.ACrafting = AScrafting;
        this.PCrafting = PScrafting;
        this.MagicSensen = SmagicSensen;
        this.AMagicSensen = ASmagicSensen;
        this.PMagicSensen = PSmagicSensen;
        this.Enchanting = SEnchanting;
        this.AEnchanting = ASEnchanting;
        this.PEnchanting = PSEnchanting;
    }

    public int getAlchemy() {
        return Alchemy;
    }

    public void setAlchemy(int alchemy) {
        Alchemy = alchemy;
    }

    public int getAAlchemy() {
        return AAlchemy;
    }

    public void setAAlchemy(int AAlchemy) {
        this.AAlchemy = AAlchemy;
    }

    public boolean isPAlchemy() {
        return PAlchemy;
    }

    public void setPAlchemy(boolean PAlchemy) {
        this.PAlchemy = PAlchemy;
    }

    public int getSmithing() {
        return Smithing;
    }

    public void setSmithing(int smithing) {
        Smithing = smithing;
    }

    public int getASmithing() {
        return ASmithing;
    }

    public void setASmithing(int ASmithing) {
        this.ASmithing = ASmithing;
    }

    public boolean isPSmithing() {
        return PSmithing;
    }

    public void setPSmithing(boolean PSmithing) {
        this.PSmithing = PSmithing;
    }

    public int getArmorsmithing() {
        return Armorsmithing;
    }

    public void setArmorsmithing(int armorsmithing) {
        Armorsmithing = armorsmithing;
    }

    public int getAArmorsmithing() {
        return AArmorsmithing;
    }

    public void setAArmorsmithing(int AArmorsmithing) {
        this.AArmorsmithing = AArmorsmithing;
    }

    public boolean isPArmorsmithing() {
        return PArmorsmithing;
    }

    public void setPArmorsmithing(boolean PArmorsmithing) {
        this.PArmorsmithing = PArmorsmithing;
    }

    public int getCrafting() {
        return Crafting;
    }

    public void setCrafting(int crafting) {
        Crafting = crafting;
    }

    public int getACrafting() {
        return ACrafting;
    }

    public void setACrafting(int ACrafting) {
        this.ACrafting = ACrafting;
    }

    public boolean isPCrafting() {
        return PCrafting;
    }

    public void setPCrafting(boolean PCrafting) {
        this.PCrafting = PCrafting;
    }

    public int getMagicSensen() {
        return MagicSensen;
    }

    public void setMagicSensen(int magicSensen) {
        MagicSensen = magicSensen;
    }

    public int getAMagicSensen() {
        return AMagicSensen;
    }

    public void setAMagicSensen(int AMagicSensen) {
        this.AMagicSensen = AMagicSensen;
    }

    public boolean isPMagicSensen() {
        return PMagicSensen;
    }

    public void setPMagicSensen(boolean PMagicSensen) {
        this.PMagicSensen = PMagicSensen;
    }

    public int getEnchanting() {
        return Enchanting;
    }

    public void setEnchanting(int enchanting) {
        Enchanting = enchanting;
    }

    public int getAEnchanting() {
        return AEnchanting;
    }

    public void setAEnchanting(int AEnchanting) {
        this.AEnchanting = AEnchanting;
    }

    public boolean isPEnchanting() {
        return PEnchanting;
    }

    public void setPEnchanting(boolean PEnchanting) {
        this.PEnchanting = PEnchanting;
    }

    public int getArcanum() {
        return arcanum;
    }

    public void setArcanum(int arcanum) {
        this.arcanum = arcanum;
    }

    public int getAarc() {
        return Aarc;
    }

    public void setAarc(int aarc) {
        Aarc = aarc;
    }

    public int getSTarc() {
        return STarc;
    }

    public void setSTarc(int STarc) {
        this.STarc = STarc;
    }

    public int getASTarc() {
        return ASTarc;
    }

    public void setASTarc(int ASTarc) {
        this.ASTarc = ASTarc;
    }

    public boolean isPSTarc() {
        return PSTarc;
    }

    public void setPSTarc(boolean PSTarc) {
        this.PSTarc = PSTarc;
    }

    public int getkPSieczne() {
        return kPSieczne;
    }

    public void setkPSieczne(int kPSieczne) {
        this.kPSieczne = kPSieczne;
    }

    public int getkPObuch() {
        return kPObuch;
    }

    public void setkPObuch(int kPObuch) {
        this.kPObuch = kPObuch;
    }

    public int getkPKlote() {
        return kPKlote;
    }

    public void setkPKlote(int kPKlote) {
        this.kPKlote = kPKlote;
    }

    public String getName() {
        return name;
    }

    public String getClasss() {
        return classs;
    }

    public String getLevel() {
        return level;
    }

    public String getRace() {
        return race;
    }

    public String getAligment() {
        return aligment;
    }

    public String getSize() {
        return size;
    }

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getCon() {
        return con;
    }

    public int getInte() {
        return inte;
    }

    public int getWis() {
        return wis;
    }

    public int getCha() {
        return cha;
    }

    public int getProf() {
        return prof;
    }

    public int getInit() {
        return init;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public int getSTstr() {
        return STstr;
    }

    public int getSTdex() {
        return STdex;
    }

    public int getSTcon() {
        return STcon;
    }

    public int getSTint() {
        return STint;
    }

    public int getSTwis() {
        return STwis;
    }

    public int getSTcha() {
        return STcha;
    }

    public int getSacro() {
        return Sacro;
    }

    public int getSanH() {
        return SanH;
    }

    public int getSarca() {
        return Sarca;
    }

    public int getSath() {
        return Sath;
    }

    public int getSdec() {
        return Sdec;
    }

    public int getShis() {
        return Shis;
    }

    public int getSinsig() {
        return Sinsig;
    }

    public int getSintim() {
        return Sintim;
    }

    public int getSinvest() {
        return Sinvest;
    }

    public int getSmedic() {
        return Smedic;
    }

    public int getSnatu() {
        return Snatu;
    }

    public int getSpercept() {
        return Spercept;
    }

    public int getSperform() {
        return Sperform;
    }

    public int getSpersuas() {
        return Spersuas;
    }

    public int getSrel() {
        return Srel;
    }

    public int getSSoH() {
        return SSoH;
    }

    public int getSstelt() {
        return Sstelt;
    }

    public int getSsurv() {
        return Ssurv;
    }

    public int getSPasivWis() {
        return SPasivWis;
    }

    public String getAnS() {
        return AnS;
    }

    public String getFnT() {
        return FnT;
    }

    public String getEq() {
        return Eq;
    }

    public String getLnP() {
        return LnP;
    }

    public KnownSpell getKnownSpell() {
        return knownSpell;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAligment(String aligment) {
        this.aligment = aligment;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    public void setProf(int prof) {
        this.prof = prof;
    }

    public void setInit(int init) {
        this.init = init;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public void setSTstr(int STstr) {
        this.STstr = STstr;
    }

    public void setSTdex(int STdex) {
        this.STdex = STdex;
    }

    public void setSTcon(int STcon) {
        this.STcon = STcon;
    }

    public void setSTint(int STint) {
        this.STint = STint;
    }

    public void setSTwis(int STwis) {
        this.STwis = STwis;
    }

    public void setSTcha(int STcha) {
        this.STcha = STcha;
    }

    public void setSacro(int sacro) {
        Sacro = sacro;
    }

    public void setSanH(int sanH) {
        SanH = sanH;
    }

    public void setSarca(int sarca) {
        Sarca = sarca;
    }

    public void setSath(int sath) {
        Sath = sath;
    }

    public void setSdec(int sdec) {
        Sdec = sdec;
    }

    public void setShis(int shis) {
        Shis = shis;
    }

    public void setSinsig(int sinsig) {
        Sinsig = sinsig;
    }

    public void setSintim(int sintim) {
        Sintim = sintim;
    }

    public void setSinvest(int sinvest) {
        Sinvest = sinvest;
    }

    public void setSmedic(int smedic) {
        Smedic = smedic;
    }

    public void setSnatu(int snatu) {
        Snatu = snatu;
    }

    public void setSpercept(int spercept) {
        Spercept = spercept;
    }

    public void setSperform(int sperform) {
        Sperform = sperform;
    }

    public void setSpersuas(int spersuas) {
        Spersuas = spersuas;
    }

    public void setSrel(int srel) {
        Srel = srel;
    }

    public void setSSoH(int SSoH) {
        this.SSoH = SSoH;
    }

    public void setSstelt(int sstelt) {
        Sstelt = sstelt;
    }

    public void setSsurv(int ssurv) {
        Ssurv = ssurv;
    }

    public void setSPasivWis(int SPasivWis) {
        this.SPasivWis = SPasivWis;
    }

    public void setAnS(String anS) {
        AnS = anS;
    }

    public void setFnT(String fnT) {
        FnT = fnT;
    }

    public void setEq(String eq) {
        Eq = eq;
    }

    public void setLnP(String lnP) {
        LnP = lnP;
    }

    public void setKnownSpell(KnownSpell knownSpell) {
        this.knownSpell = knownSpell;
    }

    public boolean isPSTstr() {
        return PSTstr;
    }

    public void setPSTstr(boolean PSTstr) {
        this.PSTstr = PSTstr;
    }

    public boolean isPSTdex() {
        return PSTdex;
    }

    public void setPSTdex(boolean PSTdex) {
        this.PSTdex = PSTdex;
    }

    public boolean isPSTcon() {
        return PSTcon;
    }

    public void setPSTcon(boolean PSTcon) {
        this.PSTcon = PSTcon;
    }

    public boolean isPSTint() {
        return PSTint;
    }

    public void setPSTint(boolean PSTint) {
        this.PSTint = PSTint;
    }

    public boolean isPSTwis() {
        return PSTwis;
    }

    public void setPSTwis(boolean PSTwis) {
        this.PSTwis = PSTwis;
    }

    public boolean isPSTchar() {
        return PSTchar;
    }

    public void setPSTchar(boolean PSTchar) {
        this.PSTchar = PSTchar;
    }

    public boolean isPSacro() {
        return PSacro;
    }

    public void setPSacro(boolean PSacro) {
        this.PSacro = PSacro;
    }

    public boolean isPSanH() {
        return PSanH;
    }

    public void setPSanH(boolean PSanH) {
        this.PSanH = PSanH;
    }

    public boolean isPSarca() {
        return PSarca;
    }

    public void setPSarca(boolean PSarca) {
        this.PSarca = PSarca;
    }

    public boolean isPSath() {
        return PSath;
    }

    public void setPSath(boolean PSath) {
        this.PSath = PSath;
    }

    public boolean isPSdec() {
        return PSdec;
    }

    public void setPSdec(boolean PSdec) {
        this.PSdec = PSdec;
    }

    public boolean isPShis() {
        return PShis;
    }

    public void setPShis(boolean PShis) {
        this.PShis = PShis;
    }

    public boolean isPSinsig() {
        return PSinsig;
    }

    public void setPSinsig(boolean PSinsig) {
        this.PSinsig = PSinsig;
    }

    public boolean isPSintim() {
        return PSintim;
    }

    public void setPSintim(boolean PSintim) {
        this.PSintim = PSintim;
    }

    public boolean isPSinvest() {
        return PSinvest;
    }

    public void setPSinvest(boolean PSinvest) {
        this.PSinvest = PSinvest;
    }

    public boolean isPSmedic() {
        return PSmedic;
    }

    public void setPSmedic(boolean PSmedic) {
        this.PSmedic = PSmedic;
    }

    public boolean isPSnatu() {
        return PSnatu;
    }

    public void setPSnatu(boolean PSnatu) {
        this.PSnatu = PSnatu;
    }

    public boolean isPSpercept() {
        return PSpercept;
    }

    public void setPSpercept(boolean PSpercept) {
        this.PSpercept = PSpercept;
    }

    public boolean isPSperform() {
        return PSperform;
    }

    public void setPSperform(boolean PSperform) {
        this.PSperform = PSperform;
    }

    public boolean isPSpersuas() {
        return PSpersuas;
    }

    public void setPSpersuas(boolean PSpersuas) {
        this.PSpersuas = PSpersuas;
    }

    public boolean isPSrel() {
        return PSrel;
    }

    public void setPSrel(boolean PSrel) {
        this.PSrel = PSrel;
    }

    public boolean isPSSoH() {
        return PSSoH;
    }

    public void setPSSoH(boolean PSSoH) {
        this.PSSoH = PSSoH;
    }

    public boolean isPSstelt() {
        return PSstelt;
    }

    public void setPSstelt(boolean PSstelt) {
        this.PSstelt = PSstelt;
    }

    public boolean isPSsurv() {
        return PSsurv;
    }

    public void setPSsurv(boolean PSsurv) {
        this.PSsurv = PSsurv;
    }

    public String getSpellClass() {
        return SpellClass;
    }

    public void setSpellClass(String spellClass) {
        SpellClass = spellClass;
    }

    public String getSpellAbility() {
        return SpellAbility;
    }

    public void setSpellAbility(String spellAbility) {
        SpellAbility = spellAbility;
    }

    public int getSpellDC() {
        return SpellDC;
    }

    public void setSpellDC(int spellDC) {
        SpellDC = spellDC;
    }

    public int getSpellAC() {
        return SpellAC;
    }

    public void setSpellAC(int spellAC) {
        SpellAC = spellAC;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getASTstr() {
        return ASTstr;
    }

    public void setASTstr(int ASTstr) {
        this.ASTstr = ASTstr;
    }

    public int getASTdex() {
        return ASTdex;
    }

    public void setASTdex(int ASTdex) {
        this.ASTdex = ASTdex;
    }

    public int getASTcon() {
        return ASTcon;
    }

    public void setASTcon(int ASTcon) {
        this.ASTcon = ASTcon;
    }

    public int getASTint() {
        return ASTint;
    }

    public void setASTint(int ASTint) {
        this.ASTint = ASTint;
    }

    public int getASTwis() {
        return ASTwis;
    }

    public void setASTwis(int ASTwis) {
        this.ASTwis = ASTwis;
    }

    public int getASTcha() {
        return ASTcha;
    }

    public void setASTcha(int ASTcha) {
        this.ASTcha = ASTcha;
    }

    public int getASacro() {
        return ASacro;
    }

    public void setASacro(int ASacro) {
        this.ASacro = ASacro;
    }

    public int getASanH() {
        return ASanH;
    }

    public void setASanH(int ASanH) {
        this.ASanH = ASanH;
    }

    public int getASarca() {
        return ASarca;
    }

    public void setASarca(int ASarca) {
        this.ASarca = ASarca;
    }

    public int getASath() {
        return ASath;
    }

    public void setASath(int ASath) {
        this.ASath = ASath;
    }

    public int getASdec() {
        return ASdec;
    }

    public void setASdec(int ASdec) {
        this.ASdec = ASdec;
    }

    public int getAShis() {
        return AShis;
    }

    public void setAShis(int AShis) {
        this.AShis = AShis;
    }

    public int getASinsig() {
        return ASinsig;
    }

    public void setASinsig(int ASinsig) {
        this.ASinsig = ASinsig;
    }

    public int getASintim() {
        return ASintim;
    }

    public void setASintim(int ASintim) {
        this.ASintim = ASintim;
    }

    public int getASinvest() {
        return ASinvest;
    }

    public void setASinvest(int ASinvest) {
        this.ASinvest = ASinvest;
    }

    public int getASmedic() {
        return ASmedic;
    }

    public void setASmedic(int ASmedic) {
        this.ASmedic = ASmedic;
    }

    public int getASnatu() {
        return ASnatu;
    }

    public void setASnatu(int ASnatu) {
        this.ASnatu = ASnatu;
    }

    public int getASpercept() {
        return ASpercept;
    }

    public void setASpercept(int ASpercept) {
        this.ASpercept = ASpercept;
    }

    public int getASperform() {
        return ASperform;
    }

    public void setASperform(int ASperform) {
        this.ASperform = ASperform;
    }

    public int getASpersuas() {
        return ASpersuas;
    }

    public void setASpersuas(int ASpersuas) {
        this.ASpersuas = ASpersuas;
    }

    public int getASrel() {
        return ASrel;
    }

    public void setASrel(int ASrel) {
        this.ASrel = ASrel;
    }

    public int getASSoH() {
        return ASSoH;
    }

    public void setASSoH(int ASSoH) {
        this.ASSoH = ASSoH;
    }

    public int getASstelt() {
        return ASstelt;
    }

    public void setASstelt(int ASstelt) {
        this.ASstelt = ASstelt;
    }

    public int getASsurv() {
        return ASsurv;
    }

    public void setASsurv(int ASsurv) {
        this.ASsurv = ASsurv;
    }

    public int getASPasivWis() {
        return ASPasivWis;
    }

    public void setASPasivWis(int ASPasivWis) {
        this.ASPasivWis = ASPasivWis;
    }

    public int getASpellDC() {
        return ASpellDC;
    }

    public void setASpellDC(int ASpellDC) {
        this.ASpellDC = ASpellDC;
    }

    public int getASpellAC() {
        return ASpellAC;
    }

    public void setASpellAC(int ASpellAC) {
        this.ASpellAC = ASpellAC;
    }

    public int getAstr() {
        return Astr;
    }

    public void setAstr(int astr) {
        Astr = astr;
    }

    public int getAdex() {
        return Adex;
    }

    public void setAdex(int adex) {
        Adex = adex;
    }

    public int getAcon() {
        return Acon;
    }

    public void setAcon(int acon) {
        Acon = acon;
    }

    public int getAinte() {
        return Ainte;
    }

    public void setAinte(int ainte) {
        Ainte = ainte;
    }

    public int getAwis() {
        return Awis;
    }

    public void setAwis(int awis) {
        Awis = awis;
    }

    public int getAcha() {
        return Acha;
    }

    public void setAcha(int acha) {
        Acha = acha;
    }
}

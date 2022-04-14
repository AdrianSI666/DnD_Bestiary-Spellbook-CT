package com.as;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Circle implements Serializable {
    private int level;
    public List<Spell> spells=new ArrayList<>();
    Circle(int lvl){
        this.level=lvl;
    }
    public void addSpell(String name,String manacost,String description){
        spells.add(new Spell(name,manacost,description));
    }
    public void removeSpell(int id){
        spells.remove(id);
    }
    public void removeSpell(String name){
        spells.removeIf(spell -> spell.getName()==name);
//        spells.forEach(spell -> {
//            if(spell.getName()==name){
//                spells.remove(spell);
//            }
//        });
    }
    public int getLevel() {
        return level;
    }
}

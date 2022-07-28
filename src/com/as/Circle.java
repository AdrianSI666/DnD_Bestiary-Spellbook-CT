package com.as;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Circle implements Serializable {
    @Serial
    private static final long serialVersionUID = 7L;
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
        spells.removeIf(spell -> Objects.equals(spell.getName(), name));
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

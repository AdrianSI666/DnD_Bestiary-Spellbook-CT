package com.as.casting;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class CircleDetails implements Serializable {
    @Serial
    private static final long serialVersionUID = 2L;
    private final int level;
    public List<SpellDetails> spells;
    CircleDetails(int lvl){
        this.level=lvl;
        spells=new ArrayList<>();
    }
    public SpellDetails getSpell(String id) throws Throwable {
        return spells.stream()
                .filter(spellDetails -> spellDetails.getId().equals(UUID.fromString(id)))
                .findFirst()
                .orElseThrow((Supplier<Throwable>) () -> new Exception("Spell not found"));
    }
    public void removeSpell(String id){
        spells.removeIf(spellDetails -> spellDetails.getId().equals(UUID.fromString(id)));
    }
    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "CircleDetails{" +
                "level=" + level +
                ", spells=" + spells +
                '}';
    }
}

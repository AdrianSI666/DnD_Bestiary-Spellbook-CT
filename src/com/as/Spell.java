package com.as;

import java.io.Serial;
import java.io.Serializable;

public class Spell implements Serializable {
    @Serial
    private static final long serialVersionUID = 9L;
    private String name;
    private String manacost;
    private String description;
    Spell(String nam,String manacost,String desc){
        this.name=nam;
        this.manacost=manacost;
        this.description=desc;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManacost() {
        return manacost;
    }

    public void setManacost(String manacost) {
        this.manacost = manacost;
    }
}

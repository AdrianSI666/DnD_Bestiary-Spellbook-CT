package com.as.casting;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class SpellDetails implements Serializable {
    @Serial
    private static final long serialVersionUID = 4L;
    private final UUID id;
    private int level;
    private String name;
    private String school;
    private String manaCost;
    private String castTime;
    private String range;
    private String components;
    private String duration;
    private String description;
    private String elemental;
    private List<String> classes;
    private String descriptionLong;

    public SpellDetails(String name, String manacost, String school, String castTime, String range, String duration, String components, List<String> classes, int level, String description, String elemental) {
        this.id= UUID.randomUUID();
        this.name = name;
        this.manaCost = manacost;
        this.school = school;
        this.castTime = castTime;
        this.range = range;
        this.duration = duration;
        this.components = components;
        this.classes=classes;
        this.level=level;
        this.description=description;
        this.elemental=elemental;
    }

    public String getElemental() {
        return elemental;
    }

    public void setElemental(String elemental) {
        this.elemental = elemental;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCastTime() {
        return castTime;
    }

    public void setCastTime(String castTime) {
        this.castTime = castTime;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public String getDescriptionLong() {
        return descriptionLong;
    }

    public void setDescriptionLong(String descriptionLong) {
        this.descriptionLong = descriptionLong;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SpellDetails{" +
                "id=" + id +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", manaCost='" + manaCost + '\'' +
                ", castTime='" + castTime + '\'' +
                ", range='" + range + '\'' +
                ", components='" + components + '\'' +
                ", duration='" + duration + '\'' +
                ", description='" + description + '\'' +
                ", elemental='" + elemental + '\'' +
                ", classes=" + classes +
                ", descriptionLong='" + descriptionLong + '\'' +
                '}';
    }
}

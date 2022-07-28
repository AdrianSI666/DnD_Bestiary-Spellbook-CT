package com.as;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Beasts implements Serializable {
    @Serial
    private static final long serialVersionUID = 6L;
    public List<Beast> beasts;
    static int i=0;
    public static void dodajI() {
        i = i+1;
    }
    public static int getI() {
        return i;
    }
    void add(Beast a)
    {
        beasts.add(a);
        dodajI();
    }

    Beasts(){
        beasts=new ArrayList<>();
    }
}

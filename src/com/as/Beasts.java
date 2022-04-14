package com.as;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Beasts implements Serializable {
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
    Beast get(int idw)
    {
        return beasts.get(idw);
    }
    Beasts(){
        beasts=new ArrayList<>();
    }
}

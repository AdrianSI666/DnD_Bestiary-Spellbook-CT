package com.as;


import com.as.casting.SpellBooks;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import javax.swing.*;
import java.io.*;

public class Main {
    private static final java.lang.reflect.Type BEAST_TYPE = new TypeToken<Beasts>() {
    }.getType();
    private static final java.lang.reflect.Type SPELL_TYPE = new TypeToken<SpellBooks>() {
    }.getType();

    public static void main(String[] args) {
        JFrame bestiary = new JFrame("Bestiary");
        Beasts beastsFromFile=null;
        SpellBooks spellsFromFile;
        Gson gson = new Gson();
        JsonReader reader;
        Bestiary bestiary1;
        try {
            reader = new JsonReader(new FileReader("beasts.json"));
            beastsFromFile = gson.fromJson(reader, BEAST_TYPE);
            reader = new JsonReader(new FileReader("spells.json"));
            spellsFromFile = gson.fromJson(reader, SPELL_TYPE);
            bestiary1 = new Bestiary(beastsFromFile, spellsFromFile);
            bestiary.setContentPane(bestiary1.getmainPanel());
        } catch (FileNotFoundException e) {
            if (beastsFromFile!=null){
                bestiary.setContentPane(new Bestiary(beastsFromFile).getmainPanel());
            }
            else {
                bestiary.setContentPane(new Bestiary().getmainPanel());
            }
        }
        /*try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bestiary.dat"));
            beastsFromFile = (Beasts) ois.readObject();
            Bestiary bestiary1=new Bestiary(beastsFromFile);
            bestiary.setContentPane(bestiary1.getmainPanel());
        } catch (FileNotFoundException e) {
            bestiary.setContentPane(new Bestiary().getmainPanel());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        bestiary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        bestiary.pack();
        bestiary.setVisible(true);
//        EventQueue.invokeLater(() -> new Bestiary());
    }
}

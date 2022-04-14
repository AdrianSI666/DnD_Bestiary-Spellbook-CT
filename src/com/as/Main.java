package com.as;



import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) {
        JFrame bestiary = new JFrame("Bestiary");
        Beasts beastsFromFile=new Beasts();
        try {
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
        }

        bestiary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        bestiary.pack();
        bestiary.setVisible(true);
//        EventQueue.invokeLater(() -> new Bestiary());
    }
}

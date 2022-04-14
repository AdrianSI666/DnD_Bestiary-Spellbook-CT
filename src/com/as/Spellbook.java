package com.as;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Spellbook {
    private JTabbedPane Circles;
    private JPanel Book;
    private JScrollPane First;
    private JPanel Cantrips;
    private JTextField AddName;
    private JButton AddButton;
    private JScrollPane CantripsScroll;
    private JPanel CantripsPane;
    private JButton Filter;
    private JComboBox FilterOption;
    private JTextField FilterText;
    private JButton Reset;

    Spellbook(){

        /*AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        CantripsScroll.*/
    }

    public JPanel getBook() {
        return Book;
    }
}

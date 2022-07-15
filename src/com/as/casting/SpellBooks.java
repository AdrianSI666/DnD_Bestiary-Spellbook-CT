package com.as.casting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SpellBooks implements Serializable {
    public List<CircleDetails> book;
    public SpellBooks(){
        book=new ArrayList<>();
        book.add(new CircleDetails(0));
        book.add(new CircleDetails(1));
        book.add(new CircleDetails(2));
        book.add(new CircleDetails(3));
        book.add(new CircleDetails(4));
        book.add(new CircleDetails(5));
        book.add(new CircleDetails(6));
        book.add(new CircleDetails(7));
        book.add(new CircleDetails(8));
        book.add(new CircleDetails(9));
    }

    @Override
    public String toString() {
        return "SpellBooks{" +
                "book=" + book +
                '}';
    }
}

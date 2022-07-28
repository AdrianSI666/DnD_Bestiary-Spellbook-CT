package com.as;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class KnownSpell implements Serializable {
    @Serial
    private static final long serialVersionUID = 8L;
    public List<Circle> book;
    KnownSpell(){
        book=new ArrayList<>();
        book.add(new Circle(0));
        book.add(new Circle(1));
        book.add(new Circle(2));
        book.add(new Circle(3));
        book.add(new Circle(4));
        book.add(new Circle(5));
        book.add(new Circle(6));
        book.add(new Circle(7));
        book.add(new Circle(8));
        book.add(new Circle(9));
    }
}

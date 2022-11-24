package test;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Element {
    private String name;
    private double price;

    public Pasta(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Pasta: " + this.name);
        System.out.println("Price: " + this.price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPasta(this);
    }

    public double getPrice() {
        return price;
    }
}

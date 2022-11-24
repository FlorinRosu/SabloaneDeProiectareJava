package test;

import java.util.ArrayList;
import java.util.List;

public class Salad implements Element {
    private String name;
    private double price;

    public Salad(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Salad: " + this.name);
        System.out.println("Price: " + this.price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSalad(this);
    }

    public double getPrice() {
        return price;
    }
}

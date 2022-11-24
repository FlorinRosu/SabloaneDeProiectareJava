package test;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Element {
    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Pizza: " + this.name);
        System.out.println("Price: " + this.price);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPizza(this);
    }

    public double getPrice() {
        return price;
    }
}

package test;

public class Main {

    public static void main(String[] args) {

        Order pizzaHut = new Order("PizzaHut");
        Order Glovo = new Order("Glovo");
        Order kfc = new Order("KFC");
        Order mcDonalds = new Order("McDonalds");
        Order menuMcDonalds = new Order("Mc Chicken");
        
        Pizza sandwich = new Pizza("Sandwich", 6);
        Pizza meat = new Pizza("Meat", 34);
        Pizza soup = new Pizza("Soup", 45);
        Pasta carbonara = new Pasta("Carbonara", 70);
        Salad colesaw = new Salad("Colesaw", 66);

        menuMcDonalds.addElement(soup);
        mcDonalds.addElement(menuMcDonalds);

        Glovo.addElement(soup);
        Glovo.addElement(carbonara);

        kfc.addElement(sandwich);
        kfc.addElement(colesaw);

        pizzaHut.addElement(kfc);
        pizzaHut.addElement(mcDonalds);
        pizzaHut.addElement(Glovo);

        pizzaHut.print();
        System.out.println();

        PriceVisitor visitor = new PriceVisitor();
        pizzaHut.accept(visitor);
        visitor.individualDishPrices();
        System.out.println();
        visitor.totalDishesPrice();
    }
}

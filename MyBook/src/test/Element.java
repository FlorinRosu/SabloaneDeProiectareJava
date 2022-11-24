package test;

public interface Element {
     void print();

     void accept(Visitor visitor);
}

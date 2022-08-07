package PYQ2019;

class Shape{
    void show(){
        System.out.println("Superclass Show");
    }
}

class Rectangle extends Shape{
    void show(){
        System.out.println("Rectangle Show");
    }
}

class Triangle extends Shape{
    void show(){
        System.out.println("Triangle Show");
    }
}

public class Q1_j{
    public static void main(String[] args) {
        Shape s = new Shape();
        Shape r = new Rectangle();
        Shape t = new Triangle();

        s.show();
        r.show();
        t.show();
    }
}

package P2;

import P1.Shape;

public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(){
        length = 0;
        breadth = 0;
    }

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return length*breadth;
    }
}

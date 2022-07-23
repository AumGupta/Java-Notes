package P3;

import P1.Shape;
import java.lang.Math;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        radius = 0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
}

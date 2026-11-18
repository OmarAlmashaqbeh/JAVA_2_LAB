package Project6.Prj6_B;

import Project6.Circle;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        this(radius, height);
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getArea();
    }
}
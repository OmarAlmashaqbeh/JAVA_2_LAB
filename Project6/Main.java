package Project6;

import Project6.Prj6_B.Cylinder;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println("s1 color: " + s1.color);
        s1.describe();
        System.out.println("s1 area: " + s1.getArea());

        Triangle t1 = new Triangle();
        System.out.println("t1 color: " + t1.color);
        t1.describe();
        System.out.println("t1 area: " + t1.getArea());

        Triangle t2 = new Triangle(5.0, 9.0, "blue");
        System.out.println("t2 color: " + t2.color);
        t2.describe();
        System.out.println("t2 area: " + t2.getArea());

        Circle c1 = new Circle();
        System.out.println("c1 color: " + c1.color);
        c1.describe();
        System.out.println("c1 radius: " + c1.getRadius());
        System.out.println("c1 diameter: " + c1.getDiameter());
        System.out.println("c1 area: " + c1.getArea());

        Cylinder cy1 = new Cylinder();
        System.out.println("cy1 height: " + cy1.getHeight());
        System.out.println("cy1 base radius: " + cy1.getRadius());
        System.out.println("cy1 base area: " + cy1.getArea());
        System.out.println("cy1 volume: " + cy1.getVolume());

        Cylinder cy2 = new Cylinder(2.0, 5.0, "pink");
        System.out.println("cy2 height: " + cy2.getHeight());
        System.out.println("cy2 base radius: " + cy2.getRadius());
        System.out.println("cy2 base area: " + cy2.getArea());
        System.out.println("cy2 volume: " + cy2.getVolume());
    }
}
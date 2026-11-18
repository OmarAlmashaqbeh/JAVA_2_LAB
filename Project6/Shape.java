package Project6;

public class Shape {
    protected String color;

    public Shape() {
        color = "white";
    }

    public Shape(String color) {
        this.color = color;
    }

    public void describe() {
        System.out.println("This is a shape!");
    }

    public double getArea() {
        System.out.println("Unknown shape, cannot calculate area");
        return 0.0;
    }
}
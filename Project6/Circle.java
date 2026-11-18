package Project6;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 0.0;
        }
    }

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public Circle(double radius, String color) {
        this(radius);
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("This is a Circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
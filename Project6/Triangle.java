package Project6;

public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle() {
        height = 1.0;
        base = 1.0;
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Triangle(double height, double base, String color) {
        this(height, base);
        this.color = color;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("This is a Triangle");
    }

    public double getArea() {
        return 0.5 * height * base;
    }
}
package Project9;

public class Circle implements Colorable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String howToColor() {
        return (getArea() > 50) ? "Red" : "Yellow";
    }
}
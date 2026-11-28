package Project9;

public class Rectangle implements Colorable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String howToColor() {
        return (width > 50) ? "Black" : "White";
    }
}
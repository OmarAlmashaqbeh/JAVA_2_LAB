package Project8;

public abstract class Colorable {

    public abstract double getArea();

    public String howToColor(Colorable c) {
        if (c instanceof Circle) {
            return "Red";
        } else if (c instanceof Rectangle) {
            return "Yellow";
        } else {
            return "Unknown";
        }
    }
}
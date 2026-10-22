package Project1;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("r1 width: " + r1.getWidth());
        System.out.println("r1 height: " + r1.getHeight());
        System.out.println("r1 color: " + Rectangle.getColor());

        r1.setWidth(10);
        System.out.println("r1 width: " + r1.getWidth());

        Rectangle r2 = new Rectangle(4, 40);
        System.out.println("r2 width: " + r2.getWidth());
        System.out.println("r2 height: " + r2.getHeight());
        System.out.println("r2 color: " + Rectangle.getColor());

        Rectangle.setColor("red");
        System.out.println("r2 color: " + Rectangle.getColor());

        Rectangle r3 = new Rectangle(6,50);
        System.out.println("r3 width: " + r3.getWidth());
        System.out.println("r3 height: " + r3.getHeight());
        System.out.println("r3 color: " + Rectangle.getColor());

        System.out.println("r1 area: " + r1.getArea());
        System.out.println("r2 area: " + r2.getArea());
        System.out.println("r3 area: " + r3.getArea());

        System.out.println("r1 perimeter: " + r1.getPerimeter());
        System.out.println("r2 perimeter: " + r2.getPerimeter());
        System.out.println("r3 perimeter: " + r3.getPerimeter());
    }
}

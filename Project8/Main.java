package Project8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        Circle c1 = new Circle(s.nextDouble());
        System.out.println("c1 area = " + c1.getArea());
        printColor(c1);
        System.out.println("Enter the height and width: ");
        Rectangle r1 = new Rectangle(s.nextDouble(), s.nextDouble());
        System.out.println("r1 area = " + r1.getArea());
        printColor(r1);
    }

    public static void printColor(Colorable c) {
        System.out.println("Class name: " + c.getClass().getSimpleName());
        System.out.println("color: " + c.howToColor(c));
    }
}
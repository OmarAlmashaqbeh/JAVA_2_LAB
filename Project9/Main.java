package Project9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Colorable[] arr = new Colorable[2];

        System.out.println("Enter the radius: ");
        Circle c1 = new Circle(s.nextInt());

        System.out.println("Enter the height and width: ");
        Rectangle r1 = new Rectangle(s.nextDouble(), s.nextDouble());

        arr[0] = c1;
        arr[1] = r1;

        printObject(arr);
    }

    public static void printObject(Colorable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index: " + i);
            System.out.println("Class: " + arr[i].getClass().getSimpleName());
            System.out.println("Area = " + arr[i].getArea());
            System.out.println("Color: " + arr[i].howToColor());
        }
    }
}
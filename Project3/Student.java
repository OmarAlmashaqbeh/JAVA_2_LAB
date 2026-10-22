package Project3;

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private static int count = 0;

    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the student's name: ");
        this.name = input.nextLine();
        count++;
        this.id = count;
    }

    public Student(String name) {
        this.name = name;
        count++;
        id = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getNumOfStudents() {
        return count;
    }
}
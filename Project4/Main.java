package Project4;

public class Main {
    public static void main(String[] args) {
        Course c = new Course("CSC 111", 10);

        c.addStudent(1111, 95);
        c.addStudent(1111, 95);
        c.addStudent(2222, 85);
        c.addStudent(3333, 75);
        c.addStudent(4444, 65);
        c.addStudent(5555, 55);

        System.out.println("The number of Students in the course " + c.getNumberOfStudents());

        c.display(80);

        System.out.println("The Id of the second best student is: " + c.getSecondBestStudentID());
    }
}
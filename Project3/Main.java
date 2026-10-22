package Project3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Current number of students is: " + Student.getNumOfStudents());
        
        Student s1 = new Student("Haneen");
        Student s2 = new Student("Manar");
        Student s3 = new Student("Ahmad");

        System.out.println("Name of s1 is: (" + s2.getName() + ") , the ID is: " + s2.getId());
        System.out.println("Name of s2 is: (" + s3.getName() + ") , the ID is: " + s3.getId());
        System.out.println("Name of s3 is: (" + s1.getName() + ") , the ID is: " + s1.getId());

        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
        
        System.out.println("Current number of students is: " + Student.getNumOfStudents());
    }
}
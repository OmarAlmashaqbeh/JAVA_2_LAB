package Project4;

public class Course {
    private String name;
    private String instructorName;
    private int[] studentsID;
    private int[] studentsGrades;
    private int current;

    public Course(String name, int size) {
        this.name = name;
        current = 0;
        studentsID = new int[size];
        studentsGrades = new int[size];
    }

    public int getNumberOfStudents() {
        return current;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int searchIndexOfStudent(int studentID) {
        for (int i = 0; i < current; i++) {
            if (studentsID[i] == studentID) {
                return i + 1;
            }
        }
        return -1;
    }

    public boolean addStudent(int studentID, int studentGrades) {
        if (current < studentsID.length) {
            if (searchIndexOfStudent(studentID) == -1) {
                studentsID[current] = studentID;
                studentsGrades[current] = studentGrades;
                current++;
                return true;
            } else {
                System.out.println("Student with ID " + studentID + " already exists.");
                return false;
            }
        } else {
            System.out.println("The course is full. Cannot add more students.");
            return false;
        }
    }

    public void display(int studentGrade) {
        boolean found = false;
        for (int i = 0; i < current; i++) {
            if (studentsGrades[i] >= studentGrade) {
                System.out.println("Student ID: " + studentsID[i] + ", Grade: " + studentsGrades[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public int getSecondBestStudentID() { 
        if (current < 2) {
            return -1;
        }
        int maxGrade = -1;
        int secondMaxGrade = -1;
        int bestStudentID = -1;
        int secondBestStudentID = -1;
        for (int i = 0; i < current; i++) {
            if (studentsGrades[i] > maxGrade) {
                secondMaxGrade = maxGrade;
                secondBestStudentID = bestStudentID;
                maxGrade = studentsGrades[i];
                bestStudentID = studentsID[i];
            } else if (studentsGrades[i] > secondMaxGrade && studentsGrades[i] < maxGrade) {
                secondMaxGrade = studentsGrades[i];
                secondBestStudentID = studentsID[i];
            }
        }
        return secondBestStudentID;
    }
}
package Project7;

public class Student extends Person{
    private int studentNumber;

    public Student() {
        studentNumber = 0;
    }

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void reset(String newName, int newStudentNumber) {
        super.setName(newName);
        this.studentNumber = newStudentNumber;
    }

    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Student Number: " + studentNumber);
    }

    @Override
    public boolean equals(Object st2) {
        if (st2 instanceof Student) {
            Student st = (Student) st2;
            return this.studentNumber == st.studentNumber && sameName(st);
        }
        return false;
    }

    public boolean equals(Student st2) {
        return studentNumber == st2.studentNumber && sameName(st2);
    }

    @Override
    public String toString() {
        return "This object is of class " + getClass().getSimpleName();
    }
}
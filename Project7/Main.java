package Project7;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("haneen", 2013020);
        s1.writeOutput();

        s1.reset("ayat", 2013015);
        s1.writeOutput();

        Student s2 = new Student("manar", 2012050);

        System.out.println("Do s1 and s2 have the same name? " + s1.sameName(s2));

        System.out.println("Are s1 and s2 the same student? " + s1.equals(s2));

        System.out.println(s1);
    }
}

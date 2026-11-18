package Project7;

public class Person {
    private String name;

    public Person() {
        name = "Undefined name yet!";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
    }

    public boolean sameName(Person p2) {
        return name.equalsIgnoreCase(p2.name);
    }
}
package Person;

public class Person {
    private String name;
    private long yearOfBirth;

    public Person(String name, long yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public long getYearOfBirth() {
        return yearOfBirth;
    }

    public void printInformation() {
        System.out.println("Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);
    }
}
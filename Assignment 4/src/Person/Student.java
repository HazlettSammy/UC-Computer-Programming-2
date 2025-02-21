package Person;

public class Student extends Person {
    private String major;

    public Student(String name, long yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Major: " + major);
    }
}
package Person;

public class Instructor extends Person {
    private double salary;

    public Instructor(String name, long yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Salary: " + salary);
    }
}
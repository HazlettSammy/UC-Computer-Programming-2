package Test;

import Person.Person;
import Person.Student;
import Person.Instructor;

public class Test {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Samuel Hazlett", 2003, "Cybersecurity");
        System.out.println("Student Info:");
        student.printInformation();

        System.out.println("\n----------------------\n");

        // Create an Instructor object
        Instructor instructor = new Instructor("Professor John Doe", 1975, 75000);
        System.out.println("Instructor Info:");
        instructor.printInformation();
    }
}

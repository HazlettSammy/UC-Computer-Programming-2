package TestPersonHierarchy;

import java.util.Date;

public class TestPersonHierarchy {
    public static void main(String[] args) {
        Person person = new Person("Alice", "123 Main St", "555-1234", "alice@example.com");
        Student student = new Student("Bob", "456 College Ave", "555-5678", "bob@example.edu", Student.SOPHOMORE);
        Employee employee = new Employee("Charlie", "789 Work Blvd", "555-9012", "charlie@example.com", "Room 101", 50000, new Date());
        Faculty faculty = new Faculty("Dr. Smith", "321 University Dr", "555-3456", "smith@university.edu", "Room 202", 75000, new Date(), "9 AM - 5 PM", "Professor");
        Staff staff = new Staff("Emily", "654 Admin St", "555-7890", "emily@admin.org", "Office 303", 45000, new Date(), "Director of Online Learning");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

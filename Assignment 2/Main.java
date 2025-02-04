package StudentClass.java;

class Course {
    private long courseNumber;
    private String courseName;
    private String courseCode;
    private String[] enrolledStudents;
    private int studentCount;

    // Constructor
    public Course(long courseNumber, String courseName, String courseCode, int maxStudents) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrolledStudents = new String[maxStudents];
        this.studentCount = 0;
    }

    // Custom Getter Methods (Accessors)
    public long retrieveCourseNumber() { return courseNumber; }
    public String retrieveCourseName() { return courseName; }
    public String retrieveCourseCode() { return courseCode; }
    public String[] retrieveEnrolledStudents() { return enrolledStudents; }

    // Custom Setter Methods (Mutators)
    public void modifyCourseNumber(long courseNumber) { this.courseNumber = courseNumber; }
    public void modifyCourseName(String courseName) { this.courseName = courseName; }
    public void modifyCourseCode(String courseCode) { this.courseCode = courseCode; }

    // Method for adding students
    public void registerStudent(String studentName) {
        if (studentCount < enrolledStudents.length) {
            enrolledStudents[studentCount++] = studentName;
        } else {
            System.out.println("Cannot enroll more students. Class is full.");
        }
    }

    // Method to get the number of enrolled students
    public int countEnrolledStudents() {
        return studentCount;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating the Course object with a max of 24 students
        Course programmingII = new Course(123456, "Computer Programming II", "IT2045C", 24);

        // All students in our computer programming 2 course except for professor
        String[] students = {
            "Mj Abankwah", "Denzil Aboagye", "Curtis Ayers", "Joshua Baker", "Noah Blevens",
            "Aiden Bordwine", "Tj Cephas", "Brock Erdman", "George Feldmann", "Peyton Folzenlogen",
            "Gavin Hazlett", "Samuel Hazlett", "Mason Kindred", "Addi Leber", "Jadon Marcus",
            "Ethan May", "Nadia Meadows", "Dominic Omeltschenko", "Maya Owusu", "Ian Scheeler",
            "Oscar Sims", "Conner Snay", "Adam Taleb", "Sobit Thatal"
        };

        for (String student : students) {
            programmingII.registerStudent(student);
        }

        // Enrollment details displayed
        System.out.println("Course: " + programmingII.retrieveCourseName());
        System.out.println("Code: " + programmingII.retrieveCourseCode());
        System.out.println("Enrolled Students: " + programmingII.countEnrolledStudents());
        System.out.println("Students List: ");
        for (String student : programmingII.retrieveEnrolledStudents()) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}

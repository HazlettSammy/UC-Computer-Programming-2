package personstudent;

//Student class extends to Person and continues an additional field

public class Student extends Person {
	
	// Additional field unique to Student 
	
	private String mNumber;
	
	//Constructor for Student, calling superclass constructor 
	
	public Student(String firstName, String lastName, long ssn, String mNumber) {
		super(firstName, lastName, ssn); // This calls for Person constructor 
		this.mNumber = mNumber;
	}
	
	// Getter and setter for mNumber 
	
	public String getMNumber() { return mNumber; }
	public void setMNumber(String mNumber) { this.mNumber = mNumber; }
	
	// Override equals() method in Student
	
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Person)) return false;
		
		Person person = (Person) obj;
		return this.getFirstName().equals(person.getFirstName()) &&
		       this.getLastName().equals(person.getLastName()) &&
		       this.getSSN() == person.getSSN();
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Jane", "Doe", 143457689);
		Person p2 = new Person("Jane", "Doe", 143457689);
		Person p3 = new Person("Joannie", "Doe", 143457689);
		
		Student s1 = new Student("Jane", "Doe", 143457689, "M10519330");
		Student s2 = new Student("Joannie", "Doe", 143457689, "M10522220");
		
		System.out.println(p1.equals(p2));    // true
		System.out.println(p1.equals(p3));    // false
		
		System.out.println(p1.equals(s1));    // true
		System.out.println(p1.equals(s2));    // false
		
		System.out.println(s1.equals(s2));    // false
		
		System.out.println(s1.equals(p1));    // true
		System.out.println(s2.equals(p1));    // false
	}
}

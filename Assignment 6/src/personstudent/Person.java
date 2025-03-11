package personstudent;

// Person class represents a person with first name, last name, and SSN.

public class Person {
	
	// Instance variables (data fields)
	
	private String firstName;
	private String lastName;
	private long ssn;
	
	// Constructor to initialize Person object

	public Person(String firstName, String lastName, long ssn){
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	// The getter methods
	
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public long getSSN() { return ssn; }
	
	// The setter methods
	
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setSSN(long ssn) { this.ssn = ssn; }
	
	public String toString() {
		return getClass().getSimpleName() + " with First name: " + firstName + " Last name: " + lastName;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Person)) return false;
		
		Person person = (Person) obj;
		return this.firstName.equals(person.firstName)
			&& this.lastName.equals(person.lastName)
			&& this.ssn == person.ssn;
	}
}

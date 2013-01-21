package exercises;
public class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		return "Name: " + firstName + " " + lastName;
	}

	public int compareTo(Person person){
		int result = lastName.compareTo(person.lastName);
		if (result == 0){
			result =firstName.compareTo(person.firstName);
		}
		return result;
	}
}

public class Person {
    // Make the fields private to keep them immutable
    private String firstName;
    private String lastName;
    private int birthYear;

    // Constructor
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    // Override the toString method to return the full name and birth year
    public String toString() {
        return this.getFirstName() + " " +  this.getLastName() + " (født: " + this.getBirthYear() + ")";
    }
}

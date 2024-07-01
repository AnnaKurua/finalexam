package finalexam.task3;

import java.io.Serializable;

public class Person1 implements Serializable {
    private String name;
    private String surname;
    private String personalNumber;

    // Default constructor
    public Person1() {
    }

    // Parameterized constructor
    public Person1(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Getter and Setter for personalNumber
    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    // Override equals and hashCode for proper comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person1 person = (Person1) o;

        return personalNumber != null ? personalNumber.equals(person.personalNumber) : person.personalNumber == null;
    }

    @Override
    public int hashCode() {
        return personalNumber != null ? personalNumber.hashCode() : 0;
    }

    // toString method for better readability
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                '}';
    }

    // Main method for testing
    public static void main(String[] args) {
        Person1 person = new Person1("John", "Doe", "1234567890");
        System.out.println(person);
    }
}

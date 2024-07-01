package finalexam.task3;

import java.io.IOException;
import java.util.List;

public class FactoryTester1 {
    public static void main(String[] args) {
        // Create a PaperFactory1 instance
        PaperFactory1 factory = new PaperFactory1();

        // Create Person1 instances
        Person1 john = new Person1("John", "Doe", "1234567890");
        Person1 jane = new Person1("Jane", "Smith", "0987654321");
        Person1 bob = new Person1("Bob", "Brown", "1122334455");

        // Test adding persons to the factory
        factory.addPerson(john);
        factory.addPerson(jane);
        factory.addPerson(bob);

        // Print the staff list after adding persons
        System.out.println("Staff after adding John, Jane, and Bob: ");
        printStaff(factory.getStaff());

        // Test deleting a person from the factory
        boolean isDeleted = factory.deletePerson(john);
        System.out.println("\nDeleting John (expected: true): " + isDeleted);

        // Print the staff list after deleting John
        System.out.println("Staff after deleting John: ");
        printStaff(factory.getStaff());

        // Test deleting a person who is not in the factory
        isDeleted = factory.deletePerson(john);
        System.out.println("\nDeleting John again (expected: false): " + isDeleted);

        // Test adding a duplicate person
        factory.addPerson(jane);
        System.out.println("\nStaff after trying to add Jane again: ");
        printStaff(factory.getStaff());

        // Test adding a null person
        factory.addPerson(null);
        System.out.println("\nStaff after trying to add null: ");
        printStaff(factory.getStaff());

        // Test saving and loading the staff list
        try {
            factory.saveToFile("staff.dat");
            System.out.println("\nStaff saved to file.");

            factory.loadFromFile("staff.dat");
            System.out.println("\nStaff loaded from file: ");
            printStaff(factory.getStaff());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Utility method to print the staff list
    private static void printStaff(List<Person1> staff) {
        for (Person1 p : staff) {
            System.out.println(p);
        }
    }
}

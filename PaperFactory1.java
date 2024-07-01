package finalexam.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PaperFactory1 {
    private List<Person1> staff = new ArrayList<>();

    // Method to add a person to the staff list
    public void addPerson(Person1 p) {
        if (p != null && !staff.contains(p)) {
            staff.add(p);
        }
    }

    // Method to delete a person from the staff list
    public boolean deletePerson(Person1 p) {
        return staff.remove(p);
    }

    // Method to get the list of all staff members
    public List<Person1> getStaff() {
        return new ArrayList<>(staff); // Return a copy to prevent modification from outside
    }

    // Method to save the staff list to a file
    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(staff);
        }
    }

    // Method to load the staff list from a file
    public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            staff = (List<Person1>) ois.readObject();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        PaperFactory1 factory = new PaperFactory1();

        Person1 john = new Person1("John", "Doe", "1234567890");
        Person1 jane = new Person1("Jane", "Smith", "0987654321");
        Person1 bob = new Person1("Bob", "Brown", "1122334455");

        factory.addPerson(john);
        factory.addPerson(jane);
        factory.addPerson(bob);

        System.out.println("Staff before saving: " + factory.getStaff());

        // Save the staff list to a file
        try {
            factory.saveToFile("staff.dat");
            System.out.println("Staff saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Clear the current staff list
        factory = new PaperFactory1();
        System.out.println("Staff after clearing: " + factory.getStaff());

        // Load the staff list from the file
        try {
            factory.loadFromFile("staff.dat");
            System.out.println("Staff loaded from file: " + factory.getStaff());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


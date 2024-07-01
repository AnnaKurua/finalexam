package finalexam.task2;
import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    // Method to add a person to the staff list
    public void addPerson(Person p) {
        if (p != null && !staff.contains(p)) {
            staff.add(p);
        }
    }

    // Method to delete a person from the staff list
    public boolean deletePerson(Person p) {
        return staff.remove(p);
    }

    // Method to get the list of all staff members
    public List<Person> getStaff() {
        return new ArrayList<>(staff); // Return a copy to prevent modification from outside
    }
}





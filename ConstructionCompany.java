package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConstructionCompany implements Serializable, LegalEntity {
    private String address;
    private String vatNumber;
    private List<Material> materials = new ArrayList<>();

    // Constructor
    public ConstructionCompany(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
    }

    // Implementing methods from LegalEntity interface
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    // Method to add a material to the list
    public void addMaterial(Material m) {
        if (m != null && !materials.contains(m)) {
            materials.add(m);
        }
    }

    // Method to delete a material from the list
    public boolean deleteMaterial(Material m) {
        return materials.remove(m);
    }

    // Method to get the list of all materials
    public List<Material> getMaterials() {
        return new ArrayList<>(materials); // Return a copy to prevent modification from outside
    }

    // Method to save the materials list to a file
    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(materials);
        }
    }

    // Method to load the materials list from a file
    public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            materials = (List<Material>) ois.readObject();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example usage
        ConstructionCompany company = new ConstructionCompany("123 Main St", "123456789");

        Material cement = new Material("Cement", 100, 10.5);
        Material bricks = new Material("Bricks", 500, 0.5);
        Material steel = new Material("Steel", 200, 5.0);

        company.addMaterial(cement);
        company.addMaterial(bricks);
        company.addMaterial(steel);

        System.out.println("Materials before saving: " + company.getMaterials());

        try {
            company.saveToFile("materials.dat");
            System.out.println("Materials saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        company = new ConstructionCompany("456 Elm St", "987654321");
        System.out.println("Materials after clearing: " + company.getMaterials());

        try {
            company.loadFromFile("materials.dat");
            System.out.println("Materials loaded from file: " + company.getMaterials());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

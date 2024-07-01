package finalexam.task4;

import java.io.IOException;
import java.util.List;

public class CompanyTester {
    public static void main(String[] args) {

        ConstructionCompany company = new ConstructionCompany();


        Material cement = new Material("Cement", 100, 10.5);
        Material bricks = new Material("Bricks", 500, 0.5);
        Material steel = new Material("Steel", 200, 5.0);


        company.addMaterial(cement);
        company.addMaterial(bricks);
        company.addMaterial(steel);


        System.out.println("Materials after adding Cement, Bricks, and Steel: ");
        printMaterials(company.getMaterials());


        boolean isDeleted = company.deleteMaterial(cement);
        System.out.println("\nDeleting Cement (expected: true): " + isDeleted);

        System.out.println("Materials after deleting Cement: ");
        printMaterials(company.getMaterials());


        isDeleted = company.deleteMaterial(cement);
        System.out.println("\nDeleting Cement again (expected: false): " + isDeleted);


        company.addMaterial(bricks);
        System.out.println("\nMaterials after trying to add Bricks again: ");
        printMaterials(company.getMaterials());

        company.addMaterial(null);
        System.out.println("\nMaterials after trying to add null: ");
        printMaterials(company.getMaterials());


        try {
            company.saveToFile("materials.dat");
            System.out.println("\nMaterials saved to file.");

            company.loadFromFile("materials.dat");
            System.out.println("\nMaterials loaded from file: ");
            printMaterials(company.getMaterials());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    private static void printMaterials(List<Material> materials) {
        for (Material m : materials) {
            System.out.println(m);
        }
    }
}


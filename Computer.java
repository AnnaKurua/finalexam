package finalexam.task1;

public class Computer {

    private String brand;
    private int memory; // in GB
    private int ssd;    // in GB
    private int hdd;    // in GB

    // Default constructor
    public Computer() {
    }

    // Parameterized constructor
    public Computer(String brand, int memory, int ssd, int hdd) {
        this.brand = brand;
        this.memory = memory;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for memory
    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    // Getter and Setter for ssd
    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    // Getter and Setter for hdd
    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    // toString method
    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", memory=" + memory + "GB" +
                ", ssd=" + ssd + "GB" +
                ", hdd=" + hdd + "GB" +
                '}';
    }

    // Main method for testing
    public static void main(String[] args) {
        Computer comp = new Computer("Dell", 16, 512, 1024);
        System.out.println(comp.toString());
    }
}

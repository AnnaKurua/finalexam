package finalexam.task1;

public class Circle implements Drawable {
    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0; // Default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementation of Draw method from Drawable interface
    @Override
    public void Draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}


// Cylinder.java
public class Cylinder extends Circle {
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        // Call the parent class (Circle) constructor to set the radius.
        super(radius);

        // Check if the provided height is less than 0, and set it to 0 if so.
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to calculate and return the volume
    public double getVolume() {
        return getArea() * height; // Calculate volume by multiplying area with height
    }
}

// Cuboid.java
public class Cuboid extends Rectangle {
    private double height;

    // Constructor
    public Cuboid(double width, double length, double height) {
        // Call the parent class (Rectangle) constructor to set the width and length.
        super(width, length);

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

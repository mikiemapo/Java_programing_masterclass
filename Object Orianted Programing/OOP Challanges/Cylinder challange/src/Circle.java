// Circle.java
public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        // Check if the provided radius is less than 0, and set it to 0 if so.
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

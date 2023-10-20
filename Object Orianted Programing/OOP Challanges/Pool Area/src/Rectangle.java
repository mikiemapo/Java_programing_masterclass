// Rectangle.java
public class Rectangle {
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {
        // Check if the provided width and length are less than 0, and set them to 0 if so.
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // Method to get the width
    public double getWidth() {
        return width;
    }

    // Method to get the length
    public double getLength() {
        return length;
    }

    // Method to calculate and return the area
    public double getArea() {
        return width * length;
    }
}

public class Wall {
    private double width;
    private double height;

    // First constructor (no-arg constructor)
    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    // Second constructor with parameters
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // Method to get the width
    public double getWidth() {
        return width;
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to set the width with validation
    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    // Method to set the height with validation
    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    // Method to calculate and return the area
    public double getArea() {
        return width * height;
    }
}

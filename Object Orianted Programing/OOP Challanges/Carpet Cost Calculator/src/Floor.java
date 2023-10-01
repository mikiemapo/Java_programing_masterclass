public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Method to calculate and return the area
    public double getArea() {
        return width * length;
    }
}

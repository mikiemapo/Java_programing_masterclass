public class Point {
    private int x;
    private int y;

    // First constructor (no-arg constructor)
    public Point() {
        this(0, 0); // Default constructor initializes x and y to 0
    }

    // Second constructor with parameters
    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    // Method to get the x coordinate
    public int getX() {
        return x;
    }

    // Method to get the y coordinate
    public int getY() {
        return y;
    }

    // Method to set the x coordinate
    public void setX(int x) {
        this.x = x;
    }

    // Method to set the y coordinate
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate distance from (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Method to calculate distance from another point (x, y)
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    // Method to calculate distance from another Point object
    public double distance(Point another) {
        return Math.sqrt((this.x - another.getX()) * (this.x - another.getX()) +
                (this.y - another.getY()) * (this.y - another.getY()));
    }
}

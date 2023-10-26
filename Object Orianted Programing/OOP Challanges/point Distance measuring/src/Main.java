public class Main {
    public static void main(String[] args) {
        // Create a Point object with coordinates (6, 5)
        Point first = new Point(6, 5);

        // Create another Point object with coordinates (3, 1)
        Point second = new Point(3, 1);

        // Test the distance methods
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));

        // Create a Point object with default coordinates (0, 0)
        Point point = new Point();

        // Test the distance method with the default point
        System.out.println("distance() = " + point.distance());
    }
}

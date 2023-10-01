public class Main {
    public static void main(String[] args) {
        // Create a Wall object with width 5 and height 4
        Wall wall = new Wall(5, 4);

        // Display the area of the wall
        System.out.println("Area = " + wall.getArea());

        // Set the height to a negative value (-1.5)
        wall.setHeight(-1.5);

        // Display the width, height, and area after setting the height
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());
    }
}

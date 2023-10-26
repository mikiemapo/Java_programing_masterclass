public class Main {
    public static void main(String[] args) {
        // Create walls
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        // Create a ceiling
        Ceiling ceiling = new Ceiling(12, 55);

        // Create a bed
        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        // Create a lamp
        Lamp lamp = new Lamp("Classic", false, 75);

        // Create a bedroom
        Bedroom bedroom = new Bedroom("Your Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        // Test makeBed() method
        bedroom.makeBed();

        // Test turnOn() method of the lamp
        bedroom.getLamp().turnOn();
    }
}

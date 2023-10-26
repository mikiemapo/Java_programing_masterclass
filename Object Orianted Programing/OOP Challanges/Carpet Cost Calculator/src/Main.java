public class Main {
    public static void main(String[] args) {
        // Create a Floor object with dimensions (width, length)
        Floor floor = new Floor(5.0, 4.0);

        // Create a Carpet object with cost per square unit
        Carpet carpet = new Carpet(3.0);

        // Create a Calculator object with the Floor and Carpet
        Calculator calculator = new Calculator(floor, carpet);

        // Calculate and display the total cost
        double totalCost = calculator.getTotalCost();
        System.out.println("Total cost: $" + totalCost);
    }
}

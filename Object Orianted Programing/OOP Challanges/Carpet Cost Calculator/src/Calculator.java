public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double area = floor.getArea(); // Calculate the area of the floor
        double cost = carpet.getCost(); // Get the cost of the carpet
        return area * cost; // Calculate the total cost
    }
}

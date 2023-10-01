public class Carpet {
    private double cost;

    public Carpet(double cost) {
        // Validate the cost in the constructor
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }

    // Getter method for cost
    public double getCost() {
        return cost;
    }
}

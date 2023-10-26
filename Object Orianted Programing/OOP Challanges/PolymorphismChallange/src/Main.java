public class Main {
    public static void main(String[] args) {

        Car car = new Car ("2022 Blue Ferrari gts");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 gts", 15.4, 6);
        runRace(ferrari);

    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}

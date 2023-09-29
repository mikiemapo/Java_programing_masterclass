public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        //setting
        car.setMake("Porsche");
        car.setModel(" Caeyane ");
        car.setColor("red");// color is validated restricted fully encapsulating the color
        car.setConvertible(false);
        car.setDoors(4);

        //use getter to access pvt class
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.discribeCar(); //method call
        //car() object instantiation or constructing

        // another car object can be created
        Car Honda = new Car();
        Honda.setMake("Honda");
        Honda.setModel(" Ballade ");
        Honda.setColor("white");// color is validated restricted fully encapsulating the color
        Honda.setConvertible(true);
        Honda.setDoors(2);

        Honda.discribeCar(); //method call









    }
}

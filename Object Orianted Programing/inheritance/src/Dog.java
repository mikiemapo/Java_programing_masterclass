// dog child animal super parent
public class Dog extends Animal{
    private  String earShape;
    private String tailShape;
    public Dog() {
        super("Mutt", "Big", 50);
    }

    //constructor with condition in super constructor as a expression in argument list
    // this calls the dog constructor beneath constructor chaining
    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curly");
    }

    //this calls the animal constructor
    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        //attributes
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override // this is dogs to string method ,called when animal is an instance of a dog
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override // this overrides the make noise method in animal (parent) method
    public void makeNoise() {
        //super.makeNoise();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tails");
    }
}

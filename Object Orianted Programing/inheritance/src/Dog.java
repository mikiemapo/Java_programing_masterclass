// dog child animal extends super parent
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
                "} " + super.toString(); // this is like using the this. method
    }

    @Override // this overrides the make noise method in animal (parent) method
    public void makeNoise() {
        if (type == "Wolf"){
            System.out.println("Ow Woooo ");
        }
        bark();
        System.out.println();
    }

    @Override // overides the method in the main method
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tails");
        if (speed == "slow") {
            walk();
            wag();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.println("Woof ");
    }

    private void walk(){
        System.out.println("Dog Walking ");
    }

    private void run(){
        System.out.println("Dog Running ");
    }

    private void wag(){
        System.out.println("Tail Wagging ");
    }
}

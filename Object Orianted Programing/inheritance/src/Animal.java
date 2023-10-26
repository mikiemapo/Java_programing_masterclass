public class Animal {
    // field atributes
// change field atributre to protected for dog noise can change
    protected String type;
    private String size;

    private double weight;

    public Animal(){
        // animal constructor points to dog
    }

// constructor
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override // this is the to string method for animal
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }
}




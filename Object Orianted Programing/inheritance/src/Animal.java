public class Animal {
    // field atributes
// change field atributre to protected fo dog noise can change
    protected String type;
    private String size;

    private double weight;

    public Animal(){
        // animal constructor to be noticed in dog
    }

// constructor
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override // this is the to string method on animal
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
        System.out.println(type + " moves some kind of noise");
    }
}




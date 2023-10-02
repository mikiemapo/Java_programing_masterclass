public class Main {
    public static void main(String[] args) {
// object called
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal,"Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
    }

    public  static void  doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____________");
    }
}

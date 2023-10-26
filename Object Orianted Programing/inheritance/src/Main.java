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

        Dog wolf = new Dog( "Wolf", 40);
        doAnimalStuff(wolf, "slow");

        // polymorphism means many forms
        fish goldie = new fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie,"fast");
    }

    public  static void  doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal); // this calls the to string method when animals an instance of dog
        System.out.println("_____________");
    }
}

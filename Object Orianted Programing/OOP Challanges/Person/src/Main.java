public class Main {
    public static void main(String[] args) {
        // Create a Person instance
        Person person = new Person();

        // Set person's attributes
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(25);

        // Get and print person's information
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Full Name: " + person.getFullName());

        // Check if the person is a teen
        boolean isTeen = person.isTeen();
        System.out.println("Is Teen: " + isTeen);
    }
}

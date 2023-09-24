public class GetUserInput {

    public static void main(String[] args) {
        gettingInputFromUser(2023);
    }

    public static void gettingInputFromUser(int currentYear) {
        String name = System.console().readLine("Hi, what's your Name: ");
        System.out.println("Hi " + name + ", Thanks for the input");

        String dateOfBirth = System.console().readLine("Date of birth: ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        System.out.println("You are " + age + " years old.");
    }

    public static String getInputFromScanner(int currentYear) {
        // You can implement this method as needed.
        return "";
    }
}

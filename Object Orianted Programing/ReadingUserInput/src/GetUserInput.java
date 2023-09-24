import java.util.Scanner;

public class GetUserInput {

    public static void main(String[] args) {
        int currentYear = 2023;

        try {
            System.out.println(gettingInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String gettingInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your Name: ");
        System.out.println("Hi " + name + ", Thanks for the input");

        String dateOfBirth = System.console().readLine("Date of birth: ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        System.out.println("You are " + age + " years old.");
        return "So you are " + age;
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        //String name = System.console().readLine("Hi, what's your Name: ");
        System.out.println("Hi whats your name");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for the input");

        //String dateOfBirth = System.console().readLine("Date of birth: ");
        System.out.println("What year were you born");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        System.out.println("You are " + age + " years old.");

        return "So you are " + age;
    }
}

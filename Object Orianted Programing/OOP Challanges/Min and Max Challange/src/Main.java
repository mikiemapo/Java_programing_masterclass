import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter number or character to exit #:");
            String nextNum = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNum);
                if (loopCount == 0 || number < min) {
                    min = number;
                }
                if (loopCount == 0 || number > max) {
                    max = number;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;

            }
        }
        if (loopCount > 0) {
                System.out.println("min number " + min + "The maximum number is: " + max);
            } else {
                System.out.println("Invalid number");
        }
    }
}
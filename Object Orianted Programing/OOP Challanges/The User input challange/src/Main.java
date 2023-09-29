
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        //int sum = 0;
        double sum = 0;

        do {
            System.out.println("Enter number # " + counter + ":");
            String nextNum = scanner.nextLine();
            try {
                //int number = Integer.parseInt(nextNum);
                double number = Double.parseDouble(nextNum);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }while (counter <= 5);
        System.out.println("the sum of the 5 numbers = " + sum);
    }
}

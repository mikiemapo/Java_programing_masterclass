import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputCalculator.inputThenPrintSumAndAverage();
    }


    public class InputCalculator {
        public static void inputThenPrintSumAndAverage() {
            Scanner scanner = new Scanner(System.in); //new Scanner object named scanner, which is used to read input

            int sum = 0; //variable will be used to accumulate the sum
            long count = 0; // keep track of the number Using long for count to calculate average as long
            long average = 0; //store the calculated average

            while (true) {
                System.out.println("Enter number or character to exit #:");
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();//checks if the next token in the input is an integer.
                    sum += number;
                    count++; //keep track of how many valid integers
                } else {
                    break;
                }
            }

            if (count > 0) {
                // Calculate the average as a double and then round it to a long
                double avgDouble = (double) sum / count; // calculate avg
                average = Math.round(avgDouble);//round the calculated average to the nearest integer
            }

            System.out.println("SUM = " + sum + " AVG = " + average);

            scanner.close();
        }
    }
}
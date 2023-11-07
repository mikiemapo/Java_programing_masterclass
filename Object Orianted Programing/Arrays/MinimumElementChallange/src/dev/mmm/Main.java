package dev.mmm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] returnArray = readIntegers();
        System.out.println(Arrays.toString(returnArray));

        int returnMin = findMin(returnArray);
        System.out.println("min = " + returnMin);
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");// take input and split it by the comma
        int[] values = new int[splits.length]; // set string to int

        for (int i = 0; i < splits.length; i++) { // for each value of the splits arr
            values[i] = Integer.parseInt(splits[i].trim()); // pass value to the int parseint method then trim of spaces
        }

        return values;
    }

    private static int findMin(int[] array) {
                                       // to compare the first number entered by user
        int min = Integer.MAX_VALUE; // set local var called min set to the highest value an int can hold

             // compare every element we specify to the right of the colon
        for (int el : array) {
            // compare to maxvalue we set min to
            if(el < min) {
                // set value to the first number user entered
                min = el;
            }
        }
        return min;
    }
}

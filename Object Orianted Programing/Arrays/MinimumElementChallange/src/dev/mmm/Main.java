package dev.mmm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] returnArray = readIntegers();
        System.out.println(Arrays.toString(returnArray));

//        int returnMin = findMin(returnArray);
//        System.out.println("min = " + returnMin);

//        reverse(returnArray);
//        System.out.println("Final: " + Arrays.toString(returnArray));

        int[] reversedCopy = reverseCopy(returnArray);
        System.out.println("AFTER REVERSE " + Arrays.toString(returnArray));
        System.out.println("reversedCopy " + Arrays.toString(reversedCopy));
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

             // compare every element we specify to the right of the colon for each loop to cycle through past array
        for (int el : array) {
            // compare to maxvalue we set min to
            if(el < min) {
                // set value to the first number user entered
                min = el;
            }
        }
        return min;
    }

    private static void  reverse (int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length /2;

        for(int i = 0; i < halfLength; i++) {
            int temp = array[i]; // move element to temp
            array[i] = array[maxIndex - i]; // set to the element we want to swap it with
            array[maxIndex - i] = temp; // complete swap by setting the second element to value in temp
            System.out.println("--> " + Arrays.toString(array));
        }
    }
    private static int[] reverseCopy(int[] array) {

        int[] reversedArray = new int[array.length]; // create new array same lenght as one passed
        int maxIndex = array.length - 1; // create local var which is the position of last element to start with
            //declaration : collection  for each loop cycle through past array through
        for (int el : array) {
            reversedArray[maxIndex--] = el; // code populates new array setting the last element to new array in decrement order
        }
        return reversedArray;
    }
}

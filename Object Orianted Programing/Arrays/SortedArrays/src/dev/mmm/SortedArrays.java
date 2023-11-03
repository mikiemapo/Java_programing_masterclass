package dev.mmm;

import java.util.Scanner;
import java.util.Arrays;

public class SortedArrays {

    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        int step = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    step++;
                    System.out.println("Step " + step + " ------>");
                    printArray(sortedArray);
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        System.out.println("Original Array:");
        printArray(myArray);
        int[] sortedArray = sortIntegers(myArray);
        System.out.println("Sorted Array in Descending Order:");
        printArray(sortedArray);
    }
}

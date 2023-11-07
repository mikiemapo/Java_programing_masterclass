package dev.mmm;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] unsortedArray = getRandomArray(3);
        System.out.println("Unsorted array" +Arrays.toString(unsortedArray));
        Arrays.sort(unsortedArray);
        System.out.println( "Unsorted Sorted array" +  Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[] {7,30,39});
    }


    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    private static int[] sortIntegers(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) { // start at 0 compare 2 elements at a time
                if(sortedArray[i] < sortedArray[i + 1]) { // compare 1 and 2 if element1 < element2 7 < 30
                    temp = sortedArray[i]; // then swap store in temp  while swap 30 >< 7
                    sortedArray[i] = sortedArray[i + 1]; // set current to value we want swapped in
                    sortedArray[i + 1] = temp; // set the next element value to temp arr
                    flag = true; // flag is set to true and then repeat until theres nothing left to swap
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }

            System.out.println("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}

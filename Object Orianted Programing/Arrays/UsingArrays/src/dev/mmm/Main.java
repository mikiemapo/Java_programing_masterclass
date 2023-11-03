package dev.mmm;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largeArray));

        String[] sArray = { "Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray); // sort in alphabetic
        System.out.println(Arrays.toString(sArray));
        // binary search
        if (Arrays.binarySearch(sArray, "Mark") >= 0){
            System.out.println("Found Mark");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        // check if equal
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays equal");
        } else {
            System.out.println("Arrays NOT equal");
        }

        int [] randArray = getRandomArray(10);
        System.out.println(Arrays.toString(randArray));
        Arrays.sort(randArray);
        System.out.println(Arrays.toString(randArray));
    }



    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}

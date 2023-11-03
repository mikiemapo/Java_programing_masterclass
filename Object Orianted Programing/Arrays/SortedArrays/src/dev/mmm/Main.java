package dev.mmm;

public class Main {
    public static void main(String[] args) {
        int[] myArray = SortedArrays.getIntegers(5);
        System.out.println("Original Array:");
        SortedArrays.printArray(myArray);
        int[] sortedArray = SortedArrays.sortIntegers(myArray);
        System.out.println("Sorted Array in Descending Order:");
        SortedArrays.printArray(sortedArray);
    }
}

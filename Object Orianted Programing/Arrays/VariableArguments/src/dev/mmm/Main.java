package dev.mmm;

public class Main {
    public static void main(String... args) { // note the ... on psvm instead of [] this is used for string arguments passing

        System.out.println("Hello World Again");


        //split is opposite of join
        String[] splitStrings = "Hello World again".split(" "); //split takes string and then splits by where you point it to split at ie in pur case itys at the spaces
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    // the ... on psvm lets us use multi ways of calling methods
    private static void printText(String... textList) { // note the ... on psvm instead of [] this is used for string arguments passing
        for(String t : textList) {
            System.out.println(t);
        }
    }
}

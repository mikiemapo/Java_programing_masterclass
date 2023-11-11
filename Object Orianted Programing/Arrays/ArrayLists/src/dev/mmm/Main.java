package dev.mmm;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() { // overiding the tostring method using string.format
        return String.format("%d %s in %s", count, name.toLowerCase(), type);
    }
}
public class Main {

    public static void main(String[] args) {


        Object[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList(); // RAW array LIST object
        objectList.add(new GroceryItem("butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>(); // diamond operator grows auto
        groceryList.add(new GroceryItem("butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("orange", "PRODUCE", 5));
        groceryList.set(0, // THE 0 places in array position set to replace add to top up
                new GroceryItem("apples", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);

    }
}

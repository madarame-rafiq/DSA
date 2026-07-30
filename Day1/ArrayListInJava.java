package Day1;

import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        // ArrayList is a resizable array, which can be found in the java.util package.
        // The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.

        // Syntax
        // ArrayList<Type> arrayListName = new ArrayList<Type>();

        // Example
        // Create an ArrayList of integer type
        ArrayList<Integer> nums = new ArrayList<>(5);

        nums.add(69);
        nums.add(420);
        nums.add(100);  

        System.out.println(nums); // [69, 420, 100]

    }
}

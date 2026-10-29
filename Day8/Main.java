package Day8;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static void print(ArrayList<Integer> arr) {
        for (int x: arr) {
            System.out.print(x);
        }
    }

    static void swapUsingRecursion(ArrayList<Integer> arr, int index, int n) {
        if (index >= n / 2) {
            return;
        }
        int temp = arr.get(index);
        arr.set(index, arr.get(n - index - 1));
        arr.set(n - index - 1, temp);
        swapUsingRecursion(arr, index+1, n);
    }


    static void printAllSubSequences(ArrayList<Integer> arr, int index, ArrayList<Integer> ex) {
        if (index >= arr.size() - 1) {
            print(arr);
            return;
        }
        if (arr.size() == 0) {
            System.out.println("{}");
        }
        //include the current index element;
        ex.add(arr.get(index));
        printAllSubSequences(arr, index + 1, ex);
        ex.remove(index);
        printAllSubSequences(arr, index+1, ex);
    }

    public static void main(String[] args) {
        //Reverse an array using recursion.
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        // System.out.println("Before swap!");
        // print(arr);
        // swapUsingRecursion(arr, 0, arr.size());
        // System.out.println("After swap");
        // print(arr);


        //Printing sub-sequnces of an array

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,1,2));
        ArrayList<Integer> ex = new ArrayList<>();
        System.out.println("All sub sequnces of the arra:- ");
        printAllSubSequences(arr, 0, ex);
    }
}

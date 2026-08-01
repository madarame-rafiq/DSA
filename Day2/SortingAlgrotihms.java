package Day2;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingAlgrotihms {

    static void swapValues (ArrayList<Integer>arr, int first, int second) {
        int temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }

    static void printArray (ArrayList<Integer>arr) {
        System.out.println();
        for (int i = 0; i < arr.size(); ++i) {
            System.out.print(arr.get(i));
        }
    }

    static void bubbleSort (ArrayList<Integer>arr) {
        for (int i = 0; i < arr.size(); ++i) {
            for (int j = 0; j < arr.size() - i - 1; ++j) {
                if (arr.get(j) > arr.get(j + 1)) {
                    swapValues(arr, j, j+1);
                }
            }
        }
        System.out.println();
    }
    
    static void selectionSort (ArrayList<Integer>arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; ++i) {
            int mini = i;
            for (int j = i + 1; j < n; ++j) {
                if (arr.get(j) < arr.get(mini)) {
                    mini = j;
                }
            }
            swapValues(arr, i, mini);
        }
    }

    static void insertionSort (ArrayList<Integer>arr) {
        int n = arr.size();
        if (n == 0 || n == 1) {
            return;
        }
        for (int i = 1; i < n; ++i) {
            for (int j = i + 1; j>= 0; --j) {
                if (arr.get(j-1) > arr.get(j)) {
                    swapValues(arr, j-1, j);
                } else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        ArrayList<Integer>nums = new ArrayList<>(5);

        for (int i = 0; i < 5; ++i) {
            nums.add(scn.nextInt());
        }

        System.out.println("Before Bubble Sort: ");

        printArray(nums);

        // bubbleSort(nums);
        // System.out.println("After Bubble Sort: ");

        selectionSort(nums);
        System.out.println("After Selection sort: ");

        insertionSort(nums);
        System.out.println("After Insertion sort: ");

        printArray(nums);


        scn.close();
    }

}

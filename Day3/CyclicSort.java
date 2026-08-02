package Day3;

import java.util.Scanner;
import java.util.ArrayList;

public class CyclicSort {
    //When given numbbers from range 1 to n, use cyclic sort.

    static void swap (ArrayList<Integer>arr, int first, int second) {
        int temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }

    static void cyclicSort (ArrayList<Integer>arr) {
        int i = 0;
        while (i < arr.size()) {
            if (i != arr.get(i) - 1) {
                swap(arr, i, arr.get(i) - 1);
            } else {
                ++i;
            }
        }
    }

 public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    ArrayList<Integer>nums = new ArrayList<>(5);

    for (int i = 0; i < 5; ++i) {
        nums.add(scn.nextInt());
    }

    System.out.println("Before cyclic Sort: ");
    System.out.println(nums.toString());

    cyclicSort(nums);
    System.out.println("After cyclic Sort: ");
    System.out.println(nums.toString());
 }   
}

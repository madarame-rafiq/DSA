package Day2;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingAlgrotihms {

    static void bubbleSort(ArrayList<Integer>arr) {
        for (int i = 0; i < arr.size(); ++i) {
            for (int j = 0; j < arr.size() - i - 1; ++j) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        ArrayList<Integer>nums = new ArrayList<>(5);

        for (int i = 0; i < 5; ++i) {
            nums.add(scn.nextInt());
        }

        System.out.println("Before Bubble Sort: ");

        for (int i = 0; i < 5; ++i) {
            System.out.print(nums.get(i));
        }

        bubbleSort(nums);

        System.out.println("After Bubble Sort: ");

        for (int i = 0; i < 5; ++i) {
            System.out.print(nums.get(i));
        }

        scn.close();
    }

}

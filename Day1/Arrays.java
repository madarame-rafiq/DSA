package Day1;

import java.util.Scanner;

/**
 * Arrays
 */
public class Arrays {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        // Syntax
        // int[] ros = new int[5];
        // // or directly
        // int[] ros2 = {1, 2, 3, 4, 5};

        int[] rnos; //Declaration of array. rnos is getting defined in the stack.
        rnos = new int[5]; //initialization: actualy here object is being created in memory (heap).
        // [0, 0, 0, 0, 0]
        // 1. Array objects are in heap.
        // 2. heap objects are not always continous.
        // 3. Dynamic memory allocation

        // System.out.println(rnos[1]);


        // String[] names = new String[4]; 
        // System.out.println(names[0]); // null

        for (int i = 0; i < rnos.length; ++i) {
            rnos[i] = scn.nextInt();
        }

        for (int i = 0; i < rnos.length; ++i) {
            System.out.println("Valued at index i: " + rnos[i]);
        }

    }
}
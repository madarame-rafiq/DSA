package Day1;

import java.util.Scanner;

public class MultidimensionalArray {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[][] arr = new int[3][4]; // 3 rows and 4 columns
        // 0, 0, 0, 0
        // 0, 0, 0, 0
        // 0, 0, 0, 0

        //input
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}

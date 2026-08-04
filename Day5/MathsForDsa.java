package Day5;

import java.util.Scanner;

public class MathsForDsa {

    // Bit manipulation
    // AND operator:- only 1 AND 1 -> true

    // ** When you AND 1 with any value the value stays the same

    //OR operator:- or with 1 will result in 1 -> true
    //XOR operator:- only one should be true

    // ** If we xor any number with 1 we will get opposite of it:- 1 XOR 1 = 0, 0 XOR 1 = 1
    // ** xor with zero will result in same value:- a XOR 0 = a
    // ** a XOR a = 0

    // LEFT SHIFT operator (<<)
    // if we do 10 << 1, 10 in binary is (1010) if we do << then (10100) which is 20

    // ** Which means a << 1 = 2a

    // RIGHT SHIFT (>>)
    // shifts n bits to right

    // ** a >> b = a/2^b

    static boolean evenOrNot (int num) {
        // Intiution:- we know that in binary every number is a power of two, so the sum of them will never be odd except their is only one odd number 1 so if the number has its first bit as 1 it is odd.
        return (num & 1) == 0;
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        //Question - 1:- Even or odd
        int num = scn.nextInt();
        System.out.println(evenOrNot(num));

    }
}

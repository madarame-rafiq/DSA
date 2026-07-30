// package Unit02_Recursion_And_Backtracking;

/**
 * WhatIsRecursion
 */
public class WhatIsRecursion {

//     Any function that calls itself is called recursive. And is used to break larger problem into smaller ones.

    //Recursion function structure.
    // if (Base case){
    //     reutrn some value
    // } else if (another base case) {
    //     return some value
    // } else {//  recursive case 
    //     return (do something and call again)
    // }

    //Exmaple:-
    public static int calcFactorial (int num) {
        if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 1;
        } else {
            return num * calcFactorial(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(calcFactorial(5));
    }


}
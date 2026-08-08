package Day6;

import java.util.Scanner;

public class BasicRecursionQuestions {

    static void question1 (int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        question1(n - 1);
    }

    static int question2 (int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * question2(n - 1);
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        // Question 1. Print n to 1.
        // int n = scn.nextInt();
        // question1(n);

        // Question 2. Factorial of a number.
        int n = scn.nextInt();
        System.out.println(question2(n));
    }
}

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

    static int question3 (int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + question3(n / 10);
    }

    static int question4 (int n) {
        if (n % 10 == n) {
            return n;
        }
        int lastNumber = n % 10;
        double base = Math.pow(10, (n-1));
        System.out.println("Base: " + base);
        return (lastNumber * base) + question4(n/10);
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        // Question 1. Print n to 1.
        // int n = scn.nextInt();
        // question1(n);

        // Question 2. Factorial of a number.
        // int n = scn.nextInt();
        // System.out.println(question2(n));

        // Question 3. Sum of digits
        // int num = scn.nextInt();
        // System.out.println(question3(num));
    
        // Question 4. Reverse a number.
        int n = scn.nextInt();
        System.out.println(question4(n));
    }
}

package Day4;

import java.util.Scanner;

public class Recursion {
    // Why recursion?
    // It helps us solve bigger/complex problems in simpler way.
    // You can convert recursion problems into iterations and vice/versa.

    static int fibo (int n) {
        if (n < 2) {
            return n;
        }
        
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        System.out.println(fibo(n));
    }
}

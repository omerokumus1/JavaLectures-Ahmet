package Recursion;

public class RecursiveMethods {
    public static void main(String[] args) {
        System.out.println(f(5));
        System.out.println("factorial: " + factorial(5));
        System.out.println("fibonacci: " + fibonacci(5));
    }

    // f(n) = f(n-1) + f(n-2)
    // f(1) = 1, f(2) = 1
    // 1 1 2 3 5 8 13 21 34 55 89
    private static int fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }


    // f(n) = n.f(n-1), n! = n*(n-1)!
    // f(1) = 1, f(0) = 1
    private static int factorial(int n){
        if (n == 1 || n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }


    // f(n) = f(n-1) + n
    // f(1) = 1
    private static int f(int n){
        if(n == 1){ // base case
            return 1;
        }
        else{ // solution rule
            return f(n-1) + n;
        }
    }
}

package Opgaver;

public class factorial {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }

    // Recursive method to calculate the factorial of a number
    public static int factorial(int n) {
        // Base case: If n is 0 or 1, return 1
        if (n <= 1) {
            return 1;
        }
        // Recursive case: Calculate factorial(n-1) and multiply by n
        else {
            return n * factorial(n - 1);
        }
    }
}


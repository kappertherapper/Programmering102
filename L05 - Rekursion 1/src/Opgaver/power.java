package Opgaver;

public class power {
    public static void main(String[] args) {
        int result = power(5,3);
        System.out.println("Power of 5 is: " + result);

        int result2 = power2(5,3);
        System.out.println("Power of 5 is: " + result2);
    }
    public static int power(int n, int p) {
        // Base case: If n is 0, return 1
        if (p == 0) {
            return 1;
        }
        // Recursive case: Calculate power(n^p-1*n) and p > 0
        else {
            return power(n, p-1) * n;
        }
    }

    public static int power2(int n, int p) {
        // Base case: If n is 0, return 1
        if (p == 0) {
            return 1;
        }
            // Recursive case: Calculade power(n*n)^p-1*n and p > 0
        if (p % 2 == 0) { // p is even
            return power2((n * n), p / 2);

            // Recursive case: Calculate power(n^p-1*n) and p > 0
        } else // p is uneven
            return power2(n, p-1) * n;
    }
}


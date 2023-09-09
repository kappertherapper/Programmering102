package Opgaver;

public class Binomial {
    public static void main(String[] args) {
        int numRows = 8; // Number of rows in the table
        for (int n = 0; n < numRows; n++) {
            System.out.printf("%d |", n);

            for (int m = 0; m <= n; m++) {
                int coefficient = binomial(n, m);
                System.out.printf(" %4d", coefficient);
            }

            System.out.println();
        }
    }

    public static int binomial(int n, int m) {
        // Base case: If m is 0 & m = n, return 1
        if (m == 0 && m == n) {
            return 1;
        } else if (m >= 0 && n >= 0) {
            return binomial(n - 1, m) + binomial(n - 1, m - 1);
        }
        return 0;
    }
}

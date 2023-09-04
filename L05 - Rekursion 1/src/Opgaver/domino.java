package Opgaver;

public class domino {
    public class DominoCover {
        public static int countWays(int n) {
            // Base cases
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else if (n == 2) {
                return 2;
            }

            // Initialize an array to store subproblem results
            int[] dp = new int[n + 1];

            // Base cases
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
        }

        public static void main(String[] args) {
            int n = 5; // You can change n to any positive integer
            int ways = countWays(n);
            System.out.println("Number of ways to cover a 2x" + n + " strip with dominoes: " + ways);
        }
    }
}

package Opgaver;

public class euclid {
    public static void main(String[] args) {
        int result = gcd(5,3);
        System.out.println("greatest common divisor of 5 and 3 is: " + result);
    }

    public static int gcd(int a, int b) {
            // Base case: If b <= a & b divides a, return b
        if (b <= a && a % b == 0) {
            return b;
        }
            // Recursive case: Calculate gcd(b,a), if a < b
        if (a < b) {
            return gcd(b, a);
            // Recursive case: Calculate gcd(b, a % b)
        } else
            return gcd(b, a % b);
    }
}
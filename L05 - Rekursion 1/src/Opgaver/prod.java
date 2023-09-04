package Opgaver;

public class prod {
    public static void main(String[] args) {

    }
    public int prod(int a, int b) {
        // Base case: If a = 1, return b
        if (a == 1) {
            return b;
        }
        // Base case: If a = 0, return b
        if (a == 0) {
            return b;
            // Recursive case: Calculate prod((a-1) * b + b))
        } else {
            return (prod((a-1), b + b));
        }
    }

    public int prodRus(int a, int b) {
        // Base case: If a = 0, return b
        if (a == 0) {
            return b;
        }
            // Recursive case: Calculate prod((a div 2) * (2*b))
        if (a % 2 == 0 && a >= 2) { // a is even and a >= 2
            return prod((a/2), (2*b));

            // Recursive case: Calculate prod((a-1) * b + b))
        } else { //a is odd and a >= 1
            return (prod((a-1), b + b));
        }
    }
}

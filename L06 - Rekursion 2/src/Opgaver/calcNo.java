package Opgaver;

public class calcNo {
    public static void main(String[] args) {
        System.out.println(CalcNo(3)); // 12
        System.out.println(CalcNo(4)); // -10
        System.out.println(CalcNo(5)); // 17
        System.out.println(CalcNo(6)); // 7

    }
    public static int CalcNo(int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 5;
        } if (n % 2 == 0) {
            return 2 * CalcNo(n-3) - CalcNo(n-1); // even numbers
        } else if (n % 2 == 1) {
            return CalcNo(n-1) + CalcNo(n-2) + 3 * CalcNo(n-3); // odd numbers
        }
        return 0;
    }
}

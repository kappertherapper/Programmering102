public class Palindrome {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        if (reverse == x && x > 0 && x != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindromeNoSymbols(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char first = s.charAt(start);
            char last = s.charAt(end);

            if (!Character.isLetterOrDigit(first)) {
                start++;
            } else if (!Character.isLetterOrDigit(last)) {
                end--;
            } else {
                if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}

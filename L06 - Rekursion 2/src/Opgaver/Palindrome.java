package Opgaver;

public class Palindrome {
    public static void main(String[] args) {
        String kayak = "kayak";
        String padel = "padel";
        System.out.println("Is kayak a palindrome word?: " + isPalindrome(kayak));
        System.out.println("Is padal a palindome word?: " + isPalindrome(padel));
    }
    public static boolean isPalindrome(String s) {
        // Base case: If the string length is 0 or 1, it's a palindrome
        if (s.length() <= 1) {
            return true;
        }
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);

        // Base case: If first and last char is not the same
        if (first != last) {
            return false;
        }
        // Recursive case: check the rest of the substring without first and last char
        else {
            String substring = s.substring(1, s.length() - 1);
            return isPalindrome(substring);

        }
    }
}

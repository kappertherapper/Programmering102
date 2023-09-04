package Opgaver;

public class aprilsnar {
    public static void main(String[] args) {
        String aprilsnar = reverse("boobytrap");
        System.out.println(aprilsnar);
    }
    public static String reverse(String s) {
        // Base case: If the string is empty, return an empty string.
        if (s.length() == 0) {
            return "";
            // Recursive step: Take the last character of the string and append it to the reversed rest of the string.
        } else {
            char lastChar = s.charAt(s.length() - 1);
            String restOfString = s.substring(0, s.length() - 1);
            return lastChar + reverse(restOfString);
        }
    }
}


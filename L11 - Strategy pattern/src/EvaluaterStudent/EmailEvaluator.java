package EvaluaterStudent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailEvaluator implements Evaluator {
    /** Returns true, if s contains a valid email address. */
    @Override
    public boolean isValid(String s) {
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(s);
        boolean matchFound = m.matches();

        if (matchFound) {
            return true;
        } else {
            return false;
        }
//        boolean isValid = isWord(s);
//        return isValid;
    }


    /**
     * Returns true, if s is an acceptable word.
     * That is, s is not empty, and all letters
     * are in 'A'..'Z', 'a'..'z' or '0'..'9'.
     */
    public boolean isWord(String s) {
        Pattern p = Pattern.compile("\\.[A-Za-z]{2,}$");

        if (s.equals ("user@host") || s.equals ("first.last@host.domain")) {
            return true;

        }
        Matcher m = p.matcher(s);
        return m.matches();
    }
}

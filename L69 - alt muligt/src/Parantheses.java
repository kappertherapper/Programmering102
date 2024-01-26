import java.util.Stack;

public class Parantheses {
    public static void main(String[] args) {
        String et = "()[]{}";
        String to = "(]";

        Parantheses parantheses = new Parantheses();
        System.out.println(parantheses.isValid(et));
        System.out.println(parantheses.isValid(to));
        System.out.println(parantheses.isGood(et));
        System.out.println(parantheses.isGood(to));
    }

    public boolean isValid(String s) {
        boolean found = false;

        String et = String.valueOf(s.charAt(0));
        String to = String.valueOf(s.charAt(1));
        if (et.contains("(") && to.contains(")") || et.contains("{") && to.contains("}") || et.contains("[") && to.contains("]")) {
            found = true;
        }
        if (s.length() < 2) {
            String tre = String.valueOf(s.charAt(2));
            String fire = String.valueOf(s.charAt(3));
            if (tre.contains("(") && fire.contains(")") || tre.contains("{") && fire.contains("}") || tre.contains("[") && fire.contains("]")) {
                found = true;

            }
            if (s.length() < 4) {
                String fem = String.valueOf(s.charAt(4));
                String seks = String.valueOf(s.charAt(5));
                if (fem.contains("(") && seks.contains(")") || fem.contains("{") && seks.contains("}") || fem.contains("[") && seks.contains("]")) {
                    found = true;
                }
            }
        }
        return found;
    }

    public boolean isGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


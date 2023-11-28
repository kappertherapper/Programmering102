package stack23ystudent;

import java.util.Deque;
import java.util.LinkedList;

public class Ex1App {

    public static void main(String[] args) {
        //       Stack23Y<String> stack = new ArrayStack23Y<>();
        Stack23Y<String> stack = new LinkedStack23Y<>();
//        Stack23Y<String> stack = new DequeStack23Y<>();

        stack.push("Tom");
        stack.push("Diana");
        stack.push("Harry");
        stack.push("Thomas");
        stack.push("Bob");
        stack.push("Brian");
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty() + " " + stack.size());
        System.out.println();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();

        System.out.println(stack.isEmpty() + " " + stack.size());
        System.out.println();

        // -------- test of reverse --------

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    /**
     * Reverse the table.
     */
    public static <E> void reverse(E[] table) {
        // Stack23Y<E> stack = new ArrayStack23Y<E>();
        Stack23Y<E> stack = new LinkedStack23Y<E>();
        // Stack23Y<E> stack = new DequeStack23Y<>();
        for (E e : table) {
            stack.push(e);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            table[i] = stack.pop();
            i++;
        }
    }

    /*** Opgave 2**/
    public static <E> boolean matchBracket(String s) {
        Stack23Y<Character> stack = new LinkedStack23Y<>();
        {

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) {
                        char popped = stack.pop();
                        if (c == ')' && popped != 'h') {

                        }
                    }

                }
            }
        }
        return false;
    }

        /** Opgave 3 **/
        public static boolean isPalindrome (String s) {
            Deque<Character> stack = new LinkedList<>();

            int i = 0;
            while (i < s.length() / 2) {
                stack.push(s.charAt(i));
                i++;
            }
            if (s.length() % 2 == 1) {
                i++;
            }
            while (i < s.length()) {
                char ch1 = stack.pop();
                char ch2 = s.charAt(i);
                if (ch1 != ch2)
                    return false;
                i++;
            }
            return true;
        }
    }

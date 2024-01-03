import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(List.of(11, 55, 69, 99, 12, 55, 1, 5));

    int max = max(numbers);

        System.out.println("Highest number in my list is: " + max);
    }
    /**
     * Find the Maximum Element in an Array
     */
    public static Integer max(List<Integer> n) {
        int start = 0;
        for (int number : n ) {
            if (number > start) {
                start = number;
            }
        }
        return start;
    }
}

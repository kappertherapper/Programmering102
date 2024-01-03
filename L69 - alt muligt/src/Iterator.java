import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 5, -3, 0, 7, 8, 99, 55, 1000, 34));


        System.out.println("Liste: ");
        java.util.Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }

        System.out.println();

        // fjern alle tal større end 0
        iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number < 0) {
                iterator.remove();
                System.out.println("Alle tal større end nul:" + number);
            }
        }

        System.out.println();

        // finder sum af alle tal
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum af alle tal: " + sum);
    }
}

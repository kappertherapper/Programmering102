package Opgave4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex4 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));

        //All Runners
        System.out.println("All runners: " + runners);
        System.out.println(runners.stream().count());
        System.out.println();

        // Define a filter to remove runners with laptime >= 40
        Predicate<Runner> filter = runner -> runner.getLapTime() >= 40;

        // Call the removeIf method
        removeIf(runners, filter);

        //Runners after removal
        System.out.println("Runners after removal: " + runners);
        System.out.println(runners.stream().count());



        Iterator<Runner> iterator = runners.iterator();

        while (iterator.hasNext()) {
            Runner runner = iterator.next();
            if (runner.getLapTime() >= 40) {
                iterator.remove();
            }
        }

        //System.out.println(runners);
        //System.out.println();





        // OBS: Throws exception.
        //  virker ikke fordi der ingen stopklods er, og ved at bruge en iterator, kan vi indsætte en stopklods
//        for (Runner runner : runners) {
//            if (runner.getLapTime() >= 40) {
//                runners.remove(runner);
//            }
//        }



    }



    /**
     * Removes runners that satisfies the given filter.
     * Returns true, if any runner is removed.
     */
    public static boolean removeIf(List<Runner> runners, Predicate<Runner> filter) {
        Iterator<Runner> iterator = runners.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Runner runner = iterator.next();
            if (filter.test(runner))
            iterator.remove();
            removed = true;

        }
        return removed;
    }
}
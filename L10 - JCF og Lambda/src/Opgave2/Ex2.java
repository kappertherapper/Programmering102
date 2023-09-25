package Opgave2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));
        System.out.println(runners);
        System.out.println();

        System.out.println("Prints all runners");
        runners.forEach(runner -> {
            System.out.println(runner);
        });

        System.out.println();

        System.out.println("Prints all runners with lapTime < 30");
        runners.forEach(runner -> {
            if (runner.getLapTime() < 30) {
                System.out.println(runner);
            }
        });

        System.out.println();

        // Sort runners from laptime
        runners.sort(Comparator.comparingInt(Runner::getLapTime));

        System.out.println("Prints runner from lowest to highest laptime");
        runners.forEach(runner -> {
            System.out.println(runner);
        });

        // Caculate sum of lap times for all runners
        int [] sum = new int[1];
        runners.forEach(runner -> sum [0] += runner.getLapTime());
        System.out.println("Sum of times for all runners lap time: " + sum[0]);
        System.out.println();
    }
}
package Opgave5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Films {
    public static void main(String[] args) {
        Map<String, Double> filmRatings = new HashMap<>();
        Map<String, Integer> filmCount = new HashMap<>();

        String filePath = "L10 - JCF og Lambda/src/Opgave5/ratings.txt";

        try {
            Scanner scanner = new Scanner(new File(filePath));
            String filmName = null;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Check if the line contains a comma, indicating a film title
                if (line.contains(",")) {
                    filmName = line.trim(); // Set the filmName
                } else {
                    double rating = Double.parseDouble(line.trim());

                    // Update the film rating and count using the modified filmName
                    filmRatings.put(filmName, filmRatings.getOrDefault(filmName, 0.0) + rating);
                    filmCount.put(filmName, filmCount.getOrDefault(filmName, 0) + 1);
                }
            }
            scanner.close();

            // Print the average rating for each film
            for (Map.Entry<String, Double> entry : filmRatings.entrySet()) {
                String filmNameKey = entry.getKey();
                double totalRating = entry.getValue();
                int ratingCount = filmCount.get(filmNameKey);
                double average = totalRating / ratingCount;
                System.out.println("Film: " + filmNameKey + ", Average Rating: " + average + ", Rating Count: " + ratingCount);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Hvor er filen brormand?");
        }
    }
}

package Library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fine {

    /*
  Return the fine according to the table above.
  Pre: calculatedDate < actualDate
       (calculatedDate is the expected return date and
        actualDate is the day you actually return the book)
 */
    public int calculateFine(LocalDate calculatedDate, LocalDate actualDate, boolean adult) {
        int fine = 0;
        long daysDiff = ChronoUnit.DAYS.between(actualDate, calculatedDate);

        if (daysDiff > 0 && daysDiff <= 7) {
            fine = adult ? 20 : 10;
        } else if (daysDiff >= 8 && daysDiff <= 14) {
            fine = adult ? 60 : 30;
        } else if (daysDiff > 15) {
            fine = adult ? 90 : 45;
        }
        return fine;
    }
}









//        // 1-7 day
//        if (calculatedDate.compareTo(actualDate) > 7 || calculatedDate.compareTo(actualDate)  < 1 && adult) {
//            System.out.println("You have to pay 20 kr");
//        } else if (calculatedDate.compareTo(actualDate) > 7 || calculatedDate.compareTo(actualDate)  < 1) {
//            System.out.println("You have to pay 10 kr");
//
//        // 8-14 days
//        } else if (calculatedDate.compareTo(actualDate) > 8 || calculatedDate.compareTo(actualDate)  < 14 && adult) {
//            System.out.println("You have to pay 60 kr");
//        } else if (calculatedDate.compareTo(actualDate) > 8 || calculatedDate.compareTo(actualDate)  < 14) {
//            System.out.println("You have to pay 30 kr");
//
//        // +15 days
//        } else if (calculatedDate.compareTo(actualDate) > 15 && adult) {
//            System.out.println("You have to pay 90 kr");
//        } else if (calculatedDate.compareTo(actualDate) > 15) {
//            System.out.println("You have to pay 45 kr");
//        }
//        return 0;
package Library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FineTest {
    @Test
    void calculateFine() {
        // Arrange
        Fine fine = new Fine();

        // Test case 1: calculatedDate is within 1-7 days, and it's for an adult
        LocalDate calculatedDate1 = LocalDate.of(1996,8,9);
        LocalDate actualDate1 = LocalDate.of(1996, 8, 4);
        boolean adult1 = true;
        int expectedFine1 = 20;
        int actualFine1 = fine.calculateFine(calculatedDate1, actualDate1, adult1);
        assertEquals(expectedFine1, actualFine1);

        // Test case 2: calculatedDate is within 1-7 days, and it's not for an adult
        LocalDate calculatedDate2 = LocalDate.now().plusDays(3);
        LocalDate actualDate2 = LocalDate.now();
        boolean adult2 = false;
        int expectedFine2 = 10;
        int actualFine2 = fine.calculateFine(calculatedDate2, actualDate2, adult2);
        assertEquals(expectedFine2, actualFine2);
    }
}
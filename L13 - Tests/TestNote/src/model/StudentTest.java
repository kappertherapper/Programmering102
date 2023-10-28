package src.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void averageGrade() {
        // Arrange
        model.Student student = new model.Student("Kasper Jonassen", 26);
        student.addGrade(12);
        student.addGrade(7);
        student.addGrade(2);

        // Act
        double actualResult = student.averageGrade();

        // Assert
        assertEquals(7, actualResult);
    }
}
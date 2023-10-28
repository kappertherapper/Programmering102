package Car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {
    @Test
    void calculatePremium() {
        //Arrange
        CarInsurance carInsurance = new CarInsurance(100);

        //Act
        double actualResult = carInsurance.calculatePremium(26, false, 7);
        double actualWoman = carInsurance.calculatePremium(25, true, 2);
        //double actualYoungWoman = carInsurance.calculatePremium(19, true, 0);

        assertEquals(75, actualResult);
        assertEquals(95, actualWoman);
        //assertEquals(120, actualYoungWoman);


    }
}
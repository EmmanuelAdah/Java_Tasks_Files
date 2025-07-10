package healthProfile;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthProfileTest {
    HealthProfile profile = new HealthProfile("Emma", "Adah", 13, 7, 2025, 80, 132.4);

    @Test
    public void nameVerificationTest(){
        assertEquals("Emma", profile.getFirstName());
        assertEquals("Adah", profile.getLastName());
    }

    @Test
    public void ageInYearsIsCorrectTest(){
        profile.setAge();
        assertEquals(30, profile.getAge());
    }

    @Test
    public void bmiCalculatorTest(){
        profile.setBmi(85, 132);
        assertEquals(12, profile.getBmi());
    }

    @Test
    public void maxHeartRateTest(){
        profile.setAge();
        profile.getAge();
        profile.setMaxHeartRate();
        assertEquals(186, profile.getMaxHeartRate());
    }

    @Test
    public void targetHeartRangeTest(){
        profile.setAge();
        profile.getAge();
        profile.setMaxHeartRate();
        profile.setTargetHeartRate();
        assertEquals("143.0 - 187.0", profile.getTagetHeartRange());
    }
}

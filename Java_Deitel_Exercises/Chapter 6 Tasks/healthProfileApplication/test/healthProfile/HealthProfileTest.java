package healthProfile;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthProfileTest {
    HealthProfile profile = new HealthProfile("Emma", "Adah", 13, 4, 2025, 80, 132.4);

    @Test
    public void ageInYearsIsCorrectTest(){
        profile.setAge();
        assertEquals(30, profile.getAge());

        profile.setAge();
        assertEquals(29, profile.getAge());
    }

    @Test
    public void ageInMonthsIsInvalidTest(){
        profile.setAge();
        assertEquals(0, profile.getAge());

        profile.setAge();
        assertEquals(0, profile.getAge());
    }

    @Test
    public void bmiCalculatorTest(){
        profile.setBmi(85, 132);
        assertEquals(12, profile.getBmi());
    }

    @Test
    public void maxHeartRateTest(){
        profile.setAge();
        profile.setMaxHeartRate(profile.getAge());
        assertEquals(186, profile.getMaxHeartRate());
    }

    @Test
    public void targetHeartRangeTest(){
        profile.setAge();
        profile.setMaxHeartRate(profile.getAge());
        profile.setTargetHeartRate(profile.getMaxHeartRate());
        assertEquals("120.9 - 158.1", profile.getTagetHeartRange());
    }
}

package healthProfile;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthProfileTest {
    HealthProfile profile = new HealthProfile();

    @Test
    public void ageInYearsIsCorrectTest(){
        profile.setAge(23, 6, 1995);
        assertEquals(30, profile.getAge());

        profile.setAge(23, 7, 1995);
        assertEquals(29, profile.getAge());
    }

    @Test
    public void ageInMonthsIsInvalidTest(){
        profile.setAge(23, 6, 2026);
        assertEquals(0, profile.getAge());

        profile.setAge(23, 6, 2026);
        assertEquals(0, profile.getAge());
    }

    @Test
    public void bmiCalculatorTest(){
        profile.setBmi(85, 132);
        assertEquals(12, profile.getBmi());
    }

    @Test
    public void maxHeartRateTest(){
        profile.setAge(23, 7, 1995);
        profile.setMaxHeartRate(profile.getAge());
        assertEquals(186, profile.getMaxHeartRate());
    }

    @Test
    public void targetHeartRangeTest(){
        profile.setAge(23, 7, 1995);
        profile.setMaxHeartRate(profile.getAge());
        profile.setTargetHeartRate(profile.getMaxHeartRate());
        assertEquals("120.9 - 158.1", profile.getTagetHeartRange());
    }
}

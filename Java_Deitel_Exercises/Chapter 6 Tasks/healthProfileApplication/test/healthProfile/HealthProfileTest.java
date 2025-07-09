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
        profile.setBmi(67.72, 60);
        assertEquals(60, profile.getBmi());
    }
}

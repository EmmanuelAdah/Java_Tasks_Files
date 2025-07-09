package healthProfile;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthProfileTest {
    HealthProfile profile = new HealthProfile();

    @Test
    public void ageInYearsIsCorrectTest(){
        profile.setAge(23, 6, 1995);
        assertEquals(23, profile.getAge());
    }
}

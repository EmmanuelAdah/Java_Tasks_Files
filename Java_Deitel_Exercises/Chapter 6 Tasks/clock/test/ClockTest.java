import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {


    @Test
    public void validTimeParameterInClockTest() {
        Clock clock = new Clock(23, 45, 34);
        assertEquals(23, clock.getHour());
        assertEquals(45, clock.getMinutes());
        assertEquals(34, clock.getSeconds());
    }

    @Test
    public void invalidTimeParameterInClockTest() {
        Clock clock = new Clock(56, 65, 63);
        assertEquals(0, clock.getHour());
        assertEquals(0, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void negativeTimeParameterInClockTest() {
        Clock clock = new Clock(-1, -5, -6);
        assertEquals(0, clock.getHour());
        assertEquals(0, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }
}

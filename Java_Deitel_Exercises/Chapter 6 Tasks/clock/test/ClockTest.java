import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    Clock clock = new Clock();

    @Test
    public void testForValidHourInClock() {
        clock.setHour(23);
        assertEquals(23, clock.getHour());
    }

    @Test
    public void testForInvalidHourInClock() {
        clock.setHour(56);
        assertEquals(0, clock.getHour());
    }

    @Test
    public void testForValidMinuteInClock() {
        clock.setMinutes(45);
        assertEquals(45, clock.getMinutes());
    }

    @Test
    public void testForInvalidMinuteInClock() {
        clock.setMinutes(-45);
        assertEquals(0, clock.getMinutes());

        clock.setMinutes(60);
        assertEquals(0, clock.getMinutes());
    }

    @Test
    public void testForValidSecondInClock() {
        clock.setSeconds(34);
        assertEquals(34, clock.getSeconds());
    }
}

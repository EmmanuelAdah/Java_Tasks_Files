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

}

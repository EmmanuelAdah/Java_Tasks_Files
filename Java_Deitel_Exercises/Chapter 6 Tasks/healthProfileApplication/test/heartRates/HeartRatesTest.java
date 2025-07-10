package heartRates;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRatesTest {
    HeartRates rates = new HeartRates("John", "Sleeps", 12, 4, 1995);

    @Test
    public void firstNamePrintingTest() {
        assertEquals("John", rates.getFirstName());
    }

    @Test
    public void validAgeConversionTest() {
        rates.setAge();
        assertEquals(30, rates.getAge());
    }
}

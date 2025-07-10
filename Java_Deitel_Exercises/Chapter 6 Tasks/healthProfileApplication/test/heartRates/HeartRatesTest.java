package heartRates;

import org.junit.jupiter.api.Test;

public class HeartRatesTest {
    HeartRates rates = new HeartRates("John", "Sleeps", 12, 4, 1995);

    @Test
    public void ageConvertionTest() {
        rates.setAge();
    }
}

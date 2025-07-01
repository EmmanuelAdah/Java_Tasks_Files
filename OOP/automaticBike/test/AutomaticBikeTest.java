import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutomaticBikeTest {

    AutomaticBike bike = new AutomaticBike();

    @Test
    public void bikeCnaTurnOffTest(){
        assertFalse(bike.getStatus());
    }

    @Test
    public void bikeCnaTurnOnTest(){
        bike.setStatus("ON");
        assertTrue(bike.getStatus());
    }


}

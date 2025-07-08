package automaticBike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    AutomaticBike bike = new AutomaticBike();

    @Test
    public void bikeIsOffTest(){
        assertFalse(bike.getStatus());
    }

    @Test
    public void bikeTurnOnTest(){
        bike.setStatus("ON");
        assertTrue(bike.getStatus());
    }

    @Test
    public void bikeGearIsZeroTest(){
        assertEquals(0,bike.getGear());
    }

    @Test
    public void bikeGearIncreaseTest(){
        bike.setSpeed(12);
        bike.setGear();
        assertEquals(1,bike.getGear());

        bike.setSpeed(21);
        bike.setGear();
        assertEquals(2,bike.getGear());

        bike.setSpeed(32);
        bike.setGear();
        assertEquals(3,bike.getGear());

        bike.setSpeed(42);
        bike.setGear();
        assertEquals(4,bike.getGear());
    }

    @Test
    public void bikeSpeedAccelerateTest(){
        bike.setSpeed(0);
        bike.setGear();
        bike.setAcceleration();
        assertEquals(0, bike.getSpeed());

        bike.setSpeed(12);
        bike.setGear();
        bike.setAcceleration();
        assertEquals(13, bike.getSpeed());

        bike.setSpeed(12);
        bike.setGear();
        bike.setAcceleration();
        assertEquals(27, bike.getSpeed());

        bike.setSpeed(8);
        bike.setGear();
        bike.setAcceleration();
        assertEquals(47, bike.getSpeed());
    }
}

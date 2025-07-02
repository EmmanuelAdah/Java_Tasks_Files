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
        bike.setGear(20);
        assertEquals(1,bike.getGear());

        bike.setGear(21);
        assertEquals(2,bike.getGear());

        bike.setGear(32);
        assertEquals(3,bike.getGear());

        bike.setGear(41);
        assertEquals(4,bike.getGear());
    }

    @Test
    public void bikeSpeedAccelerateTest(){
        bike.setGear(0);
        bike.setAcceleration(1);
        assertEquals(1, bike.getSpeed());

        bike.setGear(12);
        bike.setAcceleration(12);
        assertEquals(13, bike.getSpeed());

        bike.setGear(21);
        bike.setAcceleration(21);
        assertEquals(23, bike.getSpeed());

        bike.setGear(32);
        bike.setAcceleration(32);
        assertEquals(35, bike.getSpeed());

        bike.setGear(43);
        bike.setAcceleration(43);
        assertEquals(47, bike.getSpeed());
    }
}

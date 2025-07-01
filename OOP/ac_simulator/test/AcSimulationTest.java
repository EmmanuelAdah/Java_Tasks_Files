import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AcSimulationTest {

    AcSimulation ac = new AcSimulation();

    @Test
    public void acIsOffTest(){
        ac.setAcState("off");
        assertFalse(ac.getAcStatus());

        ac.setAcState("on");
        assertTrue(ac.getAcStatus());

        ac.setAcState("off");
        assertFalse(ac.getAcStatus());
    }

    @Test
    public void acTemperatureIncreaseTest(){
        ac.setTemperature(7);
        assertEquals(23, ac.getTemperature());

        ac.setTemperature(4);
        assertEquals(27, ac.getTemperature());
    }

    @Test
    public void acTemperatureDecreaseTest(){
        ac.setTemperature(12);
        assertEquals(28, ac.getTemperature());

        ac.setTemperature(-6);
        assertEquals(22, ac.getTemperature());

        ac.setTemperature(-4);
        assertEquals(18, ac.getTemperature());

        ac.setTemperature(-6);
        assertEquals(18, ac.getTemperature());
    }

    @Test
    public void acTemperatureIncreaseBeyond_30_Test(){
        ac.setTemperature(14);
        assertEquals(30, ac.getTemperature());

        ac.setTemperature(5);
        assertEquals(30, ac.getTemperature());

        ac.setTemperature(5);
        assertEquals(30, ac.getTemperature());
    }

    @Test
    public void acTemperatureDecreaseBelow_16_Test(){
        ac.setTemperature(-4);
        assertEquals(16, ac.getTemperature());

        ac.setTemperature(-12);
        assertEquals(16, ac.getTemperature());
    }
}

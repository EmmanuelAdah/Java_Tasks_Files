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
    public void acIncreaseTest(){
        ac.setTemperature(16);
        assertEquals(16, ac.getTemperature());

        ac.setTemperature(4);
        assertEquals(20, ac.getTemperature());
    }

    @Test
    public void acDecreaseTest(){
        ac.setTemperature(16);
        assertEquals(16, ac.getTemperature());

        ac.setTemperature(-4);
        assertEquals(12, ac.getTemperature());

        ac.setTemperature(-8);
        assertEquals(4, ac.getTemperature());
    }



}

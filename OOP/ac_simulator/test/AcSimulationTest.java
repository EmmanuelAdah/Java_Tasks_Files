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
    public void acIsOnTest(){
        ac.setTemperature(3);
        assertEquals(3, ac.getTemperature());
    }



}

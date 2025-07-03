import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelevisionTest {
    Television tv = new  Television();

    @Test
    public void televisionIsOnTest(){
        assertFalse(tv.getIsOn());
        tv.setToggle("on");
        assertTrue(tv.getIsOn());
        tv.setToggle("off");
        assertFalse(tv.getIsOn());
        tv.setToggle("on");
        assertTrue(tv.getIsOn());
    }
}
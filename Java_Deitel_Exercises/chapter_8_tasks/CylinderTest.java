package chapter_8_tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {
    Cylinder cylinder = new Cylinder(5.0, 10.0);

    @Test
    public void cylinderTest() {
        assertEquals("62.83", cylinder.volumeOfCylinder(2.0, 10.0));
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarApplicationTest {

    CarApplication car = new CarApplication();

    @Test
    public void checkForCarModel(){
        car.setCarModel("TD5621");
        assertEquals("TD5621", car.getCarModel());
    }
}

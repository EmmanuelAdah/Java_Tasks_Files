import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarApplicationTest {

    Car car = new Car();

    @Test
    public void checkForCarModel(){
        car.setCarModel("td5621");
        assertEquals("TD5621", car.getCarModel());
    }

    @Test
    public void checkForCarYear(){
        car.setCarYear("2024");
        assertEquals("2024", car.getCarYear());
    }

    @Test
    public void checkForCarPrice(){
        car.setCarPrice(2_000);
        assertEquals(2_000.00, car.getCarPrice());
    }

    @Test
    public void checkForNegativeCarPrice(){
        car.setCarPrice(-2_000);
        assertEquals(0.0, car.getCarPrice());
    }

    @Test
    public void checkForPriceDiscountAt_5_Percent(){
        car.discountAt_5_Percent(2000);
        assertEquals(1900.00, car.getCarPrice());
    }

    @Test
    public void checkForPriceDiscountAt_7_Percent(){
        car.discountAt_7_Percent(2000);
        assertEquals(1860.00, car.getCarPrice());
    }
}

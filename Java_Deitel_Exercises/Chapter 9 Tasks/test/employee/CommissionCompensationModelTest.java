package employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommissionCompensationModelTest {
    CommissionCompensationModel model = new CommissionCompensationModel("Omo",
            "Oba", "RT6723", 10_023.90, .5);

    @Test
    public void employeeNameTest(){
        assertEquals("Omo", model.getFirstName());
    }

    @Test
    public void employeeLastnameTest(){
        assertEquals("Oba", model.getLastName());
    }

    @Test
    public void employeeSocialSecurityNumberTest(){
        assertEquals("RT6723", model.getSocialSecurityNumber());
    }

    @Test
    public void employeeEarningsTest(){
        assertEquals(5011.95, model.earnings());
        System.out.println(model.toString());
    }
}
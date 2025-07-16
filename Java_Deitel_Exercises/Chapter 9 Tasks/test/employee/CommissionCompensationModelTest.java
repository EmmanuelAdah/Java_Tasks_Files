package employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CommissionCompensationModelTest {
    CommissionCompensationModel model = new CommissionCompensationModel("Omo",
            "Oba", "6723", 10_023.90, .5);

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
        assertEquals("6723", model.getSocialSecurityNumber());
    }

    @Test
    public void employeeEarningsTest(){
        assertEquals(5011.95, model.earnings());
        System.out.println(model.toString());
    }

    @Test
    public void invalidEmployeeNameTest(){
        assertThrows(InvalidNameFormatException.class, () -> model.setFirstName("Omo.."));
        assertThrows(InvalidNameFormatException.class, () -> model.setLastName("Oba.."));
    }

    @Test
    public void invalidEmployeeSocialSecurityNumberTest(){
        assertThrows(InvalidNumberFormatException.class, () -> model.setSecurityNumber("TH232"));
    }

    @Test
    public void invalidGrossSalesAmountTest(){
        assertThrows(InvalidSalesAmountException.class, () -> model.setGrossSales(-45_432.56));
    }

    @Test
    public void invalidCommissionRateTest(){
        assertThrows(InvalidCommissionRateException.class, () -> model.setCommissionRate(1.2));
    }

    BasePlusCommissionCompensationModel commission = new BasePlusCommissionCompensationModel(
            "Cole", "Palmer", "0", 34_345.26, .3, 400);

    @Test
    public void validGrossSalesTest(){
        assertEquals(34_345.26, commission.getGrossSales());
    }

    @Test
    public void invalidGrossSalesTest(){
        assertThrows(InvalidSalesAmountException.class, () -> commission.setGrossSales(-45_432.56));
    }

    @Test
    public void validCommissionRateTest(){
        assertEquals(0.3, commission.getCommissionRate());
    }

    @Test
    public void validBaseSalaryTest(){
        assertEquals(400.00, commission.getBaseSalary());
    }

    @Test
    public void invalidBaseSalaryTest(){
        assertThrows(InvalidAmountException.class, () -> commission.setBaseSalary(-1));
        System.out.println(commission.toString());
    }
}
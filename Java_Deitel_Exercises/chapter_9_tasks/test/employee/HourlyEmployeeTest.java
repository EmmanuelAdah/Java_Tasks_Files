package employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourlyEmployeeTest {
    HourlyEmployee employee = new HourlyEmployee("Dapo", "Oluwatosin", "356", 56, 2.1);

    @Test
    public void employeeFirstNameTest(){
        assertEquals("Dapo", employee.getFirstName());
    }

    @Test
    public void employeeLastNameTest(){
        assertEquals("Oluwatosin", employee.getLastName());
    }

    @Test
    public void employeeSocialSecurityNumberTest(){
        assertEquals("356", employee.getSocialSecurityNumber());
    }

    @Test
    public void employeeWorkHoursTest(){
        assertEquals(56, employee.getWorkHours());
    }

    @Test
    public void employeeTotalWageTest(){
        assertEquals(176.4, employee.earnings());
        System.out.println(employee.toString());
    }
}
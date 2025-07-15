package employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourlyEmployeeTest {
    HourlyEmployee employee = new HourlyEmployee("Dapo", "Oluwatosin", "GN356", 56, 2.1);

    @Test
    public void employeeFirstNameTest(){
        employee.setFirstName("Emma");
        assertEquals("Emma", employee.getFirstName());
    }

    @Test
    public void employeeLastNameTest(){
        employee.setLastName("James");
        assertEquals("James", employee.getLastName());
    }

    @Test
    public void employeeSocialSecurityNumberTest(){
        employee.setSocialSecurityNumber("NT345");
        assertEquals("NT345", employee.getSocialSecurityNumber());
    }

    @Test
    public void employeeWorkHoursTest(){
        assertEquals(56, employee.getWorkHours());
    }

    @Test
    public void employeeTotalWageTest(){
        employee.earnings();
        assertEquals(176.4, employee.getEmployeeTotalWages());
        System.out.println(employee.toString());
    }


}
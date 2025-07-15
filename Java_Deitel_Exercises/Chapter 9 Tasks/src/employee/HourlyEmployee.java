package employee;

public class HourlyEmployee extends Employee{
    private int hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, int hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        if (hours < 0 || hours > 168){
            throw new IllegalArgumentException("Hours must be between 0 and 168");
        }

        this.hours = hours;
        this.wage = wage;
    }

    public int getWorkHours() {
        return hours;
    }
}

package employee;

public class HourlyEmployee extends Employee{
    private int hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, int hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        validateHours(hours);
        validateWage(wage);
    }

    private void validateHours(int hours){
        if (hours < 0 || hours > 168){
            throw new IllegalArgumentException("Hours must be between 0 and 168");
        }
        this.hours = hours;
    }

    private void validateWage(double wage){
        if (wage < 0) throw new IllegalArgumentException("Wage must be greater than 0");
        this.wage = wage;
    }

    public int getWorkHours() {
        return hours;
    }

    public void setEmployeeTotalWage() {
        this.wage = wage * (hours * 1.5);
    }

    public double getEmployeeTotalWages() {
        return wage;
    }

    @Override
    public String toString() {
        return String.format("%sWork Hours: %d %nWages: %.1f%n",super.toString(), getWorkHours(), getEmployeeTotalWages());
    }
}

package employee;

public class BasePlusCommissionCompensationModel extends CommissionCompensationModel{
    private double baseSalary;

    public BasePlusCommissionCompensationModel(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }

    public void validateBaseSalary(double baseSalary) {
        if (baseSalary <= 0) throw new InvalidAmountException("Salary must greater than or equal to 0");
    }

    public void setBaseSalary(double baseSalary) {
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getGrossSales() + (getCommissionRate() * baseSalary);
    }

    @Override
    public String toString() {
        return String.format("First Name: %s %nLast Name: %s %nGross Sales: %,.2f %nCommission Rate: %,.2f %nBase Salary: %,.2f %nWages: %,.2f%n",
                getFirstName(), getLastName(), getGrossSales(), getCommissionRate(), getBaseSalary(), earnings());
    }
}

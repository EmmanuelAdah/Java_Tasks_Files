package employee;

public class CommissionCompensationModel extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionCompensationModel(String firstName, String lastName, String socialSecurityNumber, double grossSales,double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        validateGrossSales(grossSales);
        validateCommissionRate(commissionRate);
    }

    private void validateGrossSales(double grossSales){
        if (grossSales < 0) throw new InvalidSalesAmountException("Invalid sales amount");
        this.grossSales = grossSales;
    }

    private void validateCommissionRate(double commissionRate){
        if (commissionRate < 0 || commissionRate >= 1.0) throw new InvalidCommissionRateException ("Commission must be between 0 and 0.9");
        this.commissionRate = commissionRate;
    }

    public double earnings(){
        return grossSales * commissionRate;
    }

    public String toString(){
        return String.format("First Name: %s %nLast Name: %s %nSocial Security Number: %s %nWages: %.2f%n", getFirstName(), getLastName(), getSocialSecurityNumber(), earnings());
    }
}

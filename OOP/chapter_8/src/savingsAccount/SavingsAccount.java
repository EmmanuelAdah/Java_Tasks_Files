package savingsAccount;

public class SavingsAccount {
    private double savingsBalance;
    private static double annualInterestRate;

    public double getBalance() {
        return this.savingsBalance;
    }

    public void deposit(double amount) {
        if  (amount <= 0) throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        savingsBalance = amount;
    }

    public static void modifyInterestRate(double annualRate) {
        annualInterestRate = annualRate;
    }

    public void calculateMonthlyInterest() {
        double PERCENTAGE = 100;
        double actualRate = annualInterestRate / PERCENTAGE;
        this.savingsBalance += (actualRate * savingsBalance) / 12;
    }
}

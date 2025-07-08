package bankAcount;

public class GtBank {
    private double balance;
    private String accountNumber;
    private String pin;


    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        } else { throw new InvalidAmountException("Invalid amount"); }
    }

    public double getBalance() {
        return balance;
    }
}

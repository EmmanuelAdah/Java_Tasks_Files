package bankAcount;

public class Account {
    private double balance;
    private int amount;
    private int accountNumber = 3311;
    private final String pin = "correct";

    public double getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        } else { throw new InvalidAmountException("Invalid amount"); }
    }

    public void withdraw(int amount) {
        if(amount < balance && amount > 0) {
            this.balance -= amount;
        } else { throw new InsufficientBalanceException("Insufficient Balance"); }
    }

    public String getPin() {
        return pin;
    }
}
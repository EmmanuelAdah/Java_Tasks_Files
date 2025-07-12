package bankAcount;

public class Account {
    private String name = "Adah";
    private double balance;
    private int amount;
    private final int accountNumber = 3311;
    private final int pin = 1234;

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

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }
}
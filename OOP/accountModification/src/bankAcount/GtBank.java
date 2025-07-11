package bankAcount;

public class GtBank {
    private String name = "Emma";
    private double balance;
    private int accountNumber = 1122;
    private int pin = 1234;

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        } else { throw new InvalidAmountException("Invalid amount"); }
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
        }  else { throw new InsufficientBalanceException("Insufficient balance"); }
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }
}
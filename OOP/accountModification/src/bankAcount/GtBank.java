package bankAcount;

public class GtBank {
    private double balance;
    private int accountNumber = 1122;
    private String pin;


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
}

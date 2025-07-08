package bankAcount;

public class Account {
    private int balance;
    private int amount;
    private final String pin = "correct";


    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) throw new InvalidAmountException("Amount must not be <= zero");
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (0 < amount && amount > balance) throw new InvalidAmountException("Amount must not be greater or less than balance");
        this.balance -= amount;
    }

    public String getPin() {
        return pin;
    }
}
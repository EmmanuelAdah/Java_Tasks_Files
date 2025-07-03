package bankAcount;

public class Account {
    private int balance;
    private int amount;
    private final String pin = "correct";

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) balance -= amount;
    }

    public String getPin() {
        return pin;
    }
}
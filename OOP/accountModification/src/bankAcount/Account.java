package bankAcount;

public class Account {
    private int balance;
    private int amount;
    private final String pin = "correct";


    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) this.balance += amount;
        throw new InvalidAmountException("Invalid amount");
    }

    public void withdraw(int amount) {
        if(amount < balance && amount > 0) this.balance -= amount;
        throw new InsufficientBalanceException("Insufficient Balance");
    }

    public String getPin() {
        return pin;
    }
}
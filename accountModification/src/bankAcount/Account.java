package bankAcount;

public class Account {
    private int balance;
    private int Amount;
    private String pin = "correct";

    public void Account (int balance, int amount, String pin) {
        balance = 0;
        Amount = amount;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if  (amount > 0) balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) balance -= amount;
    }

    public String getPin() {
        return pin;
    }


}

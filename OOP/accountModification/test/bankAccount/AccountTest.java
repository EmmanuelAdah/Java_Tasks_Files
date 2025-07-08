package bankAccount;

import bankAcount.Account;
import bankAcount.GtBank;
import bankAcount.InsufficientBalanceException;
import bankAcount.InvalidAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account = new Account();
    GtBank gtBank = new GtBank();

    @BeforeEach
    public void checkIfPinIsCorrect() {
        assertEquals("correct", account.getPin());
    }

    @Test
    public void checkForAccountDefaultBalance() {
        assertEquals(0, account.getBalance());
    }

    @Test
    public void makeDepositInAccountTest() {
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance());

        account.deposit(2_000);
        assertEquals(4_000, account.getBalance());
    }

    @Test
    public void checkForPinCorrect() {
        assertEquals("correct", account.getPin());
    }

    @Test
    public void checkForWithdrawalFromAccount() {
        account.deposit(5_000);
        account.withdraw(2_000);
        assertEquals(3_000, account.getBalance());
    }

    @Test
    public void checkForNegativeDepositAmount() {
        assertThrows(InvalidAmountException.class, () -> account.deposit(-2_000));
    }

    @Test
    public void makeGreaterWithdrawalAmountTest() {
        account.deposit(2_000);
        assertThrows(InsufficientBalanceException.class, () -> account.withdraw(3_000));
    }

    @Test
    public void makeDepositInGtBankTest() {
        gtBank.deposit(3_000);
        assertEquals(3_000, gtBank.getBalance());
    }
}
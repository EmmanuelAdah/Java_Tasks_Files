package bankAccount;

import bankAcount.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account account = new Account();

    @BeforeEach
    public void checkIfPinIsCorrect() {
        assertEquals("correct", account.getPin());
    }

    @Test
    public void checkForAccountDefaultBalance() {
        assertEquals(0, account.getBalance());
    }

    @Test
    public void checkForDepositInAccount() {
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance());

        account.deposit(2_000);
        assertEquals(4_000, account.getBalance());
    }

    @Test
    public void checkForNegativeDepositAmount() {
        account.deposit(-2_000);
        assertEquals(0, account.getBalance());

        account.deposit(-0);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void checkForWithdrawalFromAccount() {
        account.deposit(5_000);
        account.withdraw(2_000);
        assertEquals(3_000, account.getBalance());

        account.withdraw(4_000);
        assertEquals(3_000, account.getBalance());
    }

    @Test
    public void checkForPinCorrect() {
        assertEquals("correct", account.getPin());
    }


}
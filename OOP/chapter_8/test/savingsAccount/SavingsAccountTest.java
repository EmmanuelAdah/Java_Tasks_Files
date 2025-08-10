package savingsAccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SavingsAccountTest {
    SavingsAccount saver1 = new SavingsAccount();

    @Test
    public void defaultBalanceIsZeroTest(){
        assertEquals(0, saver1.getBalance());
    }

    @Test
    public void depositInSavingsAccountTest(){
        saver1.deposit(500);
        assertEquals(500, saver1.getBalance());
    }

    @Test
    public void negativeDepositInSavingsAccountTest(){
        assertThrows(IllegalArgumentException.class, () -> saver1.deposit(-500));
    }

    @Test
    public void calculatingMonthlyInterestTest(){
        saver1.deposit(10_000.54);
        SavingsAccount.modifyInterestRate(4.0);
        saver1.calculateMonthlyInterest();
        assertEquals("10033.88", String.format("%.2f",saver1.getBalance()));
    }
}

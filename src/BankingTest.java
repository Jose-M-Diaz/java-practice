package src;
import static org.junit.Assert.*;

import org.junit.Test;

public class BankingTest {
    @Test
    public void deposit() throws Exception {
            Banking account = new Banking("Jose", "Diaz", 1000.00, Banking.CHECKING);
            double balance = account.deposit(200.00, true);
            assertEquals(1200.00, balance, 0);
    }
    
    @Test
    public void withdraw() throws Exception {

    }

    @Test
    public void getBalance_deposit() throws Exception {
        Banking account = new Banking("Jose", "Diaz", 1000.00, Banking.CHECKING);
            account.deposit(200.00, true);
            assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() throws Exception {
        Banking account = new Banking("Jose", "Diaz", 1000.00, Banking.CHECKING);
            account.withdraw(200.00, true);
            assertEquals(800.00, account.getBalance(), 0);
    }

    @Test
    public void isChecking_true() {
        Banking account = new Banking("Jose", "Diaz", 1000.00, Banking.CHECKING);
        assertTrue( "The account is NOT a checking account", account.isChecking()); //will check if object or method is true or false
    }
}

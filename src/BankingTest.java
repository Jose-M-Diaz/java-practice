package src;
import static org.junit.Assert.*;

import org.junit.Test;

public class BankingTest {
    @Test
    public void deposit() throws Exception {
            Banking account = new Banking("Jose", "Diaz", 1000.00);
            double balance = account.deposit(200.00, true);
            assertEquals(1200.00, balance, 0);
    }
    
    @Test
    public void withdraw() throws Exception {

    }

    @Test
    public void getBalance_deposit() throws Exception {
        Banking account = new Banking("Jose", "Diaz", 1000.00);
            account.deposit(200.00, true);
            assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() throws Exception {
        Banking account = new Banking("Jose", "Diaz", 1000.00);
            account.withdraw(200.00, true);
            assertEquals(800.00, account.getBalance(), 0);
    }
}

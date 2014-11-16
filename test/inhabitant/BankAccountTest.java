package inhabitant;

import static org.junit.Assert.*;
import inhabitant.BankAccount;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testCredit() {
		BankAccount account= new BankAccount((double) 5000);
		account.credit((double) 1000);
		assertEquals(6000, account.getAccountValue(), 100);
	}

	@Test
	public void testWithdrawal() {
		BankAccount account= new BankAccount((double) 5000);
		account.debit((double) 1000);
		assertEquals(4000, account.getAccountValue(), 100);
	}

}

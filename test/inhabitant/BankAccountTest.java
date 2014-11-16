package inhabitant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testCredit() {
		BankAccount account= new BankAccount((double) 5000);
		account.credit((double) 1000);
		assertEquals(6000, account.getAccountValue(), 100);
	}

	@Test
	public void testdebit() throws DebitException {
		BankAccount account= new BankAccount((double) 5000);
		account.debit((double) 1000);
		assertEquals(4000, account.getAccountValue(), 100);
	}
	
	@Test(expected=DebitException.class)
	public void testdebitException() throws DebitException {
		BankAccount account= new BankAccount((double) 5000);
		account.debit((double) 6000);
	}

}
 
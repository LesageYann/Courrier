package inhabitant;

import static org.junit.Assert.*;
import letter.Letter;
import letter.PromissoryNote;

import org.junit.Test;

public class InhabitantTest {

	@Test
	public void testGetAccount() {
		Inhabitant inh1 = new Inhabitant("Inh-1", null);
		inh1.getAccount().credit((double) 1000);
		assertEquals(6000, inh1.getAccount().getAccountValue(), 100);
	}

	@Test
	public void testReceiptLetter(){
		Inhabitant inh1 = new Inhabitant("Inh-1",null); 
		Inhabitant inh2 = new Inhabitant("Inh-2",null); 
		Letter<Double> l1 =new PromissoryNote( inh2,
												inh1,(double) 100);
		inh2.recieveLetter(l1);
		assertEquals(inh2.getAccount().getAccountValue(), 5099, 100);
		assertEquals(inh1.getAccount().getAccountValue(), 4900, 100);
	}
}

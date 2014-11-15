package inhabitant;

import static org.junit.Assert.*;

import org.junit.Test;

public class InhabitantTest {

	@Test
	public void testGetAccount() {
		Inhabitant inh1 = new Inhabitant("Inh-1");
		inh1.getAccount().credit((double) 1000);
		assertEquals(6000, inh1.getAccount().getAccountValue(), 100);
	}

}

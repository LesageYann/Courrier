package letter;

import static org.junit.Assert.assertEquals;
import inhabitant.DebitException;
import inhabitant.Inhabitant;

import org.junit.Test;

public class SimpleLetterTest {


	@Test
	public void testAction() throws DebitException {
		Inhabitant inh1 = new Inhabitant("Inh-1",null); 
		Inhabitant inh2 = new Inhabitant("Inh-2",null); 
		Letter<String> l1 =new SimpleLetter(inh2,
									inh1, "I am an error");
	}

	@Test
	public void testCost() throws DebitException {
		Inhabitant inh1 = new Inhabitant("Inh-1",null); 
		Inhabitant inh2 = new Inhabitant("Inh-2",null); 
		Letter<String> l1 =new SimpleLetter(inh2,
									inh1, "I am an error");
		assertEquals(1, l1.cost(),100);
	}

	@Test
	public void testGetDesciption() throws DebitException {
		Inhabitant inh1 = new Inhabitant("Inh-1",null); 
		Inhabitant inh2 = new Inhabitant("Inh-2",null); 
		Letter<String> l1 =new SimpleLetter(inh2,
									inh1, "I am an error");
		assertEquals(l1.getDescription(), "simple letter whose content is a text content (I am an error)");
	}

	@Test(expected=DebitException.class)
	public void testdebitException() throws DebitException {
		Inhabitant inh1 = new Inhabitant("Inh-1",null); 
		Inhabitant inh2 = new Inhabitant("Inh-2",null); 
		inh1.getAccount().debit((double) 4999); 
		Letter<String> l1 =new SimpleLetter(inh2,
									inh1, "I am an error");
		Letter<String> l2 =new SimpleLetter(inh2,
				inh1, new String("I am an error"));
	}
}

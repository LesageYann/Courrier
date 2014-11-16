package letter;

import static org.junit.Assert.assertEquals;
import inhabitant.DebitException;
import inhabitant.Inhabitant;

import org.junit.Test;

public class RegisteredLetterTest {

	@Test
	public void receiverSendsAcknowlegment() throws Exception {
		Inhabitant sender = new Inhabitant("Inh-1",null);
		Inhabitant receiver = new Inhabitant("Inh-2",null);
		Letter<Letter<?>> l1 = new RegisteredLetter(receiver, sender, new SimpleLetter(receiver, sender,"I am an error"));
		assertEquals(5000, receiver.getAccount().getAccountValue(), 100);
		l1.action();
		assertEquals(4999, receiver.getAccount().getAccountValue(), 100);
	}

	@Test
	public void testCost() throws DebitException {
		Inhabitant sender = new Inhabitant("Inh-1",null);
		Inhabitant receiver = new Inhabitant("Inh-2",null);
		Letter<Letter<?>> l1 = new RegisteredLetter(receiver, sender, new SimpleLetter(receiver, sender,"I am an error"));
		assertEquals(16, l1.cost(),100);
		assertEquals(sender.getAccount().getAccountValue(), 4984,100);
	}

	@Test
	public void testGetDesciption() throws DebitException {
		Inhabitant sender = new Inhabitant("Inh-1",null);
		Inhabitant receiver = new Inhabitant("Inh-2",null);
		Letter<Letter<?>> l1 = new RegisteredLetter(receiver, sender, new SimpleLetter(receiver, sender,"I am an error"));
		assertEquals(l1.getDescription(), "simple letter whose content is a text content (I am an error)");
	}
	
	@Test(expected=DebitException.class)
	public void testdebitException() throws DebitException {
		Inhabitant sender = new Inhabitant("Inh-1",null);
		Inhabitant receiver = new Inhabitant("Inh-2",null);
		sender.getAccount().debit((double) 4999); 
		Letter<Letter<?>> l1 = new RegisteredLetter(receiver, sender, new SimpleLetter(receiver, sender,"I am an error"));
	}
}

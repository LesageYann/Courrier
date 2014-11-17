package letter;

import static org.junit.Assert.assertEquals;
import inhabitant.City;
import inhabitant.DebitException;
import inhabitant.Inhabitant;

import org.junit.Test;

public class RegisteredLetterTest {

	@Test
	public void testAction() {
		City city = new City("mycity");
		Inhabitant sender = new Inhabitant("Inh-1",null);
		Inhabitant receiver = new Inhabitant("Inh-2",city);
		Letter<Letter<?>> l1 = new RegisteredLetter(receiver, sender, new SimpleLetter(receiver, sender,"I am an error"));
		assertEquals(5000, receiver.getAccount().getAccountValue(), 100);
		l1.action();
		assertEquals(4999, receiver.getAccount().getAccountValue(), 100);
	}

	@Test
	public void testCost(){
		Inhabitant sender = new Inhabitant("Inh-1",null);
		Inhabitant receiver = new Inhabitant("Inh-2",null);
		Letter<Letter<?>> l1 = new RegisteredLetter(receiver, sender, new SimpleLetter(receiver, sender,"I am an error"));
		assertEquals(16, l1.cost(),100);
	}

	@Test
	public void testGetDesciption(){
		Inhabitant sender = new Inhabitant("Inh-1",null);
		Inhabitant receiver = new Inhabitant("Inh-2",null);
		Letter<Letter<?>> l1 = new RegisteredLetter(receiver, sender, new SimpleLetter(receiver, sender,"I am an error"));
		assertEquals(l1.getDescription(), "simpleLetter content : 'I am an error' as a registeredLetter.");
	}
}

package letter;

import static org.junit.Assert.assertEquals;
import inhabitant.Inhabitant;

import org.junit.Test;

import contents.CLetter;
import contents.CString;

public class RegisteredLetterTest {

	@Test
	public void receiverSendsAcknowlegment() throws Exception {
		Inhabitant sender = new Inhabitant("Inh-1");
		Inhabitant receiver = new Inhabitant("Inh-2");
		Letter l1 = new RegisteredLetter(new CString("I am an error"), sender, receiver);
		assertEquals(5000, receiver.getAccount().getAccountValue(), 100);
		l1.action();
		assertEquals(4999, receiver.getAccount().getAccountValue(), 100);
	}

}

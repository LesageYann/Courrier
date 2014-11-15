package letter;

import static org.junit.Assert.*;
import inhabitant.Inhabitant;

import org.junit.Test;

import contents.CString;

public class SimpleLetterTest {

	@Test
	public void testAction() {
		Inhabitant inh1 = new Inhabitant("Inh-1"); 
		Inhabitant inh2 = new Inhabitant("Inh-2"); 
		Letter<CString> l1 =new SimpleLetter(new CString("I am an error"),
									inh1, inh2);
		assertTrue(l1.action());
	}

	@Test
	public void testCost() {
		Inhabitant inh1 = new Inhabitant("Inh-1"); 
		Inhabitant inh2 = new Inhabitant("Inh-2"); 
		Letter<CString> l1 =new SimpleLetter(new CString("I am an error"),
									inh1, inh2);
		assertEquals(1, l1.cost(),100);
	}

	@Test
	public void testGetDesciption() {
		Inhabitant inh1 = new Inhabitant("Inh-1"); 
		Inhabitant inh2 = new Inhabitant("Inh-2"); 
		Letter<CString> l1 =new SimpleLetter(new CString("I am an error"),
									inh1, inh2);
		assertEquals(l1.getDesciption(), "simple letter whose content is a text content (I am an error)");
	}

}

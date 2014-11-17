package letter;

import static org.junit.Assert.assertEquals;
import inhabitant.Inhabitant;

import org.junit.Test;

public class SimpleLetterTest {


	//no for action, because action do nothing

	@Test
	public void testCost(){
		Inhabitant inh1 = new Inhabitant("Inh-1",null); 
		Inhabitant inh2 = new Inhabitant("Inh-2",null); 
		Letter<String> l1 =new SimpleLetter(inh2,
									inh1, "I am an error");
		assertEquals(1, l1.cost(),100);
	}

	@Test
	public void testGetDesciption() {
		Inhabitant inh1 = new Inhabitant("Inh-1",null); 
		Inhabitant inh2 = new Inhabitant("Inh-2",null); 
		Letter<String> l1 =new SimpleLetter(inh2,
									inh1, "I am an error");
		assertEquals(l1.getDescription(), "simpleLetter content : 'I am an error'");
	}

}

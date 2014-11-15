package letter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import inhabitant.Inhabitant;

import org.junit.Test;

import contents.CDouble;

public class PromissaryNoteTest {

	@Test
	public void testAction() {
		Inhabitant inh1 = new Inhabitant("Inh-1"); 
		Inhabitant inh2 = new Inhabitant("Inh-2"); 
		Letter<CDouble> l1 =new PromissaryNote(new CDouble((double) 100),
												inh1, inh2);
		assertTrue(l1.action());
		assertEquals(inh2.getAccount().getAccountValue(), 5099, 100);//-1 for the thanks +100
		assertEquals(inh1.getAccount().getAccountValue(), 4898, 100);//-2 for the cost -100
	}

	@Test
	public void testCost() {
		Inhabitant inh1 = new Inhabitant("Inh-1"); 
		Inhabitant inh2 = new Inhabitant("Inh-2"); 
		Letter<CDouble> l1 =new PromissaryNote(new CDouble((double) 100),
												inh1, inh2);
		assertEquals(2, l1.cost(),100);
	}

	@Test
	public void testGetDesciption() {
		Inhabitant inh1 = new Inhabitant("Inh-1"); 
		Inhabitant inh2 = new Inhabitant("Inh-2"); 
		Letter<CDouble> l1 =new PromissaryNote(new CDouble((double) 50),
												inh1, inh2);
		assertEquals(l1.getDesciption(), "a promissory note letter whose content is a money content (100)");
	}

}

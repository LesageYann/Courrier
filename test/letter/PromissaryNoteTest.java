package letter;

import static org.junit.Assert.assertEquals;
import inhabitant.DebitException;
import inhabitant.Inhabitant;

import org.junit.Test;

public class PromissaryNoteTest {

	@Test
	public void testAction(){
		Inhabitant inh1 = new Inhabitant("Inh-1",null); 
		Inhabitant inh2 = new Inhabitant("Inh-2",null); 
		Letter<Double> l1 =new PromissoryNote( inh2,
												inh1,(double) 100);
		l1.action();
		assertEquals(inh2.getAccount().getAccountValue(), 5099, 100);//-1 for the thanks +100
		assertEquals(inh1.getAccount().getAccountValue(), 4900, 100);// -100, no cost for send because no city
	}

	@Test
	public void testCost(){
		Inhabitant inh1 = new Inhabitant("Inh-1",null); 
		Inhabitant inh2 = new Inhabitant("Inh-2",null); 
		Letter<Double> l1 =new PromissoryNote( inh2,
												inh1,(double) 100);
		assertEquals(2, l1.cost(),100);
	}

	@Test
	public void testGetDesciption(){
		Inhabitant inh1 = new Inhabitant("Inh-1",null); 
		Inhabitant inh2 = new Inhabitant("Inh-2",null); 
		Letter<Double> l1 =new PromissoryNote( inh2,
												inh1,(double) 100);
		assertEquals(l1.getDescription(), "PromissoryNote content : 100.0");
	}

}

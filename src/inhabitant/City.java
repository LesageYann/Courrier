package inhabitant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import letter.Letter;

public class City {

	private String name;
	private List<Letter<?>> postBox;
	private Set<Inhabitant> inhabitants;
	
	/**
	 * constructor
	 * @param name
	 */
	public City(String name){
		this.name = name;
		this.postBox=new ArrayList<Letter<?>>();
		this.inhabitants = new HashSet<Inhabitant>();
	}
	
	/**
	 * Send a letter. The letter the letter will be received at the next call of distributedLetter()
	 * @param letter
	 * @throws DebitException 
	 */
	public void sendLetter(Letter<?> letter) throws DebitException{
		letter.getSender().getAccount().debit(letter.cost());
		this.postBox.add(letter);
		System.out.println("-> " +letter.getSender()+" send "+ letter.getDescription() +" to "+ letter.getRecipient());
		System.out.println(letter.getSender() +" has "+ letter.getSender().getAccount().getAccountValue()
				+" on this account after debit of "+ letter.cost());
	}
	
	/**
	 * distributed all Letters;
	 */
	public void distributedLetter(){
		/*a tempory reference to not send the acknowledge receipt the same day*/
		List<Letter<?>> postBoxTemp = postBox;
		this.postBox=new ArrayList<Letter<?>>();
		while(!postBoxTemp.isEmpty()){
			Letter<?> letter=postBoxTemp.remove(0);
			letter.getRecipient().recieveLetter(letter);
		}
	}

	/**
	 * Add a new inhabitant in the city
	 * @param inhabitant
	 */
	public void addInhabitant(Inhabitant inhabitant) {
		this.inhabitants.add(inhabitant);
	}

	public Inhabitant getInhabitant(int number) {
		number = number % this.inhabitants.size();
		Iterator<Inhabitant> ite = this.inhabitants.iterator();
		for (int i=1; i<number;i++){
			ite.next();
		}
		return ite.next();
	}


	public String toString(){
		return this.name;
	}
}

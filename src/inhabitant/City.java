package inhabitant;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import letter.Letter;

public class City {

	private String nom;
	private List<Letter<?>> postBox;
	private Set<Inhabitant> inhabitants;
	
	/**
	 * constructor
	 * @param nom
	 */
	City(String nom){
		this.nom = nom;
		this.postBox=new ArrayList<Letter<?>>();
	}
	
	/**
	 * Send a letter. The letter the letter will be received at the next call of distributedLetter()
	 * @param letter
	 */
	public void sendLetter(Letter<?> letter){
		this.postBox.add(letter);
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


}

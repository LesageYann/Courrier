package inhabitant;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import letter.Letter;

public class City {

	private String nom;
	private List<Letter<?>> postBox;
	private Set<Inhabitant> inhabitants;
	
	City(String nom){
		this.nom = nom;
		this.postBox=new ArrayList<Letter<?>>();
	}
	
	public void sendLetter(Letter<?> letter){
		this.postBox.add(letter);
	}
	
	public void distributedLetter(){
		while(!postBox.isEmpty()){
			Letter<?> letter=postBox.remove(0);
			letter.getRecipient().recieveLetter(letter);
		}
	}

	public void addInhabitant(Inhabitant inhabitant) {
		this.inhabitants.add(inhabitant);
	}


}

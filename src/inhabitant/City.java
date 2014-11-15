package inhabitant;

import java.util.Set;

import letter.Letter;
import contents.Contents;

public class City {

	private String nom;
	private Set<Letter<Contents>> postBox;
	private Set<Inhabitant> inhabitants;
	
	City(String nom){
		this.nom = nom;
	}
	
	public void sendLetter(Letter letter){
		
	}
	
	public void distributedLetter(){
		
	}

	public Set<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	public void setNewInhabitant(Inhabitant inhabitant) {
		this.inhabitants.add(inhabitant);
	}


}

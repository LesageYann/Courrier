package inhabitant;

import letter.Letter;
import contents.Contents;

public class Inhabitant {

	private String name;
	private BankAccount account;

	/**
	 * create an inhabitant
	 * @param name a string 
	 */
	public Inhabitant(String name) {
		this.name=name;
		this.account = new BankAccount((double) 5000);
	}

	/**
	 *  get inhabitant's name
	 * @return a string for the name
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * return the inhabitant's BankAccount
	 * @return BankAccount
	 */
	public BankAccount getAccount(){
		return this.account;
	}
	
	
	public boolean receiveLetter(Letter<Contents> letter){
		
		return true;
	}
}

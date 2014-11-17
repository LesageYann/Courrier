package inhabitant;

import letter.Letter;

public class Inhabitant {

	private static final double DEFAULT_ACCOUNT_STARTING_MONEY = 5000;
	protected String name;
	protected BankAccount account;
	protected City city;
	/**
	 * create an inhabitant
	 * @param the name of the Inhabitant
	 * @param the city where he's living
	 */
	public Inhabitant(String name,City city) {
		this.name=name;
		this.account = new BankAccount(DEFAULT_ACCOUNT_STARTING_MONEY);
		this.city=city;
	}

	/**
	 *  get inhabitant's name
	 * @return the name of the inhabitant
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
	
	/**
	 * Receive a letter and apply these effects.
	 * @param letter
	 */
	public void recieveLetter(Letter<?> letter) {
		System.out.println("<- " +this.name+ " receives a" + letter.getDescription()+ " from "+ letter.getSender());
		letter.action();
	}

	public City getCity() {
		return this.city;
		
	}
	
	public String toString(){
		return this.name;
	}
}

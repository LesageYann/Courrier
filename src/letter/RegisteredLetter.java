package letter;

import inhabitant.DebitException;
import inhabitant.Inhabitant;

public class RegisteredLetter extends NotUrgentLetter<Letter<?>> {
	protected int additionalCost = 15;

	/**
	 * constructor
	 * @param recipient
	 * @param sender
	 * @param letter
	 * @throws DebitException 
	 */
	public RegisteredLetter(Inhabitant recipient, Inhabitant sender, Letter<?> letter){
		super(recipient, sender, letter);
	}

	/**
	 * Launch the letter's action and  send an acknowledge reception
	 */
	public void action() {
		this.content.action();
		try {
			this.recipient.getCity().sendLetter(new SimpleLetter
					(this.sender,this.recipient,"I've recieved you're letter, it was kind! <3"));
		} catch (DebitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return Double cost of letter
	 */
	public double cost() {
		return this.content.cost() + this.additionalCost;
	}

	/**
	 * 
	 * @see letter.Letter#getDescription()
	 */
	public String getDescription() {
		return content.getDescription()+" as a registeredLetter.";
	}
}

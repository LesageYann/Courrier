package letter;

import inhabitant.DebitException;
import inhabitant.Inhabitant;

public class UrgentLetter extends Letter <NotUrgentLetter<?>>{
	private final double multiplier=2;
	
	
	public UrgentLetter(Inhabitant recipient,Inhabitant sender,NotUrgentLetter<?> notUrgentLetter){
		super(recipient, sender, notUrgentLetter);
	}
	
	
	/**
	 * Launch the letter's action
	 */
	public void action() {
		content.action();
	}
	
	/**
	 * 
	 * @return Double cost of letter
	 */
	public double cost() {
		return content.cost()*multiplier;
	}
	
	/**
	 * 
	 * @return description of the letter and these content
	 */
	public String getDescription() {
		return this.content.getDescription()+" as an UrgentLetter";
	}
}

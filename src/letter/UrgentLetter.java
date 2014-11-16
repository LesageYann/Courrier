package letter;

import inhabitant.Inhabitant;

public class UrgentLetter extends Letter <NotUrgentLetter<?>>{
	private final double multiplier=2;
	public UrgentLetter(Inhabitant recipient,Inhabitant sender,NotUrgentLetter<?> notUrgentLetter) {
		super(recipient, sender, notUrgentLetter);
	}
	public void action() {
		content.action();
	}
	public double cost() {
		return content.cost()*multiplier;
	}
	public String getDescription() {
		return this.content.getDescription();
	}
}

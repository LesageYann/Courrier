package letter;

import inhabitant.Inhabitant;

public class RegisteredLetter extends NotUrgentLetter<Letter<?>> {
	protected int additionalCost = 15;

	public RegisteredLetter(Inhabitant recipient, Inhabitant sender, Letter<?> letter) {
		super(recipient, sender, letter);
	}

	public void action() {
		this.content.action();
		this.recipient.getCity().sendLetter(new SimpleLetter(this.sender,this.recipient,"I've recieved you're letter, it was kind! <3"));
	}

	public double cost() {
		return this.content.cost() + this.additionalCost;
	}

	public String getDescription() {
		return content.getDescription();
	}
}

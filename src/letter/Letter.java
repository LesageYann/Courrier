package letter;

import inhabitant.Inhabitant;

public abstract class Letter<Content> {
	protected int cost = 1;
	protected Inhabitant recipient;
	protected Inhabitant sender;
	protected Content content;

	public Letter(Inhabitant recipient,Inhabitant sender,Content content) {
		this.recipient = recipient;
		this.sender=sender;
		this.content=content;
	}

	public abstract void action();
	public double cost() {
		return this.cost;
	}

	public abstract String getDescription();
	public Inhabitant getRecipient(){
		return this.recipient;
	}
}

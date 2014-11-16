package letter;

import inhabitant.DebitException;
import inhabitant.Inhabitant;

public abstract class Letter<Content> {
	protected int cost = 1;
	protected Inhabitant recipient;
	protected Inhabitant sender;
	protected Content content;

	/**
	 * Constructor
	 * @param recipient a inhabitant 
	 * @param sender a inhabitant
	 * @param content a Content
	 * @throws DebitException
	 */
	public Letter(Inhabitant recipient,Inhabitant sender,Content content) throws DebitException{
		if(sender.getAccount().getAccountValue()<this.cost()){
			throw new DebitException();
		}
		this.recipient = recipient;
		this.sender=sender;
		this.content=content;
		sender.getAccount().debit(this.cost());
	}
	
	/**
	 * use to create a Letter with a particular cost.
	 * @param recipient
	 * @param sender
	 * @param content
	 * @param costParam
	 * @throws DebitException
	 */
	public Letter(Inhabitant recipient,Inhabitant sender,Content content, Double costParam) throws DebitException{
		if(sender.getAccount().getAccountValue()<this.cost()){
			throw new DebitException();
		}
		this.recipient = recipient;
		this.sender=sender;
		this.content=content;
		sender.getAccount().debit(this.cost());
	}

	/**
	 * action of Letter Like sens an acknowledge receipt
	 */
	public abstract void action();
	
	/**
	 * 
	 * @return Double cost of letter
	 */
	public double cost() {
		return this.cost;
	}

	/**
	 * 
	 * @return description of the letter and these content
	 */
	public abstract String getDescription();
	
	/**
	 * 
	 * @return inhabitant : recipient of letter
	 */
	public Inhabitant getRecipient(){
		return this.recipient;
	}
}

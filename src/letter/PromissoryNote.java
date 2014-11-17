package letter;

import inhabitant.DebitException;
import inhabitant.Inhabitant;

public class PromissoryNote extends NotUrgentLetter<Double> {
	protected final double multiplier=0.01;

	/**
	 * Constructor
	 * @param recipient a inhabitant 
	 * @param sender a inhabitant
	 * @param Double money send by letter
	 * @throws DebitException 
	 */
	public PromissoryNote(Inhabitant recipient,Inhabitant sender,double money){
		super(recipient, sender, money);
		try {
			sender.getAccount().debit(money);
		} catch (Exception e) {
			System.out.println(sender +" can't send this sum. But send"+ sender.getAccount().getAccountValue());
			this.content =sender.getAccount().getAccountValue();
			try {
				sender.getAccount().debit(this.content);
			} catch (DebitException e1) {
				System.out.println(sender +" can't send this sum. Error");
			}
		}
	}
	
	/**
	 * credit the recipient's account of money, debit the sender's account of the same value and send a thank you letter
	 * @throws DebitException 
	 */
	public void action(){
		this.recipient.getAccount().credit(this.content);
		try {
			this.recipient.getCity().sendLetter(new SimpleLetter
					(this.sender,this.recipient,"Thanks for that dude"));
		} catch (Exception e) {
			System.out.println(this.recipient.getName()+" can't send thank tou letter." );
		}
		
	}
	
	public double cost(){
		return this.cost+ (this.content*multiplier);
	}
	
	/**
	 * 
	 * @return description of the letter and these content
	 */
	public String getDescription() {
		return "PromissoryNote content : "+content;
	}
}

package letter;

import inhabitant.Inhabitant;

public class PromissoryNote extends NotUrgentLetter<Double> {
	protected final double multiplier=0.01;

	public PromissoryNote(Inhabitant recipient,Inhabitant sender,double money) {
		super(recipient, sender, money);
	}
	public void action(){
		this.sender.getAccount().debit(this.content);
		this.recipient.getAccount().credit(this.content);
		this.recipient.getCity().sendLetter(new SimpleLetter(this.sender,this.recipient,"Thanks for that dude") {
		});
	}
	public double cost(){
		return this.cost+(content*multiplier);
	}
	public String getDescription() {
		return sender.getName()+"send : "+content+" to "+recipient.getName();
	}
}

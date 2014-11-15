package letter;

import contents.Contents;
import inhabitant.Inhabitant;

public abstract class Letter<C extends Contents> {
	
	protected C contents;
	protected Inhabitant sender;
	protected Inhabitant recipient;
	
	public Letter(C contents, Inhabitant sender, Inhabitant recipient){
		this.contents =contents;
		this.sender = sender;
		this.recipient = recipient;
	}

	public abstract boolean action();
	
	public abstract double cost();

	public String getDesciption() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

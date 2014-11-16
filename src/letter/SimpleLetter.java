package letter;

import inhabitant.Inhabitant;

public class SimpleLetter extends Letter<String> {

	public SimpleLetter(Inhabitant recipient,Inhabitant sender,String content) {
		super(recipient, sender, content);
	}

	@Override
	public void action() {
		//do nothing
	}

	@Override
	public String getDescription() {
		return this.content;
	}

}

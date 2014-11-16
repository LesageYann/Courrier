package letter;

import inhabitant.Inhabitant;

public abstract class NotUrgentLetter<Content> extends Letter <Content>{

	public NotUrgentLetter(Inhabitant recipient,Inhabitant sender,Content content) {
		super(recipient, sender, content);
	}
}

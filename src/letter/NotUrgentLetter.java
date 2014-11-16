package letter;

import inhabitant.DebitException;
import inhabitant.Inhabitant;

public abstract class NotUrgentLetter<Content> extends Letter <Content>{

	public NotUrgentLetter(Inhabitant recipient,Inhabitant sender,Content content) throws DebitException {
		super(recipient, sender, content);
	}
}

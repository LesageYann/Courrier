package letter;

import inhabitant.DebitException;
import inhabitant.Inhabitant;

public class SimpleLetter extends NotUrgentLetter<String> {

	/**
	 * constructor
	 * @param recipient
	 * @param sender
	 * @param content String a message
	 */
	public SimpleLetter(Inhabitant recipient,Inhabitant sender,String content){
		super(recipient, sender, content);
	}

	/**
	 * do nothing
	 */
	public void action() {
		//do nothing
	}

	/**
	 * 
	 * @return description of the letter and these content
	 */
	public String getDescription() {
		return "simpleLetter content : '"+content+"'";
	}

}

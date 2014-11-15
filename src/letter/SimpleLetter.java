package letter;

import inhabitant.Inhabitant;
import contents.CString;

public class SimpleLetter extends Letter<CString> {

	public SimpleLetter(CString contents, Inhabitant sender, Inhabitant recipient) {
		super(contents, sender, recipient);
	}

	@Override
	public boolean action() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double cost() {
		return 1;
	}

}

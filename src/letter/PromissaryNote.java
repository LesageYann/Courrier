package letter;

import inhabitant.Inhabitant;
import contents.CDouble;

public class PromissaryNote extends Letter<CDouble> {
	
	public PromissaryNote(CDouble contents, Inhabitant sender, Inhabitant recipient) {
		super(contents, sender, recipient);
	}

	@Override
	public boolean action() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double cost() {
		// 1+1%
		return 0;
	}
	
	

}

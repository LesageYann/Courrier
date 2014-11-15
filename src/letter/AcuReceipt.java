package letter;

import inhabitant.Inhabitant;
import contents.CReceipt;

public class AcuReceipt extends Letter<CReceipt> {

	
	public AcuReceipt(CReceipt contents, Inhabitant sender, Inhabitant recipient) {
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

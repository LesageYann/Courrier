package letter;

import inhabitant.Inhabitant;
import contents.CLetter;

public class RegisteredLetter extends Letter<CLetter> {

	public RegisteredLetter(CLetter contents, Inhabitant sender, Inhabitant recipient) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean action() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double cost() {
		return this.contents.cost()*2;
	}

}

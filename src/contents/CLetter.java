package contents;

import letter.Letter;

public class CLetter implements Contents {
	
	private Letter letter;

	CLetter(Letter<Contents> letter){
		this.letter = letter ;
	}

	public Letter getLetter(){
		return this.letter;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.letter.getDesciption();
	}

	public int cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}

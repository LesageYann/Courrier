package contents;

public class CString implements Contents {

	private String message;
	
	public CString(String message){
		this.message = message;
	}
	@Override
	public String getDescription() {
		return this.message;
	}

}

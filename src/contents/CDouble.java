package contents;

public class CDouble implements Contents {

	private Double message;
	
	public CDouble(Double message){
		this.message = message;
	}
	
	public String getDescription() {
		return String.valueOf(this.message);
	}
}

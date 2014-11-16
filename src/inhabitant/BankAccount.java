package inhabitant;

public class BankAccount {

	protected Double account;

	public BankAccount(Double account) {
		this.account=account;
	}

	public void credit(Double creditValue){
		this.account+=creditValue;
	}
	
	public void debit(Double withdrawalValue){
		this.account-=withdrawalValue;
	}
}

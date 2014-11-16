package inhabitant;

public class BankAccount {

	protected Double account;

	/**
	 * Constructor
	 * @param account Value initial of the account
	 */
	public BankAccount(Double account) {
		this.account=account;
	}

	/**
	 * Credit the value of debitValue to the account
	 * @param creditValue
	 */
	public void credit(Double creditValue){
		this.account+=creditValue;
	}
	
	/**
	 * Debit the value of debitValue to the account
	 * @param debitValue
	 */
	public void debit(Double debitValue) throws DebitException{
		if(this.account < debitValue){
			throw new DebitException();
		}
		this.account-=debitValue;
	}

	/**
	 * get value of account
	 * @return Double value of account
	 */
	public Double getAccountValue() {
		return this.account;
	}
}

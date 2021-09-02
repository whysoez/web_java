package bkap;

public class PersonAccount extends Account{
	private double fee;
	
	public PersonAccount() {
		super();
	}
	
	public PersonAccount(String accountNo, String customerName, double balance, double fee) {
		super(accountNo, customerName, balance);
		this.fee = fee;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public void withDraw(double draw) {
		balance = balance - draw - fee;
	}
	
	public void deposite(double deposite) {
		balance = balance + deposite - fee;
	}
	
	@Override
	public String toString() {
		return "PersonAccount [fee=" + fee + ", accountNo=" + accountNo + ", customerName=" + customerName
				+ ", balance=" + balance + "]";
	}
	
	
}

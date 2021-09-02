package bkap;

public class Account {
	protected String accountNo;
	protected String customerName;
	protected double balance;
	
	public Account() {
		super();
	}
	
	public Account(String accountNo, String customerName, double balance) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.balance = balance;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", customerName=" + customerName + ", balance=" + balance + "]";
	}
	
	
}

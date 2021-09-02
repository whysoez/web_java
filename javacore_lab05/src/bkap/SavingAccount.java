package bkap;

public class SavingAccount extends Account {
	private double rate;
	private int period;

	public SavingAccount() {
		super();
	}

	public SavingAccount(String accountNo, String customerName, double balance, double rate, int period) {
		super(accountNo, customerName, balance);
		this.rate = rate;
		this.period = period;
	}

	public double getRate() {
		switch (period) {
		case 1:
			rate = 5;
			break;
		case 3:
			rate = 5.5;
			break;
		case 6:
			rate = 6;
			break;
		case 12:
			rate = 7;
			break;
		case 24:
			rate = 7.5;
			break;
		case 36:
			rate = 8;
			break;

		default:
			rate = 1.8;
			break;
		}
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public void checkInterest(int period) {
		this.period = period;
		System.out.printf("so tien lai duoc huong sau %d thang la: %f", this.period,
				getRate() * this.period * balance / 100);
		balance = balance + this.period * getRate() * balance / 100;
		System.out.println(" ");
	}

	@Override
	public String toString() {
		return "SavingAccount [rate=" + rate + ", period=" + period + ", accountNo=" + accountNo + ", customerName="
				+ customerName + ", balance=" + balance + "]";
	}
}

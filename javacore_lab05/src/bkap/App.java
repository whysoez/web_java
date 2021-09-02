package bkap;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		double fee;
		String accountNo;
		String customerName;
		double balance;
		double rate;
		int period;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("accountNo: ");
		accountNo = sc.nextLine();
		System.out.println("customerName: ");
		customerName = sc.nextLine();
		System.out.println("balance: ");
		balance = Double.parseDouble(sc.nextLine());
		System.out.println("fee: ");
		fee = Double.parseDouble(sc.nextLine());
		System.out.println("rate: ");
		rate = Double.parseDouble(sc.nextLine());
		System.out.println("period: ");
		period = Integer.parseInt(sc.nextLine());
		Account ac = new Account(accountNo, customerName, balance);
		PersonAccount pa = new PersonAccount(accountNo,customerName,balance,fee);
		SavingAccount sa = new SavingAccount(accountNo,customerName,balance,rate, period);
		
//		pa.setAccountNo(accountNo);
//		pa.setBalance(balance);
//		pa.setCustomerName(customerName);
//		
//		sa.setAccountNo(accountNo);
//		sa.setBalance(balance);
//		sa.setCustomerName(customerName);
		
		System.out.println(ac.toString());
		System.out.println(pa.toString());

		System.out.println("so tien muon rut la: ");
		double draw = Double.parseDouble(sc.nextLine());
		pa.withDraw(draw);
		System.out.println("so tien muon gui la: ");
		double deposite = Double.parseDouble(sc.nextLine());
		pa.deposite(deposite);
		
		System.out.println(pa.toString());
		sa.checkInterest(period);
		System.out.println(sa.toString());
	}
	
}
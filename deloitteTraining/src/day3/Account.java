package day3;

public class Account {
	private int accountNo;
	private double balance;
	private String accountName;
	public Account(int acoountNo,double balance, String accountName) {
		this.accountNo = acoountNo;
		this.balance = balance;
		this.accountName = accountName;
	}
	
	public int getAccountno() {
		return accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public String getCustomerName() {
		return accountName;
	}
	
	public void setAccountno(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCustomerName(String accountName) {
		this.accountName = accountName;
	}	
}

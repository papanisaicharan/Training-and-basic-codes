package day1;

public class Task3ass {
	private int acno;
	private String custname;
	private double balance;
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public Task3ass(int acno, String custname, int balance) {
		this.acno = acno;
		this.custname = custname;
		this.balance = balance;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
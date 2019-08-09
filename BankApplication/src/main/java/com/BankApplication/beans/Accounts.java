package com.BankApplication.beans;

import org.springframework.stereotype.Component;
@Component
public class Accounts {
	private Long accountNumber;
	private String customerName;
	private double balance;
	private String emailId;
	private String contactNumber;
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long long1) {
		this.accountNumber = long1;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerName=" + customerName + ", balance=" + balance
				+ ", emailId=" + emailId + ", contactNumber=" + contactNumber + "]";
	}
	
	
}

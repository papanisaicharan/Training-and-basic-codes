package com.BankApplication.controller;

import java.util.List;  

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.BankApplication.Dao.BankDao;
import com.BankApplication.beans.Accounts;

@Controller
public class BankController {
	BankDao dao;
	
	@RequestMapping("/hello")
	public String welcome() {
		return "welcome";	
	}
	
	@RequestMapping("/createAccount")
	public String createAccount() {
		return "createAccount";	
	}
	
	@RequestMapping("/homePage")
	public String homePage() {
		return "homePage";	
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(@RequestParam("user") String user,@RequestParam("balance") String balance,@RequestParam("email") String email,@RequestParam("contact_number") String contact_number) {
		System.out.println(user+balance+email+contact_number);
		Accounts act = new Accounts();
		act.setAccountNumber(dao.getId());
		act.setBalance(Double.parseDouble(balance));
		act.setContactNumber(contact_number);
		act.setCustomerName(user);
		act.setEmailId(email);
		
		int rows = dao.createAccount(act);
		System.out.println("account created"+ rows);
		return "status";
	}
	@RequestMapping("/viewAccounts")
	public String viewAccounts() {
		List<Accounts> act = dao.getAccounts();
		for(Accounts act1: act) {
			System.out.println(act1);
		}
		return "viewAccounts";
	}
}

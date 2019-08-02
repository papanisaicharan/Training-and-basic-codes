package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import day3.AccountNOtFFoundException;
import day3.InsuficientBalanceException;


public class BankApplicationOperationsUpdated {
	private ArrayList<Account> accounts = new ArrayList<>();
	private static int accountNo = 106;

	public BankApplicationOperationsUpdated() {
		
		accounts.add(new Account(100,10000,"pav"));
		accounts.add( new Account(105,1000,"shashi"));
		accounts.add( new Account(102,1000,"charan"));
	}
	
	public void createAccount(String accountName,double balance) {
		accountNo++;
		Account account = new Account(accountNo,balance,accountName);
		accounts.add(account);
		System.out.println("Account Successfullt created..!");
		System.out.println("Your details are : ");
		System.out.println(account.toString());
	}
	
	private Account findAccount(int accountNo) {
		Account found = null;
		for(Account ac : accounts) {
			if(ac.getAccountno() == accountNo) {
				found = ac;
				break;
			}
		}
		return found;
	}
	
	public void deposit(int accountNo,double balance)  {
		try {
			Account ac = findAccount(accountNo);
			if(ac != null) {
				ac.setBalance(ac.getBalance()+balance);
				System.out.println("Amount deposited Successfully...! Enjoy..");
			}else {
				throw new AccountNOtFFoundException();
			}
		} catch (AccountNOtFFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void withdraw(int accountNo,double balance) {
		try {
			Account ac = findAccount(accountNo);
			if(ac != null) {
				try {
					if(ac.getBalance() > balance) {
						ac.setBalance(ac.getBalance()-balance);
						System.out.println("Enjoy with your cash...! Bye.");
					}else {
						throw new InsuficientBalanceException();
					}
				} catch (InsuficientBalanceException e) {
					System.out.println(e.getMessage());;
				}
			}else {
				throw new AccountNOtFFoundException();
			}
		} catch (AccountNOtFFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void checkBalnce(int accountNo)  {
		try {
			Account ac = findAccount(accountNo);
			if(ac != null) {
				System.out.println("Your balance is : "+ac.getBalance());
			}else {
				throw new AccountNOtFFoundException();
			}
		} catch (AccountNOtFFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void listAccounts() {
		Collections.sort(accounts,new SortByAccountNo());
		Iterator itr= accounts.iterator();
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			Account s = (Account) itr.next();
			System.out.println("Account [accountNo=" + s.getAccountno() + ", balance=" + s.getBalance() + ", accountName=" + s.getCustomerName() + "]");
		}
	}
}

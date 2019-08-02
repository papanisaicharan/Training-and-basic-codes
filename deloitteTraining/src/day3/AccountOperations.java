package day3;

public class AccountOperations {
	private Account[] accounts = new Account[4];

	public AccountOperations() {
		accounts[0] = new Account(100,10000,"pav");
		accounts[1] = new Account(101,1000,"shashi");
		accounts[2] = new Account(102,1000,"sandeep");
		accounts[3] = new Account(103,100000,"saicharan");
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
	
}

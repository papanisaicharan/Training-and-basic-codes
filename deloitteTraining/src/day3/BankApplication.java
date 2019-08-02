package day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner s = new Scanner(System.in);
		AccountOperations operations  = new AccountOperations();
		System.out.println("Enter the choice :");
		System.out.println("d)----->deposit");
		System.out.println("w)----->withdraw");
		System.out.println("b)----->balance");
		System.out.println("x)----->Exit");
	
		boolean exe = true;
		while(exe) {
			System.out.println("-------------------------------------------Next Operation----------------------------------------");
			System.out.print("Please enter one of the above mentioned character for respective operation >>");
			char choice = s.next().trim().charAt(0);
			try {
				switch (choice) {
					case 'd':
						//deposit
							System.out.println("enter the account no:");
							int accountNo = s.nextInt();
							System.out.println("enter the ammount to be deposited:");
							int depositAmt = s.nextInt();
							operations.deposit(accountNo, depositAmt);
							break;
					case 'w':
						//withdraw
						System.out.println("enter the account no:");
						int accountNo1 = s.nextInt();
						System.out.println("enter the ammount to be withdrawn:");
						int depositWith = s.nextInt();
						operations.withdraw(accountNo1, depositWith);
						break;
					case 'b':
						//balance
						System.out.println("enter the account no:");
						int accountNo2 = s.nextInt();
						operations.checkBalnce(accountNo2);
						break;
					case 'x':
						//exit
						System.out.println("exiting....bye!");
						exe = false;
						break;
					default :
						//System.out.println(choice);
						System.out.println("please give a proper character...!");
						break;
				}
			}catch(InputMismatchException e) {
				System.out.println("wrong input");
			}
		}
		
	}

}

package exceptionproblem2;

import java.util.Scanner;

public class CustomException {
    
    public static void main(String[] args) {
	
	// STUDENT CODE BEGINS HERE
    	Scanner s = new Scanner(System.in);
    	int custId;
    	String custName;
    	String registerDate;
    	if(s.hasNextInt()) {
    		custId = s.nextInt();
    	}else {
    		custId = -10;
    	}
    	if(s.hasNext()) {
    		custName = s.next();
    	}else {
    		custName = "";
    	}
		if(s.hasNext()) {
			registerDate = s.next();
		}else {
			registerDate = "";
		}
		try {
			Customer cust = new Customer(custId,custName,registerDate);
			System.out.println(cust.doRegister());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
    // STUDENT CODE ENDs HERE

			
    }
}

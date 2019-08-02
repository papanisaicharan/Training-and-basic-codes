package exceptionproblem2;

import java.sql.Date; 
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Customer {
    private final static String startDate="2019/01/01";
	private final static String lastDate="2019/02/28";
	
	// STUDENT CODE BEGINS HERE
	
	int custId;
	String custName;
	String registerDate;
	public Customer(int custId, String custName, String registerDate) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.registerDate = registerDate;
	}
	public static String getStartdate() {
		return startDate;
	}
	public static String getLastdate() {
		return lastDate;
	}
	public int getCustId() {
		return custId;
	}
	public String getCustName() {
		return custName;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	
	public boolean checkDate(String date) {
		String arr[];
		if(date.contains("/")) {
			arr = date.split("/");
		}else {
			return false;
		}
		if(arr.length == 3) {
				int day = Integer.parseInt(arr[2]);
				int month = Integer.parseInt(arr[1]);
				int year = Integer.parseInt(arr[0]);
				if(month < 1 ||  month >12)return false;
				if(month ==2 && (day <1 || day > 28 ))return false;
				if(day <1 || day >31)return false;
				return true;
		}
		return false;
	}
	
	@SuppressWarnings("unused")
	public String doRegister() throws Exception {
		String result = "";
		try {
			if(checkDate(registerDate)) {
				//System.out.println("hello");
					java.util.Date start = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH)
		                    .parse(startDate);
		            java.util.Date end = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH)
		                    .parse(lastDate);
		            java.util.Date current = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH)
		                    .parse(registerDate);
		            //System.out.println(current);
		            System.out.println(current.compareTo(end));
	            	if (current.compareTo(end) > 0) {
	            		//System.out.println("1");
	            		throw  new LateRegistrationException("Registration failed");
	                }
	            	if (current.compareTo(start) < 0) {
	            		//System.out.println("2");
	            		throw  new InvalidRegistrationException("Invalid Date of  Registration");
	                }
	            	if (current.compareTo(start) == 0 || current.compareTo(end) == 0) {
	            		//System.out.println("3");
	            		return "Registered successfully";
	                }
	            	
	            	if (current.compareTo(start) > 0 && current.compareTo(end) < 0) {
	            		//System.out.println("4");
	            		return "Registered successfully";
	                }
	            
			} else
				throw new Exception("Unparseable date:"+registerDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
		return "Registration failed";
	}


}



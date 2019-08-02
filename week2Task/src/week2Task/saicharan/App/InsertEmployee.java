package week2Task.saicharan.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import week2Task.saicharan.bean.Employee;
import week2Task.saicharan.dao.EmployeeDao;
import week2Task.saicharan.dao.Imp.EmployeeDaoImp;



public class InsertEmployee {
	private static Scanner scan;
	private static EmployeeDao dao;
	
	public static void main(String[] args) {
		try {
			scan = new Scanner(System.in);
			System.out.println("enter fname,lastname,dob(dd-mm-yyyy),address : ");
			String fname = scan.next();
			String lastname = scan.next();
			String date = scan.next();
			String address = scan.next();
			Random rd = new Random();
			int randomint = rd.nextInt(10000);
			System.out.println(randomint);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date dt = null;
			try {
				dt = sdf.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Employee emp = new Employee();
			emp.setFname(fname);
			emp.setLastname(lastname);;
			emp.setEmpid(fname.substring(0, 2)+lastname.substring(0, 2)+randomint);
			emp.setDob(dt);
			emp.setAddress(address);
			dao = new EmployeeDaoImp();
			int rows = dao.insertEmployee(emp);
			if(rows> 0) {
				System.out.println(rows + " inserted succesfully");
			}else {
				System.out.println("onot inserted.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

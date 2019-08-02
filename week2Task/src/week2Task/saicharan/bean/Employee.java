package week2Task.saicharan.bean;

import java.util.Date;

public class Employee {
	private String fname;
	private String lastname;
	private String Empid;
	private Date Dob;
	private String Address;

	
	public Employee() {

	}
	public Employee(String fname, String lastname, String empid, Date dob, String address) {

		this.fname = fname;
		this.lastname = lastname;
		Empid = empid;
		Dob = dob;
		Address = address;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		Empid = empid;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}

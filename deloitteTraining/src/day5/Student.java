package day5;

import java.io.Serializable;

public class Student implements Serializable {
	protected int regno;
	protected String stdname;
	protected String section;
	public Student(int regni, String stdname, String section) {
		this.regno = regni;
		this.stdname = stdname;
		this.section = section;
	}
	public void display() {
		System.out.println(regno + stdname + section);
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", stdname=" + stdname + ", section=" + section + "]";
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}

	
}

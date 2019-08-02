package day2;

public class Student implements Comparable<Student> {
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
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getStdname().compareTo(o.getStdname());
	}
	
}

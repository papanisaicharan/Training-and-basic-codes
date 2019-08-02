package beans;

public class Student{
	private int regno;
	private String stdname;
	private double avg;
	public Student(int regno, String stdname, double avg) {
		super();
		this.regno = regno;
		this.stdname = stdname;
		this.avg = avg;
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
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

}

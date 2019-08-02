package day2;

public class InhertingfromEmployee extends Student {
	private String city;
	public InhertingfromEmployee(String city,int regni, String stdname, String section) {
		super(regni, stdname, section);
		this.city = city;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InhertingfromEmployee s = new InhertingfromEmployee("hyd",12,"sai","ab");
		s.display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println(city);
	}

}

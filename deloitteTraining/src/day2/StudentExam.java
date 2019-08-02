package day2;

public class StudentExam extends Student {
	
	public StudentExam(int regni, String stdname, String section,int sub1,int sub2,int sub3) {
		super(regni, stdname, section);
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		// TODO Auto-generated constructor stub
	}
	
	 public int sum() {
		 return this.sub1 + this.sub2 + this.sub3;
	 }
	 
	 public double avg() {
		 return sum()/3;
	 }

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println( regno +"  "+ stdname +"  "+ section+"  "+sub1 +"  "+sub2 +"  "+sub3);
	}

	private int sub1,sub2,sub3;
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		StudentExam s  = new StudentExam(12,"sai","ab",60,80,50 );
//		s.display();
//	}


}

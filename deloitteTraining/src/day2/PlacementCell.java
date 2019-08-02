package day2;

public class PlacementCell extends StudentExam {



	public PlacementCell(int regni, String stdname, String section, int sub1, int sub2, int sub3,int attended,int selected) {
		super(regni, stdname, section, sub1, sub2, sub3);
		this.selected =selected;
		this.attended = attended;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println( regno +"  "+ stdname +"  "+ section+"  "+avg()+ " "+ attended + " "+ selected);

	}

	private int attended,selected;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlacementCell s = new PlacementCell(12,"sai","ab",60,80,50 ,50,20);
		s.display();
	}

}

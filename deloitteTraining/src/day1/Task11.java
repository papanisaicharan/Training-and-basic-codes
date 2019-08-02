package day1;

public class Task11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno = 123,sub1 = 50,sub2 = 40,sub3 = 80;
		int sum =sub1 + sub2 + sub3;
		double avg =  sum / 3;
		
		boolean b = true;
		
		if(sub1 > 35) {
			System.out.println("sub1 passed");
		}else {
			b= false;
			System.out.println("sub1 failed");
		}
		if(sub2 > 35) {
			System.out.println("sub2 passed");
		}else {
			b= false;
			System.out.println("sub2 failed");
		}
		if(sub3 > 35) {
			System.out.println("sub3 passed");
		}else {
			b= false;
			System.out.println("sub3 failed");
		}
		if(b) {
			System.out.println(" over all is passed");
		}else {
			System.out.println("failed");
		}
		
		
	}
}

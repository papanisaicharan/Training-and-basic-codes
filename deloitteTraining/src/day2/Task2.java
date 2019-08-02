package day2;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("deloitte");
		int len = s.length();
		int i = 0;
		while(i < len) {
			System.out.println(s.charAt(i));
			i++;
		}
		i = 1;
		while(i<len+1) {
			System.out.println(s.substring(0,i));
			i++;
		}
		if(s.toString().equals(s.reverse().toString())) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("sorry, it is not a plaindrome");
		}
		
	}

}

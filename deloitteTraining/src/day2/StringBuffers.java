package day2;

public class StringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer();
		s.append("hello");
		System.out.println(s);
		s.append("sai");
		System.out.println(s);
		System.out.println(s.deleteCharAt(0));
		System.out.println(s.reverse());
		String str = "deloitte";
		str = s.toString();
		System.out.println(str);
	}

}

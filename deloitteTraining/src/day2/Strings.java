package day2;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "deloitte";
		String str2 = "deloitte";
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.concat("hello"));
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(2,5));
		System.out.println(str1.isEmpty());
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.charAt(2));
		System.out.println(str1.replace('i', 'p'));
		
	}


}

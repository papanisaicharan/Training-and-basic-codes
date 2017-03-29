package demostring;

public class Demostring4 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("default capacity="+sb.capacity());
		sb.append("java");
		sb.append("program");
		System.out.println("default capacity="+sb.capacity());
		System.out.println("length="+sb.length());
		sb.insert(4,"language");
		System.out.println(sb);
		System.out.println("default capacity="+sb.capacity());
		System.out.println("length="+sb.length());
		System.out.println("reverse=="+sb.reverse());
	}

}

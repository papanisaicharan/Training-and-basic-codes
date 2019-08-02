package day4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> d = new ArrayDeque<String>();
		d.add("sai");
		d.add("ppp");
		System.out.println(d);
		System.out.println(d.remove());
		System.out.println(d.remove());
		d.add("sai");
		d.add("ppp");
		System.out.println(d.poll());
		System.out.println(d.poll());
		System.out.println(d.poll());
//		d.add("sai");
//		d.add("ppp");
//		System.out.println(d.element());
//		System.out.println(d.element());
//		System.out.println(d.element());
		System.out.println(d.peek());
	}

}

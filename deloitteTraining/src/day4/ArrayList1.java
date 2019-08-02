package day4;

import java.util.*;
import java.util.ListIterator;

public class ArrayList1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList arraylist = new ArrayList();
		arraylist.add(new Integer(435));
		arraylist.add("saicharan");
		arraylist.add(435.00);
		arraylist.add('s');
		System.out.println(arraylist+ " " + arraylist.size());
		arraylist.add('p');
		System.out.println(arraylist+ " " + arraylist.size());
		arraylist.add(2,'q');
		System.out.println(arraylist+ " " + arraylist.size());
		ListIterator itr = arraylist.listIterator(arraylist.size());
//		while(itr.hasNext()) {
//			Object p = itr.next();
////			if(p instanceof Integer) {
////				System.out.println(p);
////			}
//			if(p.getClass().toString().equals("class java.lang.Integer")){
//				System.out.println(p);
//			}
//			
//		}
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}

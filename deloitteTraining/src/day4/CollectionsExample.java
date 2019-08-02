package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list = new ArrayList<Integer>();  
	        list.add(46);  
	        list.add(67);  
	        list.add(24);  
	        list.add(16);  
	        list.add(8);  
	        list.add(12);  
	        list.add(12); 
	        List<Integer> list1 = new ArrayList<Integer>();
	        list1.add(8);
	        list1.add(12);
	        System.out.println("V"+Collections.max(list)); 
	        System.out.println("V"+Collections.min(list));
	        Collections.sort(list);
	        System.out.println("V"+list);
	        System.out.println("V"+Collections.binarySearch(list, 16));
	        System.out.println("V"+Collections.frequency(list, 12));
	        Collections.reverse(list);
	        System.out.println(list);
	    	
	       
	}

}

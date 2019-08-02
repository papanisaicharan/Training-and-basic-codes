package day4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import day2.Student;


public class UsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> h = new HashMap<>();
		h.put("aa", 123);
		h.put("ra", 1213);
		h.put("oa", 1223);
		System.out.println(h);
		System.out.println(h.get("aa"));
		Set set = h.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}

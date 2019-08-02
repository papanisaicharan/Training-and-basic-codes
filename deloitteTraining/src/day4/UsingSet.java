package day4;

import java.util.HashSet;
import java.util.TreeSet;

public class UsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet items = new HashSet<>();
		items.add(456);
		items.add("saicharan");
		items.add(435.00);
		items.add('p');
		items.add(null);
		System.out.println(items);
		TreeSet<String> p = new TreeSet<>();
		p.add("xyz");
		p.add("ayz");
		p.add("fyz");
		p.add("dyz");
		p.add("pyz");
		System.out.println(p);
	}

}

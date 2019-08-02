package day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class UsinStringtokenizerDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String str= "saicharan is bad fellow";
		StringTokenizer t = new StringTokenizer(str);
		while(t.hasMoreTokens()) {
			System.out.println(t.nextToken());
		}
		
		Date d = new Date();
		System.out.println(d);
		
		String dt = "02/07/2019";
		SimpleDateFormat dta = new SimpleDateFormat("dd/mm/yyyy");
		Date dt1 = dta.parse(dt);
		System.out.println(dt1);
		System.out.println(dt1.getDay());
	}
}

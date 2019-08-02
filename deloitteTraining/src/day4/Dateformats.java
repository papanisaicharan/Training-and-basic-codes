package day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Dateformats {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String dt = "12-10-2019";
		SimpleDateFormat dta = new SimpleDateFormat("dd-mm-yyyy");
		Date date = dta.parse(dt);
		System.out.println(dta.format(date));
		dta = new SimpleDateFormat("dd-MMMM-yyyy");
		System.out.println(dta.format(date));
		dta = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss");
		System.out.println(dta.format(date));
		dta = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss zzzz");
		System.out.println(dta.format(date));
		
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now().plusDays(2));
		System.out.println(LocalDate.now().minusMonths(1));
		System.out.println(LocalDate.now().isLeapYear());
		System.out.println(LocalDate.now().getMonth());
	}

}

package exceptionproblem2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Test {
	private final static String startDate="2019/01/01";
	private final static String lastDate="2019/02/28";
	private final static String registerDate="2019/01/01";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			java.util.Date start = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.ENGLISH)
			        .parse(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			java.util.Date end = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.ENGLISH)
			        .parse(lastDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			java.util.Date current = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.ENGLISH)
			        .parse(registerDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

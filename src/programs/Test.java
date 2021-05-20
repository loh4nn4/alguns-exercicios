package programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = new Date();
		System.out.println(sdf.format(d));
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR, 1);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		int year = cal.get(Calendar.YEAR);
		System.out.println("Year: "+year);
	}

}

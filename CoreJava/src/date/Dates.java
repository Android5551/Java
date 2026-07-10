package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Dates {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		// date to formatted date
		SimpleDateFormat s = new SimpleDateFormat("dd-MMM-Y hh:m a");
		String formatteddate = s.format(d);
		System.out.println(formatteddate);
		
		//formatted date to date
		
		Date da = s.parse(formatteddate);
		System.out.println(da);
				
	}

}

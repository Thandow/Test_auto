package basic.concepts;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateDemo {

	public static void main(String[] args) {
		
		Date dt= new Date();
		System.out.println(dt);
		
		DateFormat df = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		System.out.println(df.format(dt));
	}
}
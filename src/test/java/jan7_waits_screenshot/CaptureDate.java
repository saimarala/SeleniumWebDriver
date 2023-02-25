package jan7_waits_screenshot;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureDate {

	public static void main(String[] args) {
	
		Date d=new Date();
	
		System.out.println(d);
		
		SimpleDateFormat customDateFormat=new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy");
		
		String date=customDateFormat.format(d);
		
		System.out.println(date);
		

	}

}

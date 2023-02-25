package jan7_waits_screenshot;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureDate2 {

	
	
	public static void main(String[] args) {
		
		String date=new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy").format(new Date());
		
		System.out.println(date);
		

	}

}

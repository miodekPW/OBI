package zadanie1;


import java.text.SimpleDateFormat;
import java.util.*;

public class JakiDzienTygodnia {
	Locale polski=new Locale("pl");
	SimpleDateFormat sdf= new SimpleDateFormat("EEEE, dd.MM.yyyy",polski);
	Calendar c ;
	
	
	public JakiDzienTygodnia(int dd, int mm, int yyyy) {
		try {
			c= new GregorianCalendar(yyyy,mm-1,dd);
			System.out.println(sdf.format(c.getTime()));
			c.roll(Calendar.YEAR, 1);
			System.out.println(sdf.format(c.getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
}

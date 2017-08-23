package date;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class stringdate {


		public static void main(String args[]) throws ParseException{
	        
	        DateFormat formatter = null;
	        Date convertedDate = null;
	        
	       // Creating SimpleDateFormat with yyyyMMdd format e.g."20110914"
	        String yyyyMMdd = "20110914";
	        formatter =new SimpleDateFormat("yyyyMMdd");
	        convertedDate =(Date) formatter.parse(yyyyMMdd);
	        System.out.println("Date Format : " + convertedDate);

	        


	
	}

}

import java.text.DateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1
{
	public static void main(String[] args) throws ParseException
	{
		    Scanner sc=new Scanner(System.in);
		    
		 //Using date formatter default function
		    try{
		    	  String stringdateformat=null;
					System.out.println("Enter the date:");
					stringdateformat=sc.nextLine();
					SimpleDateFormat dateformatter = new SimpleDateFormat("dd/MM/yyyy");
			        Date newDate = (Date) dateformatter.parse(stringdateformat);
			        System.out.println("Conversion of Date to String is " + newDate); 
			    
		    	
		    }catch(Exception e)
		    {
		    	System.err.println("The date you entered is incorrect.Please try again.");
		    }
		  
		    
	    
			sc.close();

	}
}

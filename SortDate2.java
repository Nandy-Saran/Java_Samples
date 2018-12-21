import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;


//$Id$

public class SortDate2 {
	public static void main(String... args) throws ParseException {
		
			Scanner sc=new Scanner(System.in);
		
	while(true)
		{
			try
			{
				ArrayList<Date> date=new ArrayList<>();
				int i; 
				SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
				String dateinput=new String();
				System.out.println("\nEnter the dates as comma separated values:");
				dateinput=sc.nextLine();
				String datestrarr[]=dateinput.split(",");
				Date datearr[]=new Date[datestrarr.length];
				for(i=0;i<datestrarr.length;i++)
				{
				  datearr[i]=format.parse(datestrarr[i]);
				  date.add(datearr[i]);
				}
			  Collections.sort(date);
			  System.out.println("The dates displayed in descending order are:");
			  for(i=date.size()-1;i>=0;i--)
			  {
				  System.out.println(date.get(i));
			  }
			  break;
		}catch(Exception e)
		{
			System.err.println("Error!Please enter a proper date.");
		}
		  
	}//end while
	sc.close();
  }//end main
}

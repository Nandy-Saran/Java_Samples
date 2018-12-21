import java.text.DateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date
{
	public static void main(String[] args) throws ParseException
	{
		    Scanner sc=new Scanner(System.in);
		    String date=null,dateinString=null;
	        String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
	        System.out.println("Enter the date:");
			date=sc.nextLine();
			String rawdate[]=date.split("/");
			int mon=Integer.parseInt(rawdate[1])-1;
			dateinString=rawdate[0]+" "+month[mon]+" "+rawdate[2];
			System.out.println("Date in string is:" + dateinString );
			
			sc.close();

	}
}
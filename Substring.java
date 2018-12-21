//$Id$
import java.util.Scanner;


public class Substring {
	public static void main(String[] args)
	{
		String mainstring,substring;
		boolean result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Search a substring in a given string- Case Insensitive Search.");
		System.out.println("");
		System.out.println("Enter the string:	");
		mainstring=sc.nextLine();
		sc.close();
		while(true)
		{
			System.out.println("Enter the substring to be searched for in \'" + mainstring + "\':	");
			substring=sc.nextLine();
			result=mainstring.toUpperCase().contains(substring.toUpperCase());
			if(result==true)
			{
				System.out.println("The substring \'"+substring+"\' exists.");
			}
			else
			{
				System.out.println("The substring \'"+substring+"\' does not exist.\nPlease try another substring.");
			}
		}
		
	}
	


}

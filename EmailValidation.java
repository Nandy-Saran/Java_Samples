//$Id$
import java.util.Scanner;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class EmailValidation {

	public static void main(String[] args)
	{
		String email = null;boolean result=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email address to be validated.");
		email=sc.nextLine();
		result=validate(email);
		if(result==true)
			System.out.println("The typed email address \""+email+"\" is valid.");
		else
			System.err.println("The typed email address \""+email+"\" is invalid.Please try again.");
	}
	
	static boolean validate(String emailaddr)
	{
		boolean value=false;
		Pattern pattern1 = Pattern.compile("^[a-zA-Z0-9+_&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
		Matcher m=pattern1.matcher(emailaddr);
		value=m.matches();
		return value;
		
	}
}

/* Rules got from RFC page and Regex rules from owasp Validation_Regex_Repository */
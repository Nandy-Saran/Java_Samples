import java.util.Scanner;

public class findVowels {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException
	{
		Scanner sc=new Scanner(System.in);
		String text=null;
		String vowels= new String("aeiou");
		int count=0;
		System.out.println("To count the number of vowels in a sentence \n");
		System.out.println("Enter the string:");
		text=sc.nextLine().toLowerCase();
		String[] arrtext=text.split("");
		for(String at:arrtext)
			if(vowels.contains(at))
				count++;
		if(count==0)
			System.out.println("There are no vowels in the sentence.\n COUNT:0");
		else
		System.out.println("The number of vowels in the sentence \""+ text+ "\"is: "+count +"\n");
		
		sc.close();
	}
}



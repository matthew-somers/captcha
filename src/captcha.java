import java.util.Random;
import java.util.Scanner;
import java.math.*;

/**
 * 
 * @author Matthew Somers
 * A CAPTCHA
 */
public class captcha 
{
	public static final int ASCIISTART = 97;
	public static final int ASCIILENGTH = 25;
	
	public static void main(String[] args) 
	{
		String[] wordlist = {"holycrap", "nopleasestop", "ohgodwhy",
				"dungeon", "sosleepy", "whatishappening", "lostandalone"};
		
		Random ran = new Random();	
		
		int chooser = ran.nextInt(2);
		if (chooser == 0)
			System.out.println("Solution is every 3rd character of the CAPTCHA!");
		else
			System.out.println("Solution is every 2nd character of the CAPTCHA!");
		

		int rand = ran.nextInt(wordlist.length);
		char rand2;
		char rand3;
		System.out.print("CAPTCHA: ");
		for (int i = 0; i < wordlist[rand].length(); i++)
		{
			rand2 = (char) (ASCIISTART + ran.nextInt(ASCIILENGTH+1));
			rand3 = (char) (ASCIISTART + ran.nextInt(ASCIILENGTH+1));

			System.out.print(rand2);
			
			if (chooser == 0)
				System.out.print(rand3);
			System.out.print(wordlist[rand].charAt(i));
		}
		
		System.out.print("\nSolution: ");
		Scanner in = new Scanner(System.in);
		String input = in.next();
		
		if (input.equals(wordlist[rand]))
			System.out.println("Correct!");
		else
			System.out.println("Fail, sorry Mr. ROBOT!");
		
	}

}

import java.util.Scanner;

public class FindAsciiValue {
	
	public static char GetLetter(Scanner input)
	{
		System.out.println("Enter a character");
		String FirstLetter = input.next();
		char letter = FirstLetter.charAt(0);
		return letter;
	}
	public static void GetAsciiValue(char letter)
	{
		System.out.println("the char is: " + letter + " and its ascii value is: " + (int)letter);
	}
}

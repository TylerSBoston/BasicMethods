import java.util.Scanner;

public class FindAsciiValue {
	
	public static char getLetter(Scanner input)
	{
		System.out.println("Enter a character");
		String FirstLetter = InputVerifier.verifyString(input);
		char letter = FirstLetter.charAt(0);
		return letter;
	}
	public static void getAsciiValue(char letter)
	{
		System.out.println("the char is: " + letter + " and its ascii value is: " + (int)letter);
	}
}

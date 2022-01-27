import java.util.Scanner;

public class HalfNumber {
	
	public static float GetNumber(Scanner input)
	{
		System.out.println("Enter a Number");	
		float number =  input.nextFloat();
		return number;
	}
	
	
	public static void GetHalfNumber(float number)
	{
		System.out.println("Halfe of " + number + " is " + (number/2));
	}
}

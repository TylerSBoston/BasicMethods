import java.util.Scanner;

public class HalfNumber {
	
	public static float getNumber(Scanner input)
	{
		System.out.println("Enter a Number");	
		float number =  Lander.verifyFloat(input);
		return number;
	}
	
	
	public static void getHalfNumber(float number)
	{
		System.out.println("Halfe of " + number + " is " + (number/2));
	}
}

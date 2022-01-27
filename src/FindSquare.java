
import java.util.*;

public class FindSquare {
	
	//calculates square
	public static float squareOfNumber(float number)
	{
		return number * number;
	}
	//asks the user to get 
	public static float getNumber(Scanner input)
	{
		System.out.println("Enter a Number");	
		float number =  Lander.verifyFloat(input);
		return number;
	}
	public static void getSquare(Scanner input)
	{
			float number = getNumber(input);
			System.out.println("The Square of " + number + " is " + squareOfNumber(number));
	}
	

}

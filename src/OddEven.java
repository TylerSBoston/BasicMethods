import java.util.*;


public class OddEven {
		
	
	//void cause we answer in console....
	public static void isEven(Scanner input)
	{
			System.out.println("Enter a number");
			int userInt = InputVerifier.verifyInt(input);
			
			if(getIsEven(userInt))
			{
				System.out.println("You entered " +userInt+ ", an even number");
			}
			else
			{
				System.out.println("You entered " +userInt+ ", an Odd number");
			}
		
			
	}
	public static boolean getIsEven(int number)
	{
		if(number%2 == 0)
			return true;
		else
			return false;
	}
	
	public static void addUpOdds(Scanner input)
	{
		System.out.println("Enter a number");
		int userInt = InputVerifier.verifyInt(input);
		System.out.println("all odd numbers up to " + userInt + " add up to " + getCumulativeOdds(userInt));
		
	}
	public static int getCumulativeOdds(int number)
	{
		int total = 0;
		for(int i = 1; i <= number; i += 2)
		{
			total += i;
		}
		return total;
	}
	
	//Not used
	public static void addUpEvins(Scanner input)
	{
		
	}
	
	
	
		
		
}

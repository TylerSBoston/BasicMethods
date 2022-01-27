import java.util.*;


public class OddEven {
		
	
	//void cause we answer in console....
	public static void isEven(Scanner input)
	{
			System.out.println("Enter a number");
			int userInt = InputVerifier.verifyInt(input);
			
			if(userInt%2 == 0)
			{
				System.out.println("You entered " +userInt+ ", an even number");
			}
			else
			{
				System.out.println("You entered " +userInt+ ", an Odd number");
			}
		
			
	}
	
	public static void addUpOdds(Scanner input)
	{
		System.out.println("Enter a number");
		int userInt = InputVerifier.verifyInt(input);
		int Total = 0;
		for(int i =1; i<=userInt; i += 2)
		{
			Total += i;
		}
		System.out.println("all odd numbers up to " + userInt + " add up to " + Total);
		
	}
	//Not used
	public static void addUpEvins(Scanner input)
	{
		
	}
	
	
	
		
		
}

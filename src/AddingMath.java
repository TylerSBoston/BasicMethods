import java.util.Scanner;

public class AddingMath {

	public static void factorial(Scanner input)
	{
		System.out.println("Enter a number");
		int userInt = InputVerifier.verifyInt(input);
		int Total = 1;
		for(int i =1; i<=userInt; i ++)
		{
			Total *= i;
		}
		System.out.println("The factorial of " + userInt + " equals " + Total);
		
	}
	
	public static void isPrime(Scanner input)
	{
		System.out.println("Enter a number");
		boolean isPrime = true;
		int userInt = InputVerifier.verifyInt(input);
		for(int i = 2; i <= userInt/2; i++)
		{
			if(userInt%i == 0)
				isPrime = false;
		}
		if(isPrime == true)
			System.out.println(userInt + " is Prime");
		else
			System.out.println(userInt + " is not Prime");
		
	}
	
	public static void sumOfDigits(Scanner input)
	{
		//verify if number is int, could work with junk
		System.out.println("Enter a number");
		String userValue = input.nextLine();
		int Total = 0;
		for(int i = 0; i<userValue.length();i++)
		{
			if((int)userValue.charAt(i)<=57 &&(int)userValue.charAt(i)>=48  )
			{
				Total += ((int)userValue.charAt(i) - 48);
			}
		}
		
		System.out.println("The sum of the digits is: " + Total);
	}
	
	public static void fibonacciNumbers(Scanner input)
	{
		System.out.println("Enter a number");
		int userInt = InputVerifier.verifyInt(input);
		// initilizing to stop warnings
		int backNumber=0;
		int frontNumber=0;
		int currentNumber;
		
		System.out.println("Printing fibonacci Numbers: \n");
		for(int i = 1; i<=userInt;i++)
		{
			if(i == 1)
			{
				backNumber = 0;
				currentNumber = 0;
				System.out.print("0, ");
				
			}
			else if(i == 2)
			{
				frontNumber = 1;
				currentNumber = 1;
				System.out.print("1, ");
			}
			else
			{
				currentNumber = frontNumber + backNumber;
				backNumber = frontNumber;
				frontNumber = currentNumber;
				System.out.print(currentNumber + ", ");
			}
		}
	}
}

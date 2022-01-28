import java.util.LinkedList;
import java.util.Scanner;

public class AddingMath {

	public static void factorial(Scanner input)
	{
		System.out.println("Enter a number");
		int userInt = InputVerifier.verifyInt(input);

		System.out.println("The factorial of " + userInt + " equals " + getFactorial(userInt));
	}
	public static int getFactorial(int number)
	{
		
		int total = 1;
		for(int i =1; i<=number; i ++)
		{
			total *= i;
		}
		return total;
	}
	
	
	public static void isPrime(Scanner input)
	{
		System.out.println("Enter a number");
		
		int userInt = InputVerifier.verifyInt(input);
		boolean isPrime = getPrime(userInt);
		if(isPrime == true)
			System.out.println(userInt + " is Prime");
		else
			System.out.println(userInt + " is not Prime");

		
	}
	public static boolean getPrime(int number)
	{
		boolean isPrime = true;
		for(int i = 2; i <= number/2; i++)
		{
			if(number%i == 0)
			{
				isPrime = false;
				break;
			}
		}	
		return isPrime;
	}
	
	
	
	public static void sumOfDigits(Scanner input)
	{
		//verify if number is int, could work with junk
		System.out.println("Enter a number");
		String userValue = input.nextLine();
		System.out.println("The sum of the digits is: " + getSumOfDigits(userValue));
	}
	public static int getSumOfDigits(String input)
	{
		int Total = 0;
		for(int i = 0; i<input.length();i++)
		{
			if((int)input.charAt(i)<=57 &&(int)input.charAt(i)>=48  )
			{
				Total += ((int)input.charAt(i) - 48);
			}
		}
		
		
		
		return Total;
	}
	
	
	
	public static void fibonacciNumbers(Scanner input)
	{
		System.out.println("Enter a number");
		System.out.println(getFibonacciNumber(InputVerifier.verifyInt(input)));	
	}
	public static String getFibonacciNumber(int number)
	{
		String output = "";
		int backNumber = 0;
		int currentNumber =0;
		int frontNumber = 0;
		
		
		output = "Printing fibonacci Numbers: \n";
		for(int i = 1; i<=number;i++)
		{
			if(i == 1)
			{
				backNumber = 0;
				currentNumber = 0;
				output += "0, ";
				
			}
			else if(i == 2)
			{
				frontNumber = 1;
				currentNumber = 1;
				output +="1, ";
			}
			else
			{
				currentNumber = frontNumber + backNumber;
				backNumber = frontNumber;
				frontNumber = currentNumber;
				output += currentNumber + ", ";
			}
		}
		
		return output;
		
		
	}
	public static void getInputedNumbers(Scanner input)
	{
		LinkedList<Double> numbers = new LinkedList<Double>();
		boolean done = false;
		System.out.println("Enter some Numbers, Press Y when done");
		while(done == false)
		{
			// can probably be more efficient, coming back if time
			if(input.hasNextDouble())
			{	
				// Ignores numbers after junk inputs
				do
				{
						numbers.add(input.nextDouble());
				}while (input.hasNextDouble());
					input.nextLine();
			}
			else if(input.nextLine().charAt(0)=='Y')
			{
				done = true;
			}
		}
		Double total = addInputedNumbers(numbers);
		if(total != null)
			System.out.println("The values you entered total to " + total);
	}
	public static Double addInputedNumbers(LinkedList<Double> numbers)
	{
		double total = 0;
		for(Double f : numbers)
		{
			total += f;
		}
		return total;
		
		
	}
	
	

}

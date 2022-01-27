
import java.util.*;

public class FindGreatestNumber {
	public static void getGreatestNumber(Scanner input)
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
		Double biggestNumber = Double.MIN_VALUE;
		for(Double f : numbers)
		{
			if(f>biggestNumber)
				biggestNumber = f;
		}
		//assumes nobody enters the min_value
		if(biggestNumber != Double.MIN_VALUE)
			System.out.println("The biggest number you entered is: " + biggestNumber);
		else
			System.out.println("No valid numbers entered");
		}
}

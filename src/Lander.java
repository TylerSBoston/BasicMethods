
import java.util.*;

public class Lander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		// Folder Needs a Rename
		LandHere();
		
		System.out.println("\n\n GoodBye");
	}
	
	public static void LandHere()
	{
		int userInput = 6;
		Scanner input = new Scanner(System.in);
		while(userInput != 0)
		{
			System.out.println("\n\nChoose number for task:\n 1: Get Square of Number\n 2: Get Half of a number\n 3: get ascii value of a character\n 4: Convert Celsius to Farenheit\n 5: convert KM to M \n 0: exit Program");
			
			userInput = verifyInt(input,userInput);
	        switch (userInput) 
	        {
	            case 1:  FindSquare.getSquare(input);
	            		 userInput = 6;
	                     break;
	            case 2:  HalfNumber.getHalfNumber(HalfNumber.getNumber(input));
	            		 userInput = 6;
	                     break;
	            case 3:  FindAsciiValue.getAsciiValue(FindAsciiValue.getLetter(input));
	               		 userInput = 6;
	                     break;
	            case 4:  FindFarenheit.getFarenheit(FindFarenheit.getCelcius(input));
	              		 userInput = 6;
	                     break;
	            case 5:  FindMeters.getMeters(FindMeters.getKiloMeters(input));
	            		 userInput = 6;
	                     break;
	            case 0: 
	            		 break;
	            default: userInput = 6;
	            		 break;
	        }
		}
	}
	public static int verifyInt(Scanner input)
	{
		int number = 0;
		if(input.hasNextInt())
			number = input.nextInt();
		input.nextLine();
		return number;
	}
	public static int verifyInt(Scanner input, int baseNumber)
	{
		if(input.hasNextInt())
			baseNumber = input.nextInt();
		input.nextLine();
		return baseNumber;
	}
	public static float verifyFloat(Scanner input)
	{
		float number = 0;
		if(input.hasNextFloat())
			number = input.nextFloat();
		input.nextLine();
		return number;
	}
	public static String verifyString(Scanner input)
	{
		String inputString = input.nextLine();
		return inputString;
	}
}

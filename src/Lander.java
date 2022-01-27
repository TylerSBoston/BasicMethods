
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
		int userInput = -1;
		Scanner input = new Scanner(System.in);
		while(userInput != 0)
		{
			System.out.println("\n\nChoose number for task:\n "
					+ "1: Get Square of Number\n "
					+ "2: Get Half of a number\n "
					+ "3: get ascii value of a character\n "
					+ "4: Convert Celsius to Farenheit\n "
					+ "5: convert KM to M \n"
					+ "6: Get the greatest Number\n"
					+ "7: Find if number is even or odd\n"
					+ "8: Find odds up to...\n"
					+ "9: Find a factorial\n"
					+ "10: Find if Prime\n"
					+ "11: Some of Digits\n"
					+ "12: fibonacci numbers\n"
					+ "0: exit\n"
					+ "You may need to scroll up for previous answers\n");
			
			userInput = InputVerifier.verifyInt(input,userInput);
	        switch (userInput) 
	        {
	            case 1:  
	            	FindSquare.getSquare(input);
	            	userInput = -1;
	                break;
	            case 2:  
	            	HalfNumber.getHalfNumber(HalfNumber.getNumber(input));
            		userInput = -1;
                    break;
	            case 3:  
	            	FindAsciiValue.getAsciiValue(FindAsciiValue.getLetter(input));
               		userInput = -1;
                    break;
	            case 4:  
	            	FindFarenheit.getFarenheit(FindFarenheit.getCelcius(input));
              		userInput = -1;
                    break;
	            case 5:  
	            	FindMeters.getMeters(FindMeters.getKiloMeters(input));
            		userInput = -1;
                    break;
	            case 6: 
	            	FindGreatestNumber.getGreatestNumber(input);
	            	userInput = -1;
       		 		break;
	            case 7: 
	            	OddEven.isEven(input);
	            	userInput = -1;
       		 		break;
	            case 8: 
	            	OddEven.addUpOdds(input);
	            	userInput = -1;
       		 		break;
	            case 9: 
	            	AddingMath.factorial(input);
	            	userInput = -1;
       		 		break;
	            case 10: 
	            	AddingMath.isPrime(input);
	            	userInput = -1;
       		 		break;
	            case 11: 
	            	AddingMath.sumOfDigits(input);
	            	userInput = -1;
       		 		break;
	            case 12: 
	            	AddingMath.fibonacciNumbers(input);
	            	userInput = -1;
       		 		break;
	            case 0: 
            		 break;
	            default: 
	            	System.out.println("Enter a valid Input");
	            	userInput = -1;
	            	break;
	        }
		}
	}

}

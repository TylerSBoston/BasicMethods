
import java.util.*;

public class Lander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		LandHere();
	}
	
	public static void LandHere()
	// No Input Verification
	{
		int Choose = 1;
		Scanner input = new Scanner(System.in);
		while(Choose != 0)
		{
			System.out.println("Choose number for task:\n 1: Get Square of Number\n 2: Get Half of a number\n 3: get ascii value of a character\n 4: Convert Celsius to Farenheit\n 5: convert KM to M \n 0: exit Program");
			Choose = input.nextInt();
	        switch (Choose) 
	        {
	            case 1:  FindSquare.GetSquare(input);
	                     break;
	            case 2:  HalfNumber.GetHalfNumber(HalfNumber.GetNumber(input));
	                     break;
	            case 3:  FindAsciiValue.GetAsciiValue(FindAsciiValue.GetLetter(input));
	                     break;
	            case 4:  FindFarenheit.GetFarenheit(FindFarenheit.GetCelcius(input));
	                     break;
	            case 5:  FindMeters.GetM(FindMeters.GetKM(input));
	                     break;
	        }
		}
		
		
		
		
		//FindSquare.KeepGettingSquares(input);
	}
}

import java.util.Scanner;

public class FindFarenheit {
	
	public static float getCelcius(Scanner input)
	{
		System.out.println("Enter a Celcius Tempurature: ");
		float celcius = InputVerifier.verifyFloat(input);
		return celcius;
	}
	public static void getFarenheit(float celcius)
	{
		System.out.println(celcius + " Celcius in Farenheight is: " + (celcius * 1.8 + 32));
	}
	
	
	
}

import java.util.Scanner;

public class FindFarenheit {
	
	public static float GetCelcius(Scanner input)
	{
		System.out.println("Enter a Celcius Tempurature: ");
		float Celcius = input.nextFloat();
		return Celcius;
	}
	public static void GetFarenheit(float Celcius)
	{
		System.out.println(Celcius + " Celcius in Farenheight is: " + (Celcius*1.8 + 32));
	}
	
	
	
}

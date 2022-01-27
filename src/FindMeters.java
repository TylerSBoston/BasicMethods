import java.util.Scanner;

public class FindMeters {

	
	public static float getKiloMeters(Scanner input)
	{
		System.out.println("Enter an amount of KMs: ");
		float kiloMeter = InputVerifier.verifyFloat(input);
		return kiloMeter;
	}
	public static void getMeters(float kiloMeter)
	{
		System.out.println(kiloMeter + "KM is: " + (kiloMeter * 1000) + "M");
	}
	
}

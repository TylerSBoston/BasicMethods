import java.util.Scanner;

public class FindMeters {

	
	public static float getKiloMeters(Scanner input)
	{
		System.out.println("Enter an amount of KMs: ");
		float KM = Lander.verifyFloat(input);
		return KM;
	}
	public static void getMeters(float kiloMeter)
	{
		System.out.println(kiloMeter + "KM is: " + (kiloMeter * 1000) + "M");
	}
	
}

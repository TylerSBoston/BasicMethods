import java.util.Scanner;

public class FindMeters {

	
	public static float GetKM(Scanner input)
	{
		System.out.println("Enter an amount of KMs: ");
		float KM = input.nextFloat();
		return KM;
	}
	public static void GetM(float KM)
	{
		System.out.println(KM + "KM is: " + (KM*1000) + "M");
	}
	
}

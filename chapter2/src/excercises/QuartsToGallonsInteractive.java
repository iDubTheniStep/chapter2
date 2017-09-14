package excercises;
import java.util.Scanner;
public class QuartsToGallonsInteractive 
{

	public static void main(String[] args) 
	{


		final int quartsInGallons = 4; 
		
		int quartsNeeded1 = 18;
		int gallonsNeeded;
		int extraQuarts; 
		
		gallonsNeeded = gallonsNeeded / quartsInGallons;
		extraQuarts = quartsNeeded % quartsInGallons;
		@SuppressWarnings("resorce")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter quarts needed");
		gallonsNeeded = input.nextInt();
			
			System.out.println("you have" + gallonsNeeded+ "gallons and " +extraQuarts + "quarts left over");
		

	}

}

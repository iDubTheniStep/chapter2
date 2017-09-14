package excercises;
import java.util.Scanner;
public class NauticalMilesInteractive
{

	public static void main(String[] args)
	{
	
		double kilometers = 1.852;
		double kilometersNeeded;
		double miles = 1.150779;
		double milesNeeded;
		double NauticalMiles;
		
		
	
		@SuppressWarnings("resorce")
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter how many Nautical Miles you'd like to convert.");
		NauticalMiles = input.nextInt();
		
		
		kilometersNeeded = NauticalMiles *  kilometers;
		milesNeeded = NauticalMiles * miles;
		
		
		System.out.println("You will need " +milesNeeded+ " miles and " +kilometersNeeded+ " kilometers to have "+ NauticalMiles + " NauticalMiles"  );
		

	}

}

package excercises;
import java.util.Scanner;
public class eggs 
{
	public static void main(String[] args) 
	{
	double dozenOfEggs = 3.25; 
	double singleEgg = 0.45;
	int dozen;
	int single;
	double dozenPrice; 
	double singlePrice;
	double totalPrice;

	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter how many dozen(s) of eggs you would like. if you are wanting singles that will to be fallowed.");
	dozen = input.nextInt();
	
	System.out.println("Please enter how many single eggs you would like. ");
	single = input.nextInt();
	
	dozenPrice = dozenOfEggs * dozen;
	singlePrice = singleEgg * single; 
	totalPrice = dozenPrice * singlePrice;
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	System.out.println("You have ordered "+dozen+ " dozen eggs at "+dozenOfEggs+ " You also ordered " + single + " single eggs at "+ singleEgg+ " a egg. Bringing your total to " +totalPrice );
	
	
	}

}

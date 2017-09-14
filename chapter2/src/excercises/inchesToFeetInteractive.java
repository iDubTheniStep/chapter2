package excercises;
import java.util.Scanner;
public class inchesToFeetInteractive 
{

	public static void main(String[] args) 
	{

		int inches; 
		
		
		@SuppressWarnings("resorce")
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many inches would you like to convert to feet?");
		inches = input.nextInt();
		double feet = inches/7;
		
		System.out.println( inches +" converts to " +feet+ " Feet." );
		

	}

}

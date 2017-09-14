package gameZones;
import java.util.Scanner;
public class MadLibs {

	public static void main(String[] args) 
	{
		
		String color;
		String wordEst;
		String bodyPartPlurral;
		String anAnimal;
		String aNoun;
		String PluralNoun; 
		
		int a, b, c;
		c = a - b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a color>>>");
		color = input.nextLine();
		System.out.println("Enter a word ending in EST");
		wordEst = input.nextLine();
		System.out.println("Enter a Body part Plural ");
		bodyPartPlurral = input.nextLine();
		System.out.println("Enter a Animal ");
		anAnimal = input.nextLine();
		System.out.println("Enter a noun");
		aNoun = input.nextLine();
		System.out.println("Enter a Plural Noun");
		PluralNoun = input.nextLine();
		System.out.println("Enter a number");
		a = input.nextInt();
		System.out.println("Enter another number");
		b = input.nextInt();
		c = a - b;
		
		System.out.println("the" + color +"Dragon is the"+ wordEst + "Dragon of all. It has "+ c);
		System.out.println(bodyPartPlurral + ", and a " + anAnimal + "shaped like a" + aNoun + ". "  );
		
		

		
		
		
	}

}

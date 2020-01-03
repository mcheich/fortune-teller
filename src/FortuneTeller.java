import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

	   
		//Inputs
		Scanner input = new Scanner(System.in);
		String firstName;
		String lastName;
		String favColor;
		int age;
		int birthMonth;
		int numSiblings;
		
		//First Name
		System.out.println("What is your First Name?");
		firstName = input.next();
		
		//First Last
		System.out.println("What is your Last Name?");
		lastName = input.next();
		
		//Age
		System.out.println("What is your age?");
		age = input.nextInt();
		
		//Birth Month
		System.out.println("What is your Birth month (1-12)?");
		birthMonth = input.nextInt();

		//Favorite Color
		System.out.println("What is your favorite color in ROYGBIV?\n "
				+ "type \"help\" if you need a list for ROYGBIV colors");
		
		favColor = input.next();
		
		if(favColor.equalsIgnoreCase("help")) {
			System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
			favColor = input.next();
		}
		System.out.println(favColor + " is a nice color");
		
		
		//Number of siblings
		System.out.println("How many siblings do you have? " );
		numSiblings = input.nextInt();
		
		int retireAge = 14;
		// Check if age is even
		if (age % 2 == 0) {
			retireAge = 12;
			System.out.println(retireAge);
		}

		double bankBalance = 0;
		if (birthMonth < 5) {
			bankBalance = 256000.76;
		} else if (birthMonth < 9) {

			bankBalance = 3687105.42;
		}
		
		//Testing
	}

}

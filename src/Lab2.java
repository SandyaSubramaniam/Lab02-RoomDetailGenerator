import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		char userchoice = 'y';

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		do {
			System.out.println("Enter Length: ");
			double length = scnr.nextDouble();

			System.out.println("Enter Width: ");
			double width = scnr.nextDouble();

			System.out.println("Enter Height: ");
			double height = scnr.nextDouble();

			System.out.println("Area: " + (length * width));

			System.out.println("Perimeter: " + 2 * (length + width));

			System.out.println("Volume: " + (length * width * height));

			System.out.println("");

			System.out.println("Continue?(y/n)");

			userchoice = scnr.next().charAt(0);

			System.out.println("");

		} while (userchoice == 'y' || userchoice == 'Y');

		System.out.println("Goodbye");
		scnr.close();
	}
}

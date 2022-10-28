import java.util.Scanner;

/*
 * Written by Aaron King
 */
public class PBJFrontEnd {
	private static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("-----------------------------------\nWelcome to the PBJ Sandwich Maker!\n-----------------------------------");
		System.out.println("\n-----Sandwich 1-----\nTop Slice of Bread Information\nEnter name of the bread");
		String aN = keyboard.nextLine();
		System.out.println("\nEnter the number of Calories");
		Double sC = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("\nEnter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
		String aT = keyboard.nextLine();
		Bread tS = new Bread(aN, aT, sC);
			System.out.println("\nPeanut Butter Information\nEnter name of the peanut butter");
			aN = keyboard.nextLine();
			System.out.println("\nEnter the number of Calories");
			sC = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println("\nIs it crunchy? Enter \"True\" or \"False\"");
			Boolean aC = keyboard.nextBoolean();
			keyboard.nextLine();
			PeanutButter pb = new PeanutButter(aN, aC, sC);
		System.out.println("\nJelly Information\nEnter name of the jelly");
		aN = keyboard.nextLine();
		System.out.println("\nEnter the number of Calories");
		sC = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("\nEnter the type of jelly. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\"");
		aT = keyboard.nextLine();
		Jelly jel = new Jelly(aN, aT, sC);
			System.out.println("\nBottom Slice of Bread Information\nEnter name of the bread");
			aN = keyboard.nextLine();
			System.out.println("\nEnter the number of Calories");
			sC = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println("\nEnter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
			aT = keyboard.nextLine();
			Bread bS = new Bread(aN, aT, sC);
		PBJSandwich SandwichOne = new PBJSandwich(tS, pb, jel, bS);
		
		
		System.out.println("\n-----Sandwich 2-----\nTop Slice of Bread Information\nEnter name of the bread");
		aN = keyboard.nextLine();
		System.out.println("\nEnter the number of Calories");
		sC = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("\nEnter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
		aT = keyboard.nextLine();
		Bread tS2 = new Bread(aN, aT, sC);
			System.out.println("\nPeanut Butter Information\nEnter name of the peanut butter");
			aN = keyboard.nextLine();
			System.out.println("\nEnter the number of Calories");
			sC = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println("\nIs it crunchy? Enter \"True\" or \"False\"");
			aC = keyboard.nextBoolean();
			keyboard.nextLine();
			PeanutButter pb2 = new PeanutButter(aN, aC, sC);
		System.out.println("\nJelly Information\nEnter name of the jelly");
		aN = keyboard.nextLine();
		System.out.println("\nEnter the number of Calories");
		sC = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("\nEnter the type of jelly. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\"");
		aT = keyboard.nextLine();
		Jelly jel2 = new Jelly(aN, aT, sC);
			System.out.println("\nBottom Slice of Bread Information\nEnter name of the bread");
			aN = keyboard.nextLine();
			System.out.println("\nEnter the number of Calories");
			sC = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println("\nEnter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"\n");
			aT = keyboard.nextLine();
			Bread bS2 = new Bread(aN, aT, sC);
		PBJSandwich SandwichTwo = new PBJSandwich(tS2, pb2, jel2, bS2);
		
		System.out.println("\n\n-----Sandwich 1-----\n");
		System.out.print(SandwichOne.toString(SandwichOne));
		System.out.println("\n\n-----Sandwich 2-----\n");
		System.out.print(SandwichTwo.toString(SandwichTwo));
		System.out.println("\n\nAre they the same sandwich?\n");
		System.out.print(SandwichOne.equals(SandwichTwo));
	}

}

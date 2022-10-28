import java.util.Scanner;
public class CoffeeTester {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Let’s Coffee!!!1!11!!ONE!!!1!");
		System.out.println("\nWhat's the name of the first coffee?");
		String nameOne = keyboard.nextLine();
		System.out.println("What's the caffeine content?");
		double caffeineOne = keyboard.nextDouble();
		keyboard.nextLine();

		System.out.println("\nWhat's the name of the second coffee?");
		String nameTwo = keyboard.nextLine();
		System.out.println("What's the caffeine content?");
		double caffeineTwo = keyboard.nextDouble();
		keyboard.nextLine();

		
		Coffee coffeeOne = new Coffee(nameOne, caffeineOne);
		Coffee coffeeTwo = new Coffee(nameTwo, caffeineTwo);
		System.out.println("It would take "+coffeeOne.riskyAmount(coffeeOne)+" "+coffeeOne.getName()+" coffees before it's dangerous to drink more.");
		System.out.println("It would take "+coffeeTwo.riskyAmount(coffeeTwo)+" "+coffeeTwo.getName()+" coffees before it's dangerous to drink more.");
		
		
	}

}

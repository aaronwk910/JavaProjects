/*
 * Written by Aaron King
 */
import java.util.Scanner;
import java.util.Random;
public class DiceRoll {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Enter the number of times a 6-sided die should be rolled.");
		int rolls = keyboard.nextInt();
		if(rolls <= 0)
		{
			System.out.println("That is not valid.");
			System.exit(0);
		}
		int ones, twos, threes, fours, fives, sixes;
		ones = twos = threes = fours = fives = sixes = 0;
		int count = 0;
		while (count < rolls)
		{
			int number = r.nextInt(6)+1;
			if (number == 1)
			{
				ones++;
			}
			else if (number == 2)
			{
				twos++;
			}
			else if (number == 3)
			{
				threes++;
			}
			else if (number == 4)
			{
				fours++;
			}
			else if (number == 5)
			{
				fives++;
			}
			else
			{
				sixes++;
			}
			System.out.println(number+" was rolled");
			count++;
		}
		System.out.println("One: "+ones);
		System.out.println("Two: "+twos);
		System.out.println("Three: "+threes);
		System.out.println("Four: "+fours);
		System.out.println("Five: "+fives);
		System.out.println("Six: "+sixes);
	}

}

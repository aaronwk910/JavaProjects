/*
 * Written by Aaron King
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
	String playerChoice = new String();
	String playAgain = new String();
	Scanner keyboard = new Scanner(System.in);
	Random r = new Random ();
	int play = 1;
	System.out.println("Welcome to the game! It's a best of three between you and the computer, with good ol\' normal rock, paper, scissors rules. Good luck!");
	while(play == 1)
		{
			int count = 0;
			int compWins = 0;
			int playerWins = 0;
			while(count < 3)
			{
				System.out.println("Enter \"rock\", \"paper\", or \"scissors\".");
				playerChoice = keyboard.nextLine();
				int compChoice = r.nextInt(3);//this is the computers choice of rock(0), paper(1), or scissors(2)
				if (compChoice == 0)
				{
					if (playerChoice.equalsIgnoreCase("rock"))
					{
						System.out.println("The computer chose rock! It's a draw!");
					}
					else if (playerChoice.equalsIgnoreCase("paper"))
					{
						System.out.println("The computer chose rock! You win this round!");
						playerWins++;
					}
					else if (playerChoice.equalsIgnoreCase("scissors"))
					{
						System.out.println("The computer chose rock! You lose this round!");
						compWins++;
					}
					else
					{
						System.out.println("That response is invalid. You lose this round.");
						compWins++;
					}
				}
				else if (compChoice == 1)
				{
					if (playerChoice.equalsIgnoreCase("rock"))
					{
						System.out.println("The computer chose paper! You lose this round!");
						compWins++;
					}
					else if (playerChoice.equalsIgnoreCase("paper"))
					{
						System.out.println("The computer chose paper! It's a draw!");
					}
					else if (playerChoice.equalsIgnoreCase("scissors"))
					{
						System.out.println("The computer chose paper! You win this round!");
						playerWins++;
					}
					else
					{
						System.out.println("That response is invalid. You lose this round.");
						compWins++;
					}
				}
				else
				{
					if (playerChoice.equalsIgnoreCase("rock"))
					{
						System.out.println("The computer chose scissors! You win this round!");
						playerWins++;
					}
					else if (playerChoice.equalsIgnoreCase("paper"))
					{
						System.out.println("The computer chose scissors! You lose this round!");
						compWins++;
					}
					else if (playerChoice.equalsIgnoreCase("scissors"))
					{
						System.out.println("The computer chose scissors! It's a draw!");
					}
					else
					{
						System.out.println("That response is invalid. You lose this round.");
						compWins++;
					}
				}
						if (count == 0)
							{
								System.out.println("That's the end of round one! Get ready for round 2!");
								count++;
							}
						else if (count == 1)
							{
								System.out.println("That's the end of round two! Get ready for the final round!");
								count++;
							}
						else
							{
								System.out.println("That's the end of the game!");
								count++;
							}
			}
			
		if(playerWins > compWins)
		{
			System.out.println("\nCongratulations! You win!");
		}
		else if(compWins > playerWins)
		{
			System.out.println("\nSorry! The computer wins!");
		}
		else
		{
			System.out.println("\nSorry! You tied! The game is a draw!");
		}
		System.out.println("\nIf you would like to play again, type \"yes\". If not, type \"no\".");
		playAgain = keyboard.nextLine();
			if (playAgain.equalsIgnoreCase("yes"))
			{
				System.out.println("Here we go!");
				play = 1;
			}
			else if (playAgain.equalsIgnoreCase("no"))
			{
				System.out.println("Okay, thanks for playing!");
				play = 0;
			}
			else
			{
				System.out.println("That response is invalid. The game will end now.");
				play = 0;
			}
		}


	}

}

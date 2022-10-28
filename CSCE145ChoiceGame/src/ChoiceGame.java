/*
 * Written by Aaron King
 */

import java.util.Scanner;
import java.util.Random;
public class ChoiceGame {


	public static void main(String[] args) {
	String weapon = new String();
	String choiceOne = new String();
	String choiceTwo = new String();
	String choiceThree = new String();
	Scanner keyboard = new Scanner(System.in);
	Random r = new Random();
	System.out.println("You wake up to the feeling of your face in the sand. Are you at the beach? You open your eyes to find yourself in an arena, surrounded by spectators. You struggle to your feet, only to see before you a giant orc. To your right you notice a table, atop which is a bow with one arrow and a set of daggers. To your left, you notice a rock with a glowing sword sticking out of it. You figure you should grab a weapon. What do you grab? Enter \"Bow\", \"Daggers\", or \"Excalibur\".");
	weapon = keyboard.nextLine();
	if (weapon.equalsIgnoreCase("bow"))
		{
			System.out.println("You grab the bow. It feels good in your hands... but you only have arrow. Where do you aim? Enter \"head\" or \"chest\"");
			choiceOne = keyboard.nextLine();
			if (choiceOne.equalsIgnoreCase("head"))
			{
				System.out.println("You aim at the orc's head and fire. He catches the arrow inches from his ugly face, breaks it in half, and splits you in half with his axe.");
			}
			else if (choiceOne.equalsIgnoreCase("chest"))
			{
				System.out.println("You aim at the orc's chest and fire. The arrow lodges itself into his chest and he stops. He looks angry but far from dead. Do you charge him or reach for another weapon? Enter \"charge\" or \"reach\".");
				choiceTwo = keyboard.nextLine();
				if (choiceTwo.equalsIgnoreCase("charge"))
				{
					System.out.println("You charge the orc as he stands still. You pull the arrow from his chest and proceed to stab him in the eye with it. He lets out a scream and falls. Congratulations, you lived.");
				}
				else if (choiceTwo.equalsIgnoreCase("reach"))
				{
					System.out.println("You reach for another weapon, only to hear a strange noise. You turn your head to see the orc's axe flying through the air. It severs your arm before you can grab a weapon. You bleed out in the sand.");
				}
				else
				{
					System.out.println("Thats invalid. Your indecisiveness gets you cut in half. Next time think clearly.");
				}
			}
			else
			{
				System.out.println("That input is invalid. You took too long to aim and the Orc cuts you in half.");
			}
		}
	else if (weapon.equalsIgnoreCase("excalibur"))
		{
			System.out.println("You pull on excalibur, but it won't budge. Do you try again or reach for another weapon? Enter \"try\" or \"reach\".");
			choiceOne = keyboard.nextLine();
			int luck = r.nextInt(100)+1;
			int doubt = r.nextInt(100)+1;
			if (choiceOne.equalsIgnoreCase("try"))
			{
				if (luck >=80 || doubt < 20)
				{
					System.out.println("You are the chosen one. Against all odds, Excalibur slides from the rock like a hot knife slides through butter. The crowd is shocked, and the orc bows before his new overlord. The gods have chosen you.");
				}
				else
				{
					System.out.println("You are not the chosen one it seems. Excalibur won't budge. As you struggle, the orc approaches from behind and cuts you in half. At least your death was quick.");
				}
			}
			else if (choiceOne.equalsIgnoreCase("reach"))
			{
				System.out.println("Just as you make it back to the table, the Orc's axe makes it to the back of your neck. You die a quick but gruesome death.");
			}
			else
			{
				System.out.println("Thats invalid, and you're out of time. The Orc reachest you as you sit indecisively, grabbing your head and smashing it on the hilt of the sword. You'll never get excalibur off your mind now, thats for sure.");
			}
		}
	else if (weapon.equalsIgnoreCase("Daggers"))
		{
			System.out.println("You grab the daggers. You know you have to be quick. Do you rush the Orc or throw the daggers at him? Enter \"throw\" or \"rush\".");
			choiceOne = keyboard.nextLine();
			if (choiceOne.equalsIgnoreCase("throw"))
			{
				System.out.println("You throw your daggers at the Orc and they miss. The orc charges you and cuts you in half in one swing.");
			}
			else if (choiceOne.equalsIgnoreCase("rush"))
			{
				System.out.println("You rush the Orc. He seems startled. Do you leap at him or slide between his legs? Enter \"slide\" or \"leap\".");
				choiceTwo = keyboard.nextLine();
				if (choiceTwo.equalsIgnoreCase("leap"))
				{
					System.out.println("You are flying toward the Orc. Do you stab him or kick him in the face? Enter \"stab\" or \"kick\".");
					choiceThree = keyboard.nextLine();
					if (choiceThree.equalsIgnoreCase("stab"))
					{
						System.out.println("The Orc catches you in mid air by your face and slams you into the ground. You die instantly.");
					}
					else if (choiceThree.equalsIgnoreCase("kick"))
					{
						System.out.println("The Orc catches you by the leg and rips it off. You bleed out in the sand.");
					}
					else
					{
						System.out.println("That is invalid and the Orc grabs you by the neck out of the air and slams you into the dirt. You die instantly.");
					}
				}
				else if (choiceTwo.equalsIgnoreCase("slide"))
				{
					System.out.println("You slide under the Orc's legs. Do you slice or stab him as you pass underneath? Enter \"slice\" or \"stab\".");
					choiceThree = keyboard.nextLine();
					if (choiceThree.equalsIgnoreCase("slice"))
					{
						System.out.println("You slice the achilles of the Orc as you pass beneath him. You then nimbly hop to your feet, jump on his back, and cut his head off. Congratulations, you survived");
					}
					else if (choiceThree.equalsIgnoreCase("stab"))
					{
						System.out.println("You stab the Orc in the back of his knees as you pass under him. He falls to his knees, and you cannot pull the daggers back out in time. Unarmed, you break the Orc's neck from behind. Congratulations, you survived.");
					}
					else
					{
						System.out.println("That input is invalid. You slide harmlessly underneath the Orc. He turns around and cuts you in half on the ground.");
					}
				}
				else
				{
					System.out.println("That input is invalid. You run into the Orc and fall down. While startled, he still cuts you in half.");
				}
			}
			else
			{
				System.out.println("That input is invalid. The Orc rushes you while you sit indecisive and he tramples you");
			}
		}
	else
	{
		System.out.println("That input is invalid. With no weapon, you are an easy target for the Orc. He gives it his best swing and you fall in two pieces on the sandy floor.");
	}

	}
}
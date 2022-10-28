/*
 * Written by Aaron King
 */
import java.util.Scanner;
public class TacoSorter {
	
	public static void main(String[] args) {
	System.out.println("Welcome to the taco price sorter! Enter 10 taco names and prices and I'll sort it!");
	Scanner keyboard = new Scanner(System.in);
	int size = 10;
	String [] name = new String [size];
	Double [] price = new Double [size];
	
	// Populating the arrays
	for (int i=0;i<size;i++)
	{
		System.out.println("Enter the name of taco "+(i+1));
		name [i] = keyboard.nextLine();
		System.out.println("Enter taco's price");
		price [i] = keyboard.nextDouble();
		keyboard.nextLine();
	}
	
	// Sorting the arrays
	for (int i=0;i<size;i++)
	{
		double lowPrice = price [i];
		String nameChange = name [i];
		int index = 0;
		for (int j=i+1;j<size;j++)
		{
			if (price [j] < lowPrice)
			{
				lowPrice = price [j];
				nameChange = name [j];
				index = j;
			}
		}
		if (lowPrice != price [i])
		{
			double temp = price [i];
			String temp2 = name [i];
			price [i] = lowPrice;
			name [i] = nameChange;
			price[index] = temp;
			name[index] = temp2;
				
		}

	}
	System.out.println("\nSorted Tacos are");
	for (int k=0;k<size;k++)
	{
		System.out.println(name[k]+" "+price[k]);
	}
	
	
	
	
	
	
	
	}

}

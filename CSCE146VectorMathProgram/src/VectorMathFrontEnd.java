import java.util.Scanner;
public class VectorMathFrontEnd 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Vector Operations Program!");
		
		boolean quit;
		quit = false;
		while(!quit)
		{
			System.out.println("\nEnter 1. To Add 2 Vectors\nEnter 2. To Subtract 2 Vectors\nEnter 3. To Find the Magnitude of a Vector\nEnter 9. To Quit");
			int choice = keyboard.nextInt();
			bodyOne:
			if (choice == 1 || choice == 2)
					{
						System.out.println("Enter the size of the Vectors");
						int size = keyboard.nextInt();
						if (size<=0)
							System.out.println("Invalid Size");
						if (size<=0)
							break bodyOne;
						System.out.println("Enter the values for Vector 1");
						double[] arrayOne = new double[size];
						double[] arrayTwo = new double[size];
						double[] answer = new double[size];
						for(int i=0;i<size;i++)
							arrayOne[i] = keyboard.nextDouble();
						System.out.println("Enter the values for Vector 2");
						for(int i=0;i<size;i++)
							arrayTwo[i] = keyboard.nextDouble();
						
						if (choice == 1)
						{
							for(int i=0;i<size;i++)
								answer[i] = arrayOne[i]+arrayTwo[i];
							System.out.println("Result:");
							for(int i=0;i<size;i++)
								System.out.println(arrayOne[i]+"\n");
							System.out.println("+\n");
							for(int i=0;i<size;i++)
								System.out.println(arrayTwo[i]+"\n");
							System.out.println("=\n");
							for(int i=0;i<size;i++)
								System.out.println(answer[i]+"\n");
						}
						if (choice == 2)
						{
							for(int i=0;i<size;i++)
								answer[i] = arrayOne[i]-arrayTwo[i];
							System.out.println("Result:");
							for(int i=0;i<size;i++)
								System.out.println(arrayOne[i]+"\n");
							System.out.println("-\n");
							for(int i=0;i<size;i++)
								System.out.println(arrayTwo[i]+"\n");
							System.out.println("=\n");
							for(int i=0;i<size;i++)
								System.out.print(answer[i]+"\n");
						}

					}
			else if (choice == 3)
			{
				System.out.println("Enter the size of the Vector");
				int size = keyboard.nextInt();
				if (size <= 0)
					System.out.println("Invalid Size");
				if (size<=0)
					break bodyOne;
					
				double[] tempArray = new double[size];
				System.out.println("Enter the values for the Vector");
				double answer = 0;
				for (int i=0;i<size;i++)
					tempArray[i] = keyboard.nextDouble();
				for(int i=0;i<size;i++)
				{
					answer = tempArray[i]*tempArray[i] + answer;
				}
				double finalAnswer = java.lang.Math.sqrt(answer);
				System.out.println("The magnitude is "+finalAnswer);
				
			}
			else if (choice == 9)
			{
				quit = true;
				System.out.println("Goodbye!");
				keyboard.close();
			}
			else
				System.out.println("Invalid choice!");
		}

	}

}

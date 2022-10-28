/*
 * Written by Aaron King
 */
import java.util.*;
import java.io.*;
public class shapeTree 
{
	String filename = "shapeFile.txt";
	LinkedBST<Shape> shapetree = new LinkedBST<Shape>();
	
	public void populateTree()
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(filename));
			while(fileScanner.hasNextLine())
			{
				String currLine = fileScanner.nextLine();
				String[] splitLine = currLine.split("\t");
				if(splitLine[0].equalsIgnoreCase("right triangle"))
				{
					double area = ((Double.parseDouble(splitLine[1])*Double.parseDouble(splitLine[2]))/2);
					Shape newshape = new Shape("Triangle", area);
					shapetree.add(newshape);
					System.out.println(currLine);
				}
				else if(splitLine[0].equalsIgnoreCase("circle"))
				{
					double area = (3.14159 * Double.parseDouble(splitLine[1]) * Double.parseDouble(splitLine[1]));
					Shape newshape = new Shape("Circle", area);
					shapetree.add(newshape);
					System.out.println(currLine);
				}
				else if(splitLine[0].equalsIgnoreCase("Rectangle"))
				{
					double area = (Double.parseDouble(splitLine[1])*Double.parseDouble(splitLine[2]));
					Shape newshape = new Shape("Rectangle", area);
					shapetree.add(newshape);
					System.out.println(currLine);
				}
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void removeAreasGreaterThan(double aDouble)
	{
		Shape s = new Shape("Circle", aDouble);
		shapetree.add(s);
		shapetree.removeGreaterThan(s);
		shapetree.remove(s);
	}
	public void maxArea()
	{
		shapetree.maxArea();
	}
	
}

/*
 * Written by Aaron King
 */
public class shapeTreeFE {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Shape Tree Tester!\nReading from file!");
		shapeTree N = new shapeTree();
		N.populateTree();
		System.out.println("\nPrinting pre-order");
		N.shapetree.printPreorder();
		System.out.println("\nPrinting in-order");
		N.shapetree.printInorder();
		System.out.println("\nPrinting in post-order");
		N.shapetree.printPostorder();
		N.maxArea();
		System.out.println("\nDeleting rectangle with Area 14.0");
		Shape a = new Shape("Rectangle", 14.0);
		N.shapetree.remove(a);
		System.out.println("Printing in-order");
		N.shapetree.printInorder();
		System.out.println("\nDeleting values larger than 30");
		N.removeAreasGreaterThan(30.0);
		N.shapetree.printInorder();

	}

}

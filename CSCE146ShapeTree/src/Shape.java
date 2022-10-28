/*
 * Written by Aaron King
 */
public class Shape implements Comparable<Shape>
{
	private double area;
	private String type;
	public Shape()
	{
	this.type = "Triangle";
	this.area = 0.0;
	}
	public Shape(String aT, double aA)
	{
		this.setType(aT);
		this.setArea(aA);
	}
	public double getArea()
	{
		return this.area;
	}
	public String getType()
	{
		return this.type;
	}
	public void setArea(double aA)
	{
		if(aA >= 0)
			this.area = aA;
		else 
			this.area = 0;
	}
	public void setType(String aT)
	{
		if(aT.equalsIgnoreCase("Triangle")|| aT.equalsIgnoreCase("Rectangle")|| aT.equalsIgnoreCase("Circle"))
			this.type = aT;
		else
			this.type = "noShape";
			
	}
	public String toString()
	{
		return this.getType()+ ", Area: " +this.getArea();
	}
	public int compareTo(Shape aShape)
	{
		if(aShape == null)
			return -1;
		if(this.area < aShape.getArea())
				return -1;
		else if(this.area > aShape.getArea())
				return 1;
		else
			return this.type.compareTo(aShape.getType());
	}
	public void print()
	{
		System.out.println(this.type +" " +this.area);
	}
}

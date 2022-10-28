/*
 * Written by Aaron King
 */
public class Jelly {

	private String name;
	private Double calories;
	private String fruitType;
	
	public Jelly()
	{
		this.name = "Smuckers";
		this.fruitType = "Strawberry";
		this.calories = 50.0;
	}
	public Jelly(String aN, String aT, Double sC)
	{
		this.setName(aN);
		this.setType(aT);
		this.setCalories(sC);
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getType()
	{
		return this.fruitType;
	}
	public Double getCalories()
	{
		return this.calories;
	}
	
	public void setName(String aN)
	{
		if (aN != null)
			this.name = aN;
	}
	public void setType(String aT)
	{
		if (aT != null &&
				(aT.equalsIgnoreCase("Apple") ||
						 aT.equalsIgnoreCase("Blueberry") ||
						 aT.equalsIgnoreCase("Grape") ||
						 aT.equalsIgnoreCase("Strawberry") ||
						 aT.equalsIgnoreCase("Tomato")))
		this.fruitType = aT;
	}
	public void setCalories(Double sC)
	{
		if(sC >= 50 && sC <= 200)
		{
			this.calories = sC;
		}
	}
	
	public boolean equals(Jelly sJ)
	{
		return sJ != null &&
				this.fruitType.equals(sJ.getType()) &&
				this.name == sJ.getName() &&
				this.calories == sJ.getCalories();
	}
	public String toString(Jelly sJ)
	{
		return("\nName: "+this.name+"\nType: "+this.fruitType+"\nCalories: "+this.calories);
	}
}

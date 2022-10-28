/*
 * Written by Aaron King
 */
public class Bread {
	
	private String type;
	private String name;
	private Double calories;
	
	public Bread()
	{
		this.type = "White";
		this.name = "Generic";
		this.calories = 150.0;
	}
	
	public Bread(String aN, String aT, Double sC)
	{
		this.setType(aT);
		this.setName(aN);
		this.setCalories(sC);
	}
	
	public String getType()
	{
		return this.type;
	}
	public String getName()
	{
		return this.name;
	}
	public Double getCalories()
	{
		return this.calories;
	}
	
	public void setType(String aT)
	{
		if(aT != null &&
				(aT.equalsIgnoreCase("Honey Wheat") ||
				 aT.equalsIgnoreCase("White") ||
				 aT.equalsIgnoreCase("Whole Wheat") ||
				 aT.equalsIgnoreCase("Whole Grain")))
		{
			this.type = aT;
		}
	}
	public void setName(String aN)
	{
		if(aN != null)
			this.name = aN;
	}
	public void setCalories(Double sC)
	{
		if(sC >= 50 && sC <= 250)
		{
			this.calories = sC;
		}
	}
	
	public boolean equals(Bread sB)
	{
		return sB != null &&
				this.type.equals(sB.getType()) &&
				this.name == sB.getName() &&
				this.calories == sB.getCalories();
	}
	public String toString(Bread sB)
	{
		return("\nName: "+this.name+"\nType: "+this.type+"\nCalories: "+this.calories);
	}
	
}

/*
 * Written by Aaron King
 */
public class PeanutButter {

	private String name;
	private boolean isCrunchy;
	private Double calories;
	
	public PeanutButter()
	{
		this.name = "Skippy";
		this.isCrunchy = false;
		this.calories = 100.0;
	}
	public PeanutButter(String aN, Boolean aC, Double sC)
	{
		this.setName(aN);
		this.setTexture(aC);
		this.setCalories(sC);
	}
	
	public String getName()
	{
		return this.name;
	}
	public Boolean getTexture()
	{
		return this.isCrunchy;
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
	public void setTexture(boolean aC)
	{
		this.isCrunchy = aC;
	}
	public void setCalories(Double sC)
	{
		if(sC >= 100 && sC <= 300)
		{
			this.calories = sC;
		}
	}
	
	public boolean equals(PeanutButter pB)
	{
		return pB != null &&
				this.isCrunchy == (pB.getTexture()) &&
				this.name == pB.getName() &&
				this.calories == pB.getCalories();
	}
	public String toString(PeanutButter pB)
	{
		return("\nName: "+this.name+"\nCrunchy?: "+this.isCrunchy+"\nCalories: "+this.calories);
	}
}

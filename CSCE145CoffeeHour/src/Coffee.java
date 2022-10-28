/*
 * Written by Aaron King
 */
public class Coffee {
	
	private String name;
	private double caffeine;
	
	public Coffee()
	{
		this.name = "Decaf";
		this.caffeine = 0.0;
	}
	
	public Coffee(String cN, double cC)
	{
		this.setName(cN);
		this.setCaffeine(cC);
	}
	
	public String getName()
	{
		return this.name;
	}
	public double getCaffeine()
	{
		return this.caffeine;
	}
	public void setName(String cN)
	{
		if (cN != null)
		{
			this.name = cN;
		}
	}
	public void setCaffeine(double cC)
	{
		if(cC <= 300 && cC >= 50)
		{
			this.caffeine = cC;
		}
		else
		{
			this.caffeine = 0.0;
		}
	}
	public String toString() 
	{
		return "Name: "+this.name+"Caffeine Content: "+this.caffeine;
	}
	public boolean equals(Coffee aC)
	{
		return this.name.equalsIgnoreCase(aC.getName()) &&
				this.caffeine == (aC.getCaffeine());
	}
	public double riskyAmount(Coffee aC)
	{
		return (180/((this.caffeine/100.0)*6));
	}
}

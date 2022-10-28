/*
 * Written by Aaron King
 */
public class PBJSandwich {
	public Bread TopSlice;
	public PeanutButter PeanutButter;
	public Jelly Jelly;
	public Bread BottomSlice;
	Bread generic = new Bread();
	PeanutButter basic = new PeanutButter();
	Jelly normal = new Jelly();
	

	public PBJSandwich()
	{
		this.TopSlice = generic;
		this.PeanutButter = basic;
		this.Jelly = normal;
		this.BottomSlice = generic;
	}
	
	public PBJSandwich(Bread tS, PeanutButter pb, Jelly jel, Bread bS)
	{
		this.setBotSlice(bS);
		this.setJelly(jel);
		this.setPeanutButter(pb);
		this.setTopSlice(tS);
	}
	
	public Bread getTopSlice()
	{
		return this.TopSlice;
	}
	public PeanutButter getPeanutButter()
	{
		return this.PeanutButter;
	}
	public Jelly getJelly()
	{
		return this.Jelly;
	}
	public Bread getBotSlice()
	{
		return this.BottomSlice;
	}
	
	public void setTopSlice(Bread tS)
	{
		this.TopSlice = tS;
	}
	public void setPeanutButter(PeanutButter pb)
	{
		this.PeanutButter = pb;
	}
	public void setJelly(Jelly jel)
	{
		this.Jelly = jel;
	}
	public void setBotSlice(Bread bS)
	{
		this.BottomSlice = bS;
	}
	
	public boolean equals(PBJSandwich s1)
	{
		return s1 != null &&
				this.TopSlice == s1.getTopSlice() &&
				this.BottomSlice == s1.getBotSlice() &&
				this.Jelly == s1.getJelly() &&
				this.PeanutButter == s1.getPeanutButter();
	}
	public String toString(PBJSandwich s1)
	{
		return("\nTop Slice: "+this.TopSlice.toString(this.TopSlice)+ "\nPeanut Butter: "+this.PeanutButter.toString(this.PeanutButter)+"\nJelly: "+this.Jelly.toString(this.Jelly)+"\nBottom Slice: "+this.BottomSlice.toString(this.BottomSlice));
	}
}

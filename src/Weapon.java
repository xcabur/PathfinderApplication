
public class Weapon
{
	private String name = "";
	private int diceType = 0;
	private int numDice = 0;
	private int critRange = 21;
	private int critMulti = 0;
	
	public Weapon(String name, int diceType, int numDice, int critRange, int critMulti)
	{
		this.name=name;
		this.diceType=diceType;
		this.numDice=numDice;
		this.critRange=critRange;
		this.critMulti=critMulti;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getDiceType()
	{
		return diceType;
	}
	
	public int getNumDice()
	{
		return numDice;
	}
	
	public int getCritRange()
	{
		return critRange;
	}
	
	public int getCritMulti()
	{
		return critMulti;
	}
}

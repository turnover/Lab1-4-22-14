
public class RandomNumber1 
{
	public int computerNum1;
	public int GetANumber(int high)
	{
		computerNum1 = 1 + (int) (Math.random()*high);
		return computerNum1;
	}
	public int GetANumber()
	{
		computerNum1 = 1 + (int) (Math.random()*10);
		return computerNum1;
	}
	public int GetANumber(int high, int low)
	{
		computerNum1 = low + (int) (Math.random()*high);
		return computerNum1;
	}
}



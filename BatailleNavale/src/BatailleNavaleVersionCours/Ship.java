package BatailleNavaleVersionCours;

public abstract class Ship 
{
	private boolean isTouch;
	private boolean isPlouf;
	
	public Ship()
	{
		this.isTouch=false;
		this.isPlouf=false;
	}
	
	public void ShipTouch()
	{
		this.isTouch=true;
	}
	
	public void ShipPlouf()
	{
		this.isPlouf=true;
	}
	
	/*public boolean contient(int x, int y)
	{
		
	}*/
}

package ApplicationBattleship;

/**
 * Class to create type ships
 * @author CAYRE Laure and LAURENT Maud
 *
 */
public class Ship {
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
}

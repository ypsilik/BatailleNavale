package ApplicationBattleship;

/**
 * Class to create type ships
 * @author CAYRE Laure and LAURENT Maud
 *
 */
public abstract class Ship 
{
	private boolean isTouch;
	private boolean isPlouf;
	private int size;
	private ShipsTypes ShipsType;
	private Position posiShip;
	public Ship(ShipsTypes ShipType, int shipSize)
	{
		this.size = shipSize;
		this.ShipsType = ShipType;
		this.isTouch=false;
		this.isPlouf=false;
	}
	
	public boolean ShipTouch(Position posiShoot)
	{
		if (posiShoot == posiShip) return true;
		else return false ;
	}
	
	public void ShipPlouf()
	{
		this.isPlouf=true;
	}
	
}

package ApplicationBattleship;

/**
 * Class to create type ships
 * @author CAYRE Laure and LAURENT Maud
 *
 */
public class Ship {
	private boolean isTouch;
	private boolean isPlouf;
	private int shipSize;
	private ShipsTypes shipType;
	private Position shipPosi;
	
	public Ship(ShipsTypes shiptypes, int size)
	{
		this.shipType = shiptypes;
		this.shipSize = size;
		this.isTouch=false;
		this.isPlouf=false;
	}
	
	public boolean ShipTouch(Position posi)
	{
		if (posi == shipPosi) return true;
		else return false;
	}
	
}

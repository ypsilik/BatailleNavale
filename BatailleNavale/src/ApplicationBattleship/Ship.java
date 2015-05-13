package ApplicationBattleship;

/**
 * Class to create type ships
 * @author CAYRE Laure and LAURENT Maud
 *
 */

public class Ship 
{
	private static final ShipsTypes TORPEDO = null;
	/*private final String IS_TOUCH="X";
	private final String IS_NOT_TOUCH="O";*/
	private int size;
	private ShipsTypes ShipsType;
	private Position posiShip;
	
	int cptTorpedo, cptSubmarineN1, cptSubmarineN2, cptCruiser, cptAircraft = 0;	
	
	public Ship(ShipsTypes ShipType, int shipSize)
	{
		this.size = shipSize;
		this.ShipsType = ShipType;
	}
	
	public Position Obtenir_posiship(Position posiship)
	{
		Position PosiShip = new Position(posiship.getX(), posiship.getY());
		return PosiShip;		
	}
	
	public Position Obtenir_posishoot(Position posishoot)
	{
		Position PosiShoot= new Position(posishoot.getX(), posishoot.getY());
		return PosiShoot;
	}
	
	public ShipsTypes GetShip(Position position)
	{
		if (position == this.posiShip) return ShipsType;
		else return null;
		
	}
	
	public boolean ShipTouch(Position posiShoot)
	{
		if (Obtenir_posiship(posiShip) == Obtenir_posishoot(posiShoot))
			{
			if (GetShip(posiShip) == ShipsTypes.TORPEDO) cptTorpedo ++;
			if (GetShip(posiShip) == ShipsTypes.CRUISER) cptCruiser ++;
			if (GetShip(posiShip) == ShipsTypes.SUBMARINEn1) cptSubmarineN1 ++;
			if (GetShip(posiShip) == ShipsTypes.SUBMARINEn2) cptSubmarineN2 ++;
			if (GetShip(posiShip) == ShipsTypes.AIRCRAFT_CARRIER) cptAircraft ++;
			return true;
			}
		else return false;
		
	}
	
	public boolean ShipPlouf()
	{
		if(cptTorpedo==2) return true;
		if(cptSubmarineN1==3) return true;
		if(cptSubmarineN2==3) return true;
		if(cptCruiser==4) return true;
		if(cptAircraft==5) return  true;
		else return false;
	}
	
}

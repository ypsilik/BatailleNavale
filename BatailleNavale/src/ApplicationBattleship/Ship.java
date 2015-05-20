package ApplicationBattleship;

public class Ship 
{
	/*private final String IS_TOUCH="X";
	private final String IS_NOT_TOUCH="O";*/
	private int size;
	private ShipsTypes ShipsType;
	private Position posiShip;
	
	int cptTorpedo, cptSubmarineN1, cptSubmarineN2, cptCruiser, cptAircraft = 0;	
	
	private String nom;
	//renvoie l'orientation du bateau, vrai si horizontale, faux si verticale//
	private boolean orientationHorizontale; 
	public Ship(ShipsTypes ShipType, int shipSize)
	{
		this.size = shipSize;
		this.ShipsType = ShipType;
	}
	
	//----------------------------------------------------------------------------//
	/**
     * Renvoie le nom du bateau.
     * @return nom du bateau.
     */
    public String getNom()
    {
        return this.nom;
    }
    
    /**
     * Renvoi l'orientation du bateau : vrai si horizontale, sinon verticale.
     * @return l'orientation du bateau.
     */
    public boolean getOrientation()
    {
        return this.orientationHorizontale;
    }
//-----------------------------------------------------------------------------------//   
	/**
	 * To get ship position
	 * @param posiship
	 * @return position of ship
	 */
	public Position Obtenir_posiship(Position posiship)
	{
		Position PosiShip = new Position(posiship.getX(), posiship.getY());
		return PosiShip;		
	}
	
	/**
	 * To get shoot position
	 * @param posishoot
	 * @return position of shoot
	 */
	public Position Obtenir_posishoot(Position posishoot)
	{
		Position PosiShoot= new Position(posishoot.getX(), posishoot.getY());
		return PosiShoot;
	}
	
	/**
	 * to get the ship position according to his type
	 * @param position
	 * @return type of ship at given position
	 */
	public ShipsTypes GetShip(Position position)
	{
		if (position == this.posiShip) return ShipsType;
		else return null;			
	}
	
	/**
	 * to know if a ship is touch
	 * @param posiShoot
	 * @return true if ship is touch / false is ship is not touch
	 */
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


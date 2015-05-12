package ApplicationBattleship;

/**
 * Class represent battleship game
 */
public class BattleshipGame
{
	/**
	 * private attribute for grid ship for Player 1
	 **/
	private Grid gridShipP1;
	/**
	 * private attribute for grid ship for Player 2**/
	 
	private Grid gridShipP2;
	/**
	 * private attribute for assault grid for Player 1**/
	 
	private Grid gridAssaultP1;
	/**
	 * private attribute for assault grid for Player 2**/
	 
	private Grid gridAssaultP2;
	
	/**
	 * Constructor battleship grids 
	 * @param gridP1 grid for player 1 with ships
	 * @param gridP2 grid for player 2 with ships
	 **/
	public BattleshipGame(Grid gridP1, Grid gridP2)
	{
		this.gridShipP1 = gridP1;
		gridP1.DisplayGrid();
		this.gridShipP2 = gridP2;
		gridP2.DisplayGrid();
		this.gridAssaultP1 = new Grid();
		this.gridAssaultP2 = new Grid();
		
	}	

	/**
	 * Play the game
	 **/
	public void play() {
		// TODO Auto-generated method stub
		
	}
}

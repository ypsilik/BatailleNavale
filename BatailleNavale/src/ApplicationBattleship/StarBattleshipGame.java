package ApplicationBattleship;
/**
 * Application to start Battleship (main)
 * @author CAYRE Laure and LAURENT Maud
 *
 */
public class StarBattleshipGame {
	
	/**
	 * Main for Battleship game
	 * @param args args
	 */
	public static void main(String[] args) 
	{
		Grid gridP1 = new Grid();
		Grid gridP2 = new Grid();
		new BattleshipGame(gridP1, gridP2).play();

		System.out.println(" ");
		
	}
	
}

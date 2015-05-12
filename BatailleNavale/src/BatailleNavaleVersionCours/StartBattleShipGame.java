package BatailleNavaleVersionCours;
import java.util.*;
/**
 * Application to start Battleship (main)
 * @author CAYRE Laure and LAURENT Maud
 *
 */
public class StartBattleShipGame
{
	/**
	 * Main for Battleship game
	 * @param args args
	 */
	public static void main(String[] args) 
	{
		/*Grid gridP1 = new Grid();
		Grid gridP2 = new Grid();
		new BattleshipGame(gridP1, gridP2).play();*/
		
		System.out.println("Vous allez commencer une partie de Bataille Navale");
		System.out.println("Vous êtes le Joueur1, Placez vos bateaux:");
		System.out.println("Placez le bateaux de 4 cases, le porte-avion: ");
		/*récupérer une valeur rentrée
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);*/
		/*afficher les grilles*/
		Grid gridP1=new Grid();
		Grid gridP2=new Grid();
		gridP1.DisplayGrid();
		gridP2.DisplayGrid();
		System.out.println(" ");
		
	}
	

}

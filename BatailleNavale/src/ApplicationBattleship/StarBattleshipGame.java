package ApplicationBattleship;
import java.util.*;
/**
 * Application to start Battleship (main)
 * @author CAYRE Laure and LAURENT Maud
 *
 */
public class StarBattleshipGame
{
	/**
	 * Main for Battleship game
	 * @param args args
	 */
	public static void main(String[] args) throws BadValue 
	{
		while (true)
		{
			try 
			{
				BattleshipGame.play("vous n'avez pas mis un bon chiffre");	
			}
			catch (BadValue e)
			{
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
	//	Grid gridP1 = new Grid();
	/*	Grid gridP2 = new Grid();
		new BattleshipGame(gridP1, gridP2).play();*/
		
		/*System.out.println("Vous allez commencer une partie de Bataille Navale");
		System.out.println("Vous êtes le Joueur1, Placez vos bateaux:");
		System.out.println("Placez le bateaux de 4 cases, le porte-avion: ");
		/*récupérer une valeur rentrée
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);*/
		/*afficher les grilles
		Grid gridP1=new Grid();
		System.out.println("Placez le bateaux de 5 cases, le porte-avion: ");
		for (int i=0; i<2; i++)
		{
			gridP1.DisplayGrid();
		}
		/*System.out.println("Placez le bateaux de 4 cases, le croiseur: ");
		System.out.println("Placez les bateaux de 3 cases, les sous-marins: ");
		
		System.out.println(" ");*/
}

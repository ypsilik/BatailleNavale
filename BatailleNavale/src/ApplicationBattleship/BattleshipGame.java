package ApplicationBattleship;

import java.util.Scanner;


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
		this.gridShipP2 = gridP2;
		this.gridAssaultP1 = new Grid();
		this.gridAssaultP2 = new Grid();
		
	}	

	/**
	 * Play the game
	 **/
	public static void play(String message) throws BadValue
		 {
			 int porteAvion=1;
			int croiseur=2;

				Scanner sc = new Scanner(System.in);
				System.out.println("Quel bateau voulez-vous placer?");
				System.out.format("%s le porte avion", porteAvion);
				System.out.println("\n");
				System.out.format("%s le croiseur \n", croiseur);
				int str= sc.nextInt();
				Grid gridP1=new Grid();
				if (str==1)
					{System.out.println("vous avez choisi le porte-Avion, 5 cases:");
					for (int i=0; i<2; i++)
					{
						gridP1.DisplayGrid();
					}
				}
				if (str==2)
				{
					System.out.println("Vous avez choisi le croiseur, 4 cases:");
					for (int i=0; i<4; i++)
					{
						gridP1.DisplayGrid();
					}
				}
				if (str>2)
					throw new BadValue("C'est pas bien " + message);
			}
		
	}


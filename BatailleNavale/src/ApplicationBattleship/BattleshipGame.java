package ApplicationBattleship;

import java.util.Scanner;


public class BattleshipGame
{
	
	private static final int AIRCRAFT_CARRIER = 5;
	private static final int CRUISER = 4;
	private static final int SUBMARINE=3;
	private static final int TORPEDO=2;
	static Grid gridP1=new Grid();
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
		int submarine1=3;
		int submarine2=4;
		int torpedo=2;
				Scanner sc = new Scanner(System.in);
				System.out.println("Quel bateau voulez-vous placer?");
				System.out.format("%s le porte avion", porteAvion);
				System.out.println("\n");
				System.out.format("%s le croiseur \n", croiseur);
				System.out.println("\n");
				System.out.format("%s le premier sousmarin \n", submarine1);
				System.out.println("\n");
				System.out.format("%s le deuxième sousmarin \n", submarine2);
				System.out.println("\n");
				System.out.format("%s la torpille \n", torpedo);
				int str= sc.nextInt();
				if (str==1)
					{System.out.println("vous avez choisi le porte-Avion, 5 cases:");
					for (int i=0; i<AIRCRAFT_CARRIER; i++)
					{
						gridP1.DisplayGrid();
						Position positionShipInGrid=gridP1.obtenirPosition();
						char shipCarac= ShipsTypes.AIRCRAFT_CARRIER.toString().charAt(0);
						gridP1.modifPosition(positionShipInGrid, shipCarac);
					}
				}
				if (str==2)
				{
					System.out.println("Vous avez choisi le croiseur, 4 cases:");
					for (int i=0; i<CRUISER; i++)
					{
						gridP1.DisplayGrid();
						Position positionShipInGrid=gridP1.obtenirPosition();
						char shipCarac= ShipsTypes.CRUISER.toString().charAt(0);
						gridP1.modifPosition(positionShipInGrid, shipCarac);
					}
				}
				if (str==3)
				{
					System.out.println("Vous avez choisi le premier sousmarin, 3 cases:");
					for (int i=0; i<SUBMARINE; i++)
					{
						gridP1.DisplayGrid();
						Position positionShipInGrid=gridP1.obtenirPosition();
						char shipCarac= ShipsTypes.SUBMARINEn1.toString().charAt(0);
						gridP1.modifPosition(positionShipInGrid, shipCarac);
					}
				}
				if (str==4)
				{
					System.out.println("Vous avez choisi le deuxième sousmarin, 3 cases:");
					for (int i=0; i<SUBMARINE; i++)
					{
						gridP1.DisplayGrid();
						Position positionShipInGrid=gridP1.obtenirPosition();
						char shipCarac= ShipsTypes.SUBMARINEn2.toString().charAt(0);
						gridP1.modifPosition(positionShipInGrid, shipCarac);
					}
				}
				if (str==5)
				{
					System.out.println("Vous avez choisi la torpille, 2 cases:");
					for (int i=0; i<TORPEDO; i++)
					{
						gridP1.DisplayGrid();
						Position positionShipInGrid=gridP1.obtenirPosition();
						char shipCarac= ShipsTypes.TORPEDO.toString().charAt(0);
						gridP1.modifPosition(positionShipInGrid, shipCarac);
					}
				}
				if (str>5)
					throw new BadValue("C'est pas bien " + message);
			}
		
	}


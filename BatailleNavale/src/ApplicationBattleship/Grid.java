package ApplicationBattleship;

import java.util.*;


public class Grid {
	
	/**
	  private attribute with ship type
	 **/
	private Ship ship;
	
	private final static int NB_Lignes=11;
	 
	private final static int NB_Colonne=11;
	 
	private char[][] grid;
	
	/**
	 * constructor of grid
	 */
	public Grid() {
		this.grid = new char[NB_Lignes][NB_Colonne];
		
		for (int i=0; i<NB_Lignes ; i++)
		{
			for (int j=0; j< NB_Colonne; j++)
			{
			grid[i][j]='~';
			}
		}
			
	}
		
	/**
	 * Display grid
	 */
	public void DisplayGrid()
	{
		
		
			System.out.format("      ");
			for(int i=1; i<=NB_Lignes;i++ )
			   {
			       System.out.format("%4d",i);
			   }
			   System.out.println();
			   System.out.println("--------------------------------------------------");
			   int n=0;
			   for(int i=0 ;i<NB_Lignes;i++) 
			   {
				   char code='A';
				   int incremente=code+n;
				   System.out.format("%4s |",(char)incremente);
				   n++;
				   for(int j=0;j<NB_Colonne;j++) 
				   {
					   System.out.format("%4s",this.grid[i][j]);
				   }
				   System.out.println();
				}
	}
	
	/**
	 *get position from user
	 **/
	public Position getPosition()
	{
		Position position;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la coordonnÃ©e X (lettre) :");
		char X = sc.nextLine().charAt(0);
		System.out.println("Veuillez saisir la coordonnÃ©e Y (chiffre) :");
		int Y = sc.nextInt();
		position = new Position((int) (X-65),(Y-1));
		return position;
	}
	
	/**
	 * change the position ship when x and Y are entry
	 * @param unePosition
	 * @param caracter
	 */
	public void changePosition(Position unePosition, char caracter)
	{
		this.grid[unePosition.getX()][unePosition.getY()]=caracter;
	}
}


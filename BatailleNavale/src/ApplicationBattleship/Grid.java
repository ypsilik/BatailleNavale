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
		
	/** pour pouvoir afficher la belle grille que je me suis fait chier a faire en 8h!!!!**/
	public void DisplayGrid()
	/*public String toString()*/
	{
		Position blabla=obtenirPosition();
		modifPosition(blabla);
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
				   int increm=code+n;
				   System.out.format("%4s |",(char)increm);
				   n++;
				   for(int j=0;j<NB_Colonne;j++) 
				   {
					   System.out.format("%4s",this.grid[i][j]);
				   }
				   System.out.println();
				}
	}
	
	//demande Ã  l'utilisateur les coordonnÃ©es des points//
	public Position obtenirPosition()
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
	
	//mÃ©thode qui modifie la case Ã  la position donnÃ©e//
	public void modifPosition(Position unePosition)
	{
		this.grid[unePosition.getX()][unePosition.getY()]=(char)127;
	}
}


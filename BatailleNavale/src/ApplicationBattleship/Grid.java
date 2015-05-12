package ApplicationBattleship;

import BatailleNavaleVersionCours.Ship;

/**
 * Class to create grid for battleship
 * @author CAYRE Laure and LAURENT Maud
 *
 */
public class Grid {
	
	/**
	  private attribute with ship type
	 **/
	private Ship ship;

	/**
	 *  initialisation NB_lines
	 */
	private final static int NB_Lines=11;
	
	/**
	 * initialisation NB_column 
	 */
	private final static int NB_Column=11;
	 
	private char[][] grid;
	
	public Grid() {
		this.grid = new char[NB_Lines][NB_Column];
		
		for (int i=0; i<NB_Lines ; i++)
		{
			for (int j=0; j< NB_Column; j++)
			{
				grid[i][j]='~';
			}
		}
			
	}
	
	public void DisplayGrid()
	/*public String toString()*/
	{
		
		{
			System.out.format("      ");
			for(int i = 1; i<=NB_Lines;i++ )
			   {
			       System.out.format("%4d",i);
			   }
			   System.out.println();
			   System.out.println("--------------------------------------------------");
			   int n=0;
			   for(int i = 1 ;i<=NB_Lines;i++) 
			   {
				   char code='A';
				   int increm=code+n;
				   System.out.format("%4s |",(char)increm);
				   n++;
				   for(int j=1;j<=NB_Column;j++) 
				   {
					   System.out.format("%4s",(char)126);
				   }
				   System.out.println();
				}
			}
	}
}


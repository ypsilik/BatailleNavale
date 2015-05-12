package ApplicationBattleship;
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
	 * Constructor for grid without parameters
	 */
	/** les pitits changements***/ 
	private final static int NB_Lines=10;
	 
	private final static int NB_Columns=10;
	 
	private char[][] grid;
	
	public Grid() {
		this.grid = new char[NB_Lines][NB_Columns];
		
		for (int i=0; i<NB_Lines ; i++)
		{
			for (int j=0; j< NB_Columns; j++)
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
				   // print left most column first
				   char code='A';
				   int increm=code+n;
				   System.out.format("%4s |",(char)increm);
				   n++;
				   for(int j=1;j<=NB_Columns;j++) 
				   {
					   System.out.format("%4s",(char)126);
				   }
				   System.out.println();
				}
			}
	}

}

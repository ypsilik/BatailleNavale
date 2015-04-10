package ApplicationBattleship;
/**
 * Class to create grid for battleship
 * @author CAYRE Laure and LAURENT Maud
 *
 */
public class Grid {
	/**
	 * attribute to initialize columns
	 */
	private final static int COLUMNS = 11;
	/**
	 * private attribute to initialize lines
	 */
	private final static int LINES = 11;
	/**
	 * private attribute with ship type
	 */
	private Ship ship;
	/**
	 * private grid 2 dimensions
	 */
	private int[][] grid;
	/**
	 * Constructor for grid without parameters
	 */
	public Grid() {
		this.grid = new int[LINES][COLUMNS];
	}
	/**
	 * Constructor for grid
	 * @param Ships position ship in grid
	 */
	public Grid(Ship Ships) {
		
	}
	

}

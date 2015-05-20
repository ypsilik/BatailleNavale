package ApplicationBattleship;

public class Position {
	private int x;
	private int y;
	//private char direction;

	public Position(int X, int Y)
	{
		this.x=X;
		this.y=Y;
		//this.direction=direction;
	}
		
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
/*	public char getDirection() {
		return direction;
	}
*/
}

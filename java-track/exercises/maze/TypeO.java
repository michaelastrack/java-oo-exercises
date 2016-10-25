package maze;

public class TypeO extends Block{
	
	private boolean north;
	private boolean east;
	private boolean south;
	private boolean west;
	
	public TypeO (int id, boolean s, boolean f) {
		super(id, s, f);
		this.north = false;
		this.east = false;
		this.south = false;
		this.west = true;
	}
	
	public String TryToMove (int orient) {
		if (orient != 2) {
			throw new IllegalArgumentException();
		}
		return "Dead End. Game Over.";
		
	}

	public boolean isNorth() {
		return north;
	}

	public boolean isEast() {
		return east;
	}

	public boolean isSouth() {
		return south;
	}

	public boolean isWest() {
		return west;
	}

}

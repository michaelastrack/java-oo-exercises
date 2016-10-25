package maze;

public class TypeI extends Block{
	
	private boolean north;
	private boolean east;
	private boolean south;
	private boolean west;
	
	public TypeI (int id, boolean s, boolean f) {
		super(id, s, f);
		this.north = true;
		this.east = false;
		this.south = false;
		this.west = false;
	}
	
	public String TryToMove (int orient) {
		if (orient != 3) {
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

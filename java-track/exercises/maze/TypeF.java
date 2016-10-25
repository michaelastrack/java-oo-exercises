package maze;

public class TypeF extends Block{
	
	private boolean north;
	private boolean east;
	private boolean south;
	private boolean west;
	
	public TypeF (int id, boolean s, boolean f) {
		super(id, s, f);
		this.north = true;
		this.east = false;
		this.south = false;
		this.west = true;
	}
	
	public String TryToMove (int orient) {
		if (orient != 2 || orient != 3) {
			throw new IllegalArgumentException();
		}
		String outcome = "";
		if (orient == 2) {
			outcome = "3) North \n";
			return outcome;
		}
		else {
			outcome = "4) West \n";
			return outcome;
		}
		
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

package maze;

public class TypeN extends Block{
	
	private boolean north;
	private boolean east;
	private boolean south;
	private boolean west;
	
	public TypeN (int id, boolean s, boolean f) {
		super(id, s, f);
		this.north = true;
		this.east = true;
		this.south = false;
		this.west = false;
	}
	
	public String TryToMove (int orient) {
		if (orient != 3 || orient != 4) {
			throw new IllegalArgumentException();
		}
		String outcome = "";
		if (orient == 3) {
			outcome = "2) East \n";
			return outcome;
		}
		else {
			outcome = "1) North \n";
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

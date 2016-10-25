package maze;

public class TypeD extends Block{
	
	private boolean north;
	private boolean east;
	private boolean south;
	private boolean west;
	
	public TypeD (int id, boolean s, boolean f) {
		super(id, s, f);
		this.north = true;
		this.east = false;
		this.south = true;
		this.west = true;
	}
	
	public String TryToMove (int orient) {
		if (orient != 1 || orient != 2 || orient != 3) {
			throw new IllegalArgumentException();
		}
		String outcome = "";
		
		if (orient == 1) {
			outcome = "1) North \n";
			outcome += "4) West \n";
			return outcome;
		}
		else if (orient == 2) {
			outcome = "1) North \n";
			outcome += "3) South \n";
			return outcome;
		}
		else {
			outcome = "3) South \n";
			outcome += "4) West \n";
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

package maze;

public class TypeK extends Block {
	
	private boolean north;
	private boolean east;
	private boolean south;
	private boolean west;
	
	public TypeK (int id, boolean s, boolean f) {
		super(id, s, f);
		this.north = false;
		this.east = true;
		this.south = true;
		this.west = false;
	}
	
	public String TryToMove (int orient) {
		if (orient != 1 || orient != 4) {
			throw new IllegalArgumentException();
		}
		String outcome = "";
		if (orient == 1) {
			outcome = "2) East \n";
			return outcome;
		}
		else {
			outcome = "3) South \n";
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

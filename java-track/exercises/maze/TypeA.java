package maze;

public class TypeA extends Block{
	
	private boolean north;
	private boolean east;
	private boolean south;
	private boolean west;
	
	public TypeA (int id, boolean s, boolean f) {
		super(id, s, f);
		this.north = true;
		this.east = true;
		this.south = true;
		this.west = true;
	}
	
	public String TrytoMove (int orient) {
		if (orient < 1 || orient > 4) {
			throw new IllegalArgumentException();
		}
		String output = "";
		if (orient == 1) {
			output = "1) North \n";
			output += "2) East \n";
			output += "4) West \n";
			return output;
		}
		else if (orient == 2) {
			output = "1) North \n";
			output += "2) East \n";
			output += "3) South \n";
			return output;
		}
		else if (orient == 3) {
			output = "2) East \n";
			output += "3) South \n";
			output += "4) West \n";
			return output;
		}
		else {
			output = "1) North \n";
			output += "3) South \n";
			output += "4) West \n";
			return output;
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

	public static void main(String[] args) {
		TypeA a = new TypeA (1, true, true);
		int b = 1;
		int c = 2;
		int d = 3;
		int e = 4;
		System.out.println(a.TrytoMove(b));
		System.out.println();
		System.out.println(a.TrytoMove(c));
		System.out.println();
		System.out.println(a.TrytoMove(d));
		System.out.println();
		System.out.println(a.TrytoMove(e));

	}

}

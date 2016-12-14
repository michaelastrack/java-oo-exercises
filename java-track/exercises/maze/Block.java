package maze;

public abstract class Block {
	
	private boolean start;
	private boolean finish;
	private boolean deadend;
	
	public Block (boolean s, boolean f, boolean d) {
		this.start = s;
		this.finish = f;
		this.deadend = d;
		
	}
	
	public boolean isStart () {
		return start;
	}
	
	public boolean isFinish () {
		return finish;
	}
	
	public boolean isDeadend () {
		return this.deadend;
	}
	
	public abstract String TryToMove (int orient);




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

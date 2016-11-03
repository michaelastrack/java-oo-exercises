package maze;

public abstract class Block {
	
	private final int id;
	private boolean start;
	private boolean finish;
	private boolean deadend;
	
	public Block (int id, boolean s, boolean f, boolean d) {
		this.id = id;
		this.start = s;
		this.finish = f;
		this.deadend = d;
		
	}
	
	public int getId() {
		return id;
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

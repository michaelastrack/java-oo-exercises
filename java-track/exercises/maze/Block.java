package maze;

public abstract class Block {
	
	private final int id;
	private boolean start;
	private boolean finish;
	
	public Block (int id, boolean s, boolean f) {
		this.id = id;
		this.start = s;
		this.finish = f;
		
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




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

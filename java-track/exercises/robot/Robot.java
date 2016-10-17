package robot;

public class Robot {
	
	private int speed;
	private int pos[];
	private String name;
	private int orientation;
	
	public Robot (String name, int speed, int[] pos, int orientation) {
		
		if (speed < 0) {
			throw new IllegalArgumentException();
		}
		this.speed = speed;
		this.name = name;
		this.orientation = orientation;
		this.pos = pos;
		
	}

	public int getSpeed() {
		return speed;
	}

	public String getName() {
		return name;
	}
	
	public int getXpos () {
		return this.pos[0];
	}
	
	public int getYpos () {
		return this.pos[1];
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void rotate (int rotation) {
		if (rotation == 90 && this.orientation == 270) {
			this.orientation = 0;
		}
		else if (rotation == -90 && this.orientation == 0) {
			this.orientation = 270;
		}
		else {
			this.orientation = this.orientation + rotation;
		}
	}
	
	public void move () {
		if (this.orientation == 0) {
			this.pos[1] = this.pos[1] + this.speed;
		}
		else if (this.orientation == 90) {
			this.pos[0] = this.pos[0] + this.speed;
		}
		else if (this.orientation == 180) {
			this.pos[1] = this.pos[1] - this.speed;
		}
		else {
			this.pos[0] = this.pos[0] - this.speed;
		}
	}
	
	public double determineDist (int otherpos[]) {
		double dist;
		dist = Math.sqrt(Math.pow((this.pos[0] - otherpos[0]), 2) + Math.pow((this.pos[1] - otherpos[1]), 2));
		return dist;
	}
	
	public String toString () {
		return "Name: " + this.name + " X-Pos: " + this.pos[0] + " Y-Pos: " + this.pos[1] + " Speed: " + this.speed + " Orientation: " + this.orientation + " degrees";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] position = {100, 100};
		int[] position2 = {100, 0};
		/*
		Robot michael = new Robot ("Michael", 25, position, 0);
		michael.rotate(-90);
		System.out.println(michael.determineDist(position2));
		michael.move();
		System.out.println(michael);  */
		try {
			Robot bob = new Robot ("Bob", -10, position, 180);
			System.out.println(bob.getName());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Can't create Robot");
			e.printStackTrace();
		}
		
		

	}

}

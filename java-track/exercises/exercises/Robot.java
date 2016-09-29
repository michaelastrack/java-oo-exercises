package exercises;

public class Robot {
	
	private int speed;
	private int pos[];
	private String name;
	private int orientation;
	
	public Robot (String name, int speed, int[] pos, int orientation) {
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
		return "Name: " + this.name + " X-Position: " + this.pos[0] + " Y-Position: " + this.pos[1] + " Speed: " + this.speed + " Orientation: " + this.orientation + " degrees";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] position = {100, 100};
		Robot michael = new Robot ("Michael", 25, position, 0);
		michael.rotate(90);
		michael.move();
		System.out.println(michael);

	}

}

package maze;

import java.util.Scanner;

public class Maze {
	
	protected int xpos;
	protected int ypos;
	protected int size;
	protected Block [][] blocks;
	protected String [][] path;
	private static Scanner s;
	
	public Maze (int s, int x, int y, Block[][] b) {
		this.size = s;
		this.xpos = x;
		this.ypos = y;
		this.blocks = b;
		this.path = new String [s][s];
	}
	
	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
	
	public void initPath () {
		for (int i = 0; i< this.size; i++) {
			for (int j = 0; j<this.size; j++) {
				if (this.blocks[i][j].isFinish()) {
					this.path[i][j] = "F";
				}
				else {
				this.path[i][j] = " ";
				}
			}
		}
	}
	
	public String DisplayPath () {
		String output = "";
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				output += this.path[i][j];
			}
			output += " \n";
		}
		
		return output;
	}

	public void Move (int orient) {
		if (orient == 1) {
			this.path [this.xpos][this.ypos] = "|";
			this.xpos--;
			if (this.xpos < 0) {
				throw new IllegalArgumentException();
			} 
		}
		else if (orient == 2) {
			this.path [this.xpos][this.ypos] = "-";
			this.ypos++;
			if (this.ypos >= this.size) {
				throw new IllegalArgumentException();
			} 
		}
		else if (orient == 3) {
			this.path [this.xpos][this.ypos] = "|";
			this.xpos++;
			if (this.xpos >= this.size) {
				throw new IllegalArgumentException();
			} 
		}
		else if (orient == 4) {
			this.path [this.xpos][this.ypos] = "-";
			this.ypos--;
			if (this.ypos < 0) {
				throw new IllegalArgumentException();
			} 
		}
		
	}
	
	public void RunMaze (int x, int y, int o) {
		boolean GoOn = true;
		this.setXpos(x);
		this.setYpos(y);
		this.initPath();
		int orient = o;
		s = new Scanner(System.in);
		int neworient;
		boolean invalidorient = true;
		
		while (GoOn) {
			this.path[xpos][ypos] = "x";
			System.out.println(this.DisplayPath());
			
			System.out.println(blocks [this.xpos] [this.ypos].TryToMove(orient));
			System.out.println("Enter in the number for the direction you want to move:");
			neworient = s.nextInt();
			while (invalidorient) {
				if (neworient + 2 == orient || neworient - 2 == orient) {
					System.out.println("You can't move backwards, please enter a new valid selection.");
					System.out.println(blocks [this.xpos] [this.ypos].TryToMove(orient));
					System.out.println("Enter in the number for the direction you want to move:");
					neworient = s.nextInt();
				}
				else {
					invalidorient = false;
				}
			}
			orient = neworient;
			invalidorient = true;
			this.Move(orient);
			if (blocks [this.xpos] [this.ypos].isDeadend()) {
				System.out.println("You lose, you have hit a dead end.");
				GoOn = false;
			}
			else if (blocks [this.xpos] [this.ypos].isFinish()) {
				System.out.println("Congratulations you made it to the end of the maze!!!!!!");
				GoOn = false;
			}
			else if (blocks [this.xpos][this.ypos].isStart()) {
				System.out.println("Game Over, you have returned back to the start.");
				GoOn = false;
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		
		// Initialize variables for the maze

		int s = 3;
		int x = 2;
		int y = 2;
		Block [][] blocks = new Block [s][s];
		Maze m = new Maze(s, x, y, blocks);
		
		
		int orient = 1;

		// Initialize a 3 x 3 maze
		m.blocks[0][0] = new TypeK (1, false, false);
		m.blocks[0][1] = new TypeL (2, false, false);
		m.blocks[0][2] = new TypeF (3, false, true);
		m.blocks[1][0] = new TypeB (4, false, false);
		m.blocks[1][1] = new TypeL (5, false, false);
		m.blocks[1][2] = new TypeG (6, false, false);
		m.blocks[2][0] = new TypeN (7, false, false);
		m.blocks[2][1] = new TypeL (8, false, false);
		m.blocks[2][2] = new TypeD (9, true, false);
		
		m.RunMaze(x, y, orient);
		
		/*  Old code now moved to the RunMaze function
		 * 
		while (GoOn) {
			
			
			System.out.println(blocks [m.xpos] [m.ypos].TryToMove(orient));
			System.out.println("Enter in the number for the direction you want to move:");
			orient = s.nextInt();
			m.Move(orient);
			if (blocks [m.xpos] [m.ypos].isDeadend()) {
				System.out.println("You lose, you have hit a dead end.");
				GoOn = false;
			}
			else if (blocks [m.xpos] [m.ypos].isFinish()) {
				System.out.println("Congratulations you made it to the end of the maze!!!!!!");
				GoOn = false;
			}
			else if (blocks [m.xpos][m.ypos].isStart()) {
				System.out.println("Game Over, you have returned back to the start.");
				GoOn = false;
			}
			
		}  */


	}

}

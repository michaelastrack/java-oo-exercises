package maze;

import java.util.Scanner;

public class Maze {
	
	protected int xpos;
	protected int ypos;
	protected int size;
	protected Block [][] blocks;
	private static Scanner s;
	
	public Maze (int s, int x, int y, Block[][] b) {
		this.size = s;
		this.xpos = x;
		this.ypos = y;
		this.blocks = b;
	}
	
	public void Move (int orient) {
		if (orient == 1) {
			this.xpos--;
			/*if (this.xpos < 0) {
				throw new IllegalArgumentException();
			} */
		}
		else if (orient == 2) {
			this.ypos++;
			/*if (this.ypos + 1 >= this.size) {
				throw new IllegalArgumentException();
			} */
		}
		else if (orient == 3) {
			this.xpos++;
			/*if (this.xpos + 1 >= this.size) {
				throw new IllegalArgumentException();
			} */
		}
		else if (orient == 4) {
			this.ypos--;
			/*if (this.ypos < 0) {
				throw new IllegalArgumentException();
			} */
		}
		
	}

	public static void main(String[] args) {
		
		// Initialize variables for the scanner, while loop, and maze
		s = new Scanner(System.in);
		boolean GoOn = true;
		Block [][] blocks = new Block [3][3];
		Maze m = new Maze(3, 2, 2, blocks);
		
		
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
			
			// Code used for troubleshooting now commented out
			//System.out.println(m.xpos);
			//System.out.println(m.ypos);
		}


	}

}

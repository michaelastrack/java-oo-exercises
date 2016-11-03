package maze;

import java.util.Scanner;

public class BigMaze {
	
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		boolean GoOn = true;
		Block [][] blocks = new Block [7][7];
		Maze m = new Maze(7, 6, 0, blocks);
		
		int orient = 1;
		
		// Initialize a 7 x 7 maze
		// row 0
		m.blocks[0][0] = new TypeB (1, false, true);
		m.blocks[0][1] = new TypeL (2, false, false);
		m.blocks[0][2] = new TypeE (3, false, false);
		m.blocks[0][3] = new TypeL (4, false, false);
		m.blocks[0][4] = new TypeL (5, false, false);
		m.blocks[0][5] = new TypeL (6, false, false);
		m.blocks[0][6] = new TypeG (7, false, false);
		
		//row 1
		m.blocks[1][0] = new TypeB (8, false, false);
		m.blocks[1][1] = new TypeE (9, false, false);
		m.blocks[1][2] = new TypeA (10, false, false);
		m.blocks[1][3] = new TypeE (11, false, false);
		m.blocks[1][4] = new TypeG (12, false, false);
		m.blocks[1][5] = new TypeK (13, false, false);
		m.blocks[1][6] = new TypeD (14, false, false);
		
		// row 2
		m.blocks[2][0] = new TypeH (15, false, false);
		m.blocks[2][1] = new TypeI (16, false, false);
		m.blocks[2][2] = new TypeH (17, false, false);
		m.blocks[2][3] = new TypeB (18, false, false);
		m.blocks[2][4] = new TypeA (19, false, false);
		m.blocks[2][5] = new TypeB (20, false, false);
		m.blocks[2][6] = new TypeD (21, false, false);
		
		//row 3
		m.blocks[3][0] = new TypeN (22, false, false);
		m.blocks[3][1] = new TypeL (23, false, false);
		m.blocks[3][2] = new TypeF (24, false, false);
		m.blocks[3][3] = new TypeH (25, false, false);
		m.blocks[3][4] = new TypeN (26, false, false);
		m.blocks[3][5] = new TypeD (27, false, false);
		m.blocks[3][6] = new TypeH (28, false, false);
		
		//row 4
		m.blocks[4][0] = new TypeK (29, false, false);
		m.blocks[4][1] = new TypeE (30, false, false);
		m.blocks[4][2] = new TypeL (31, false, false);
		m.blocks[4][3] = new TypeD (32, false, false);
		m.blocks[4][4] = new TypeM (33, false, false);
		m.blocks[4][5] = new TypeF (34, false, false);
		m.blocks[4][6] = new TypeH (35, false, false);
		
		//row 5
		m.blocks[5][0] = new TypeH (36, false, false);
		m.blocks[5][1] = new TypeB (37, false, false);
		m.blocks[5][2] = new TypeL (38, false, false);
		m.blocks[5][3] = new TypeA (39, false, false);
		m.blocks[5][4] = new TypeE (40, false, false);
		m.blocks[5][5] = new TypeL (41, false, false);
		m.blocks[5][6] = new TypeD (42, false, false);
		
		//row 6
		m.blocks[6][0] = new TypeB (43, false, false);
		m.blocks[6][1] = new TypeC (44, false, false);
		m.blocks[6][2] = new TypeL (45, false, false);
		m.blocks[6][3] = new TypeF (46, false, false);
		m.blocks[6][4] = new TypeN (47, false, false);
		m.blocks[6][5] = new TypeL (48, false, false);
		m.blocks[6][6] = new TypeF (49, false, false);
		
		
		
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
			
		}

	}

}

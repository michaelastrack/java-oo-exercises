package maze;

//import java.util.Scanner;

public class BigMaze {
	
//	private static Scanner s;

	public static void main(String[] args) {
		// s = new Scanner(System.in);
		// boolean GoOn = true;
		Block [][] blocks = new Block [7][7];
		Maze m = new Maze(7, 6, 0, blocks);
		
		int orient = 1;
		
		// Initialize a 7 x 7 maze
		// row 0
		m.blocks[0][0] = new TypeB (false, true);
		m.blocks[0][1] = new TypeL (false, false);
		m.blocks[0][2] = new TypeE (false, false);
		m.blocks[0][3] = new TypeL (false, false);
		m.blocks[0][4] = new TypeL (false, false);
		m.blocks[0][5] = new TypeL (false, false);
		m.blocks[0][6] = new TypeG (false, false);
		
		//row 1
		m.blocks[1][0] = new TypeB (false, false);
		m.blocks[1][1] = new TypeE (false, false);
		m.blocks[1][2] = new TypeA (false, false);
		m.blocks[1][3] = new TypeE (false, false);
		m.blocks[1][4] = new TypeG (false, false);
		m.blocks[1][5] = new TypeK (false, false);
		m.blocks[1][6] = new TypeD (false, false);
		
		// row 2
		m.blocks[2][0] = new TypeH (false, false);
		m.blocks[2][1] = new TypeI (false, false);
		m.blocks[2][2] = new TypeH (false, false);
		m.blocks[2][3] = new TypeB (false, false);
		m.blocks[2][4] = new TypeA (false, false);
		m.blocks[2][5] = new TypeB (false, false);
		m.blocks[2][6] = new TypeD (false, false);
		
		//row 3
		m.blocks[3][0] = new TypeN (false, false);
		m.blocks[3][1] = new TypeL (false, false);
		m.blocks[3][2] = new TypeF (false, false);
		m.blocks[3][3] = new TypeH (false, false);
		m.blocks[3][4] = new TypeN (false, false);
		m.blocks[3][5] = new TypeD (false, false);
		m.blocks[3][6] = new TypeH (false, false);
		
		//row 4
		m.blocks[4][0] = new TypeK (false, false);
		m.blocks[4][1] = new TypeE (false, false);
		m.blocks[4][2] = new TypeL (false, false);
		m.blocks[4][3] = new TypeD (false, false);
		m.blocks[4][4] = new TypeM (false, false);
		m.blocks[4][5] = new TypeF (false, false);
		m.blocks[4][6] = new TypeH (false, false);
		
		//row 5
		m.blocks[5][0] = new TypeH (false, false);
		m.blocks[5][1] = new TypeB (false, false);
		m.blocks[5][2] = new TypeL (false, false);
		m.blocks[5][3] = new TypeA (false, false);
		m.blocks[5][4] = new TypeE (false, false);
		m.blocks[5][5] = new TypeL (false, false);
		m.blocks[5][6] = new TypeD (false, false);
		
		//row 6
		m.blocks[6][0] = new TypeB (true, false);
		m.blocks[6][1] = new TypeC (false, false);
		m.blocks[6][2] = new TypeL (false, false);
		m.blocks[6][3] = new TypeF (false, false);
		m.blocks[6][4] = new TypeN (false, false);
		m.blocks[6][5] = new TypeL (false, false);
		m.blocks[6][6] = new TypeF (false, false);
		
		m.RunMaze(6, 0, orient);
		
		
		/*
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
			
		} */

	}

}

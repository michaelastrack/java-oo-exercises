package maze;

public class DemoMaze {

	public static void main(String[] args) {
		Block [][] blocks = new Block [6][6];
		int x = 5;
		int y = 0;
		Maze m = new Maze(6, x, y, blocks);
		
		int orient = 1;
		
		// row 0
		m.blocks[0][0] = new TypeJ (false, false);
		m.blocks[0][1] = new TypeK (false, false);
		m.blocks[0][2] = new TypeL (false, false);
		m.blocks[0][3] = new TypeE (false, false);
		m.blocks[0][4] = new TypeL (false, false);
		m.blocks[0][5] = new TypeD (false, true);
		
		// row 1
		m.blocks[1][0] = new TypeB (false, false);
		m.blocks[1][1] = new TypeA (false, false);
		m.blocks[1][2] = new TypeE (false, false);
		m.blocks[1][3] = new TypeD (false, false);
		m.blocks[1][4] = new TypeP (false, false);
		m.blocks[1][5] = new TypeH (false, false);
		
		// row 2
		m.blocks[2][0] = new TypeH (false, false);
		m.blocks[2][1] = new TypeH (false, false);
		m.blocks[2][2] = new TypeN (false, false);
		m.blocks[2][3] = new TypeA (false, false);
		m.blocks[2][4] = new TypeL (false, false);
		m.blocks[2][5] = new TypeD (false, false);
		
		// row 3
		m.blocks[3][0] = new TypeH (false, false);
		m.blocks[3][1] = new TypeN (false, false);
		m.blocks[3][2] = new TypeL (false, false);
		m.blocks[3][3] = new TypeA (false, false);
		m.blocks[3][4] = new TypeL (false, false);
		m.blocks[3][5] = new TypeF (false, false);
		
		// row 4
		m.blocks[4][0] = new TypeB (false, false);
		m.blocks[4][1] = new TypeG (false, false);
		m.blocks[4][2] = new TypeM (false, false);
		m.blocks[4][3] = new TypeA (false, false);
		m.blocks[4][4] = new TypeG (false, false);
		m.blocks[4][5] = new TypeJ (false, false);
		
		// row 5
		m.blocks[5][0] = new TypeB (true, false);
		m.blocks[5][1] = new TypeC (false, false);
		m.blocks[5][2] = new TypeL (false, false);
		m.blocks[5][3] = new TypeC (false, false);
		m.blocks[5][4] = new TypeC (false, false);
		m.blocks[5][5] = new TypeF (false, false);
		
		System.out.println("You will lose the game if you return to the starting space, or run into a dead end");
		System.out.println("There is no going backwards in this maze");
		System.out.println();

		System.out.println("F: The Finish of the Maze");
		System.out.println("O: A position on the Maze you haven't visited");
		System.out.println("x: Your current position");
		System.out.println();
		
		m.RunMaze(x, y, orient);

	}

}

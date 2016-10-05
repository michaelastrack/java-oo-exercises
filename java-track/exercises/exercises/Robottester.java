package exercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class Robottester {

	@Test
	public void testMove() {
		int[] position1 = {0, 0};
		Robot robby = new Robot ("robby", 20, position1, 0);
		assertTrue ("Problem with initialization", robby.getYpos() == 0);
		robby.move();
		assertTrue (robby.getYpos() == 20);
	}

}

package Studio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class baseballplayerTest {

	@Test
	public void testPlayGame() {
		baseballplayer B = new baseballplayer ("Mike", 23, "right");
		assertTrue ("Checking intialization of games", B.getGames() == 0);
		assertTrue ("Checking intialization of hits", B.getHits() == 0);
		assertTrue ("Checking initialization of runs", B.getRuns() == 0);
		assertTrue ("Checking initialization of rbi", B.getRbi() == 0);
		B.playGame(1, 2, 2);
		assertTrue ("Checking implementation of games", B.getGames() == 1);
		assertTrue ("Checking implementation of hits", B.getHits() == 2);
		assertTrue ("Checking implementation of runs", B.getRuns() == 1);
		assertTrue ("Checking implementation of rbi", B.getRbi() == 2);
		
	}

}

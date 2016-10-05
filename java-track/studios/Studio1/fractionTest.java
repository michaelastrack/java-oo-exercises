package Studio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class fractionTest {

	@Test
	public void testAddFraction() {
		fraction f = new fraction (2, 3);
		fraction g = new fraction (1, 3);
		fraction h = f.addFraction(g);
		assertTrue ("testing fraction addition", h.getDenominator() == h.getNumerator());
		
	}

	@Test
	public void testMultFraction() {
		fraction f = new fraction (1, 2);
		fraction g = new fraction (1, 2);
		fraction h = f.multFraction(g);
		assertTrue ("testing fraction multiplication", h.getNumerator() == 1);
		assertTrue ("testing fraction multiplication", h.getDenominator() == 4);
		
	}
	


	@Test
	public void testflipfraction() {
		fraction f = new fraction (7, 11);
		fraction g = f.flip();
		assertTrue ("Testing fraction reciprocals", g.getNumerator() == 11);
		assertTrue ("Testing fraction reciprocals", g.getDenominator() == 7);
		
	}
	
	@Test
	public void testsimplify() {
		fraction f = new fraction (18, 90);
		f = f.simplify();
		assertTrue ("Testing simplifying fractions", f.getNumerator() == 1);
		assertTrue ("Testing simplifying fractions", f.getDenominator() == 5);
		
	}

}

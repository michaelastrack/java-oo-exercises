package Studio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testGetArea() {
		Rectangle r = new Rectangle (2, 4);
		assertTrue ("Testing Area", r.getArea() == 8);
		
	}

	@Test
	public void testGetPerimeter() {
		Rectangle r = new Rectangle (2, 4);
		assertTrue ("Testing Perimeter", r.getPerimeter() == 12);
		
	}

	@Test
	public void testisSquare() {
		Rectangle r = new Rectangle (2, 4);
		assertTrue ("Testing squareness", r.isSquare() == false);
		Rectangle n = new Rectangle (16, 16);
		assertTrue ("Testing squareness", n.isSquare());
		
	}

	@Test
	public void testisBigger() {
		Rectangle r = new Rectangle (2, 4);
		Rectangle t = new Rectangle (4, 6);
		assertTrue ("Testing Size", r.isBigger(t) == false);
		r = new Rectangle (3, 5);
		t = new Rectangle (2, 4);
		assertTrue ("Testing Size", r.isBigger(t));
		
	}

}

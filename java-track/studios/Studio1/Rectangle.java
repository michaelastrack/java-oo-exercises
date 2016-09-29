package Studio1;

public class Rectangle {
	
	
	private int length;
	private int width;
	
	public Rectangle (int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	public int getArea () {
		return this.width * this.length;
	}
	
	public int getPerimeter () {
		return 2 * this.width + 2 * this.length;
	}
	public boolean isSquare () {

		return length == width;
		
	}
	
	public boolean isBigger (Rectangle x) {
		
		return this.getArea() > x.getArea();
	}
	



public static void main(String[] args) {
	// TODO Auto-generated method stub
	Rectangle a = new Rectangle (3, 4);
	Rectangle b = new Rectangle (4, 5);
	System.out.println(a.getArea());
	System.out.println(a.getPerimeter());
	System.out.println(a.isSquare());
	System.out.println(a.isBigger(b));
}

}

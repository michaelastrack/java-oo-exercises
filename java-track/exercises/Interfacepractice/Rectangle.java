package Interfacepractice;

public class Rectangle implements Measureable {
	
	private float height;
	private float width;
	
	public Rectangle (float h, float w) {
		this.height = h;
		this.width = w;
	}

	public float getHeight() {
		return height;
	}

	public float getWidth() {
		return width;
	}

	@Override
	public float getArea() {
		return this.getHeight() * this.getWidth();
	}

	@Override
	public float getPerimeter() {
		return 2*this.getHeight() + 2*this.getWidth();
	}
	
	

}

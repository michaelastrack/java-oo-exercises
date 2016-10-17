package Interfacepractice;

import java.util.ArrayList;

public class Circle implements Measureable {
	
	private float radius;
	
	public Circle (float r) {
		this.radius = r;
	}
	
	@Override
	public float getArea() {
		
		return (float)Math.PI * this.radius * this.radius;
	}

	@Override
	public float getPerimeter() {
		
		return (float)Math.PI * 2 * this.radius;
	}
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle (5, 6);
		Circle c = new Circle (4);
		
		ArrayList<Measureable> shapes = new ArrayList<Measureable>();
		shapes.add(r);
		shapes.add(c);
		
		for (int i = 0; i<shapes.size(); i++) {
			Measureable shape = shapes.get(i);
			System.out.println(shape.getArea());
			System.out.println(shape.getPerimeter());
		}
	}

}
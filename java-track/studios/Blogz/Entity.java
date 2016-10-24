package Blogz;

import java.util.Objects;

public abstract class Entity {
	
	private final int uid;
	private static int num = 1;
	
	public Entity () {
		this.uid = num;
		num++;
	}
	
	public int getUid() {
		return uid;
	}
	
	@Override 
	public boolean equals (Object o) {
		if (this == o) 
			return true;
		
		if (o == null)
			return false;
		
		if (getClass() != o.getClass())
			return false;
		
		Entity e = (Entity) o;
		
		return Objects.equals(uid, e.uid);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

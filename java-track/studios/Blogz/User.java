package Blogz;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class User extends Entity{
	
	private String name;
	private String hashedpassword;
	private static List<User> Users = new ArrayList<User>();
	
	public User (String name, String password) {
		super();
		if (!User.isValidUsername(name)) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.hashedpassword = User.hashPassword(password);
		Users.add(this);
		
	}
	
	private static String hashPassword (String password) {
		return password;
	}
	
	public boolean isValidPassword (String password) {
		return this.hashedpassword.equals(User.hashPassword(password));
	}
	
	public static boolean isValidUsername (String name) {
		return Pattern.matches("[a-zA-Z][a-zA-Z0-9_-]{4,11}", name);
				
	}

	public String getName() {
		return name;
	}

	public String getHashedpassword() {
		return hashedpassword;
	}

	public static List<User> getUsers() {
		return Users;
	}

	public static void main(String[] args) {
		
		/*
		User m = new User ("Michael", "123456");
		User n = new User ("Bobby", "123456");
		System.out.println(m.getUid());
		System.out.println(n.getUid());
		Post p = new Post ("Title", "Body", "Author");
		System.out.println(p.getUid());
		*/
		
	}

}

package Blogz;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostAndUserTest {

	@Test
	public void testUser() {
		User m = new User ("Jimmy", "Jimmy");
		
		assertTrue ("Problem with initialization", m.getName().equals("Jimmy"));

	}
	@Test
	public void testValidPassword() {
		User m = new User ("Jimmy", "Jimmy");
		
		assertTrue ("Problem with initialization", m.isValidPassword("Jimmy"));
		
	}	
	@Test
	public void testValidUsername() {
		String s = "a1248";
		String t = "Jim";
		String u = "abcdefghijklmnopqrs";
		String v = "ab21@f";
		
		assertTrue ("Problem with username", User.isValidUsername(s));
		assertTrue ("Problem with username", !User.isValidUsername(t));
		assertTrue ("Problem with username", !User.isValidUsername(u));
		assertTrue ("Problem with username", !User.isValidUsername(v));
		
		
	}
	

}

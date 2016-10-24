package Blogz;

import java.util.Date;

public class Post extends Entity{
	
	private String body;
	private String title;
	private String author;
	private final Date created;
	private Date modified;
	
	public Post (String title, String body, String author) {
		super();
		this.title = title;
		this.body = body;
		this.author = author;
		this.created = new Date();
		this.modified = new Date();
	}
	
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
		this.modified = new Date();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		this.modified = new Date();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
		this.modified = new Date();
	}

	public Date getCreated() {
		return created;
	}

	public Date getModified() {
		return modified;
	}

	public static void main(String[] args) {

	}

}

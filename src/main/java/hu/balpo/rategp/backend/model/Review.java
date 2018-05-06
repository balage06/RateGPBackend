package hu.balpo.rategp.backend.model;

import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class Review extends BaseEntity {
	
	private int rating;
	
	@Lob
	private String comment;
	
	private String username;
	
	public Review() {
		super();
	}
	
	public Review(int rating, String comment, String username) {
		this.rating = rating;
		this.comment = comment;
		this.username = username;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}

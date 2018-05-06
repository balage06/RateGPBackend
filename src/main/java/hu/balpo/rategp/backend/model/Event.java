package hu.balpo.rategp.backend.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Event extends NamedEntity {
	
	@OneToMany
	private List<Review> ratings = new ArrayList<>();
	
	public Event() {
		super();
	}
	
	public Event(String name) {
		super(name);
	}

	public List<Review> getRatings() {
		return ratings;
	}

	public void setRatings(List<Review> ratings) {
		this.ratings = ratings;
	}
	
	public void addRating(Review rating) {
		this.ratings.add(rating);
	}
}

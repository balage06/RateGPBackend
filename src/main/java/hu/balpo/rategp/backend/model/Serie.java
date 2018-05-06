package hu.balpo.rategp.backend.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Serie extends NamedEntity {
	
	@OneToMany
	private List<Event> events = new ArrayList<>();
	
	public Serie() {
		super();
	}
	
	public Serie(String name) {
		super(name);
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	public void addEvent(Event event) {
		this.events.add(event);
	}
}

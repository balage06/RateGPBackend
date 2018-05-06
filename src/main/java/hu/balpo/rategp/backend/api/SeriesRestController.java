package hu.balpo.rategp.backend.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.balpo.rategp.backend.model.Event;
import hu.balpo.rategp.backend.model.Review;
import hu.balpo.rategp.backend.model.Serie;
import hu.balpo.rategp.backend.repository.EventRepository;
import hu.balpo.rategp.backend.repository.ReviewRepository;
import hu.balpo.rategp.backend.repository.SerieRepository;

@RestController
@RequestMapping("/api")
public class SeriesRestController {
	
	@Autowired
	private SerieRepository serieRepository;
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@GetMapping("/series")
	public List<Serie> getSeriesList() {
		List<Serie> series = (List<Serie>) serieRepository.findAll();
		return series;
	}
	
	@GetMapping("/series/{seriesId}")
	public Serie getSeriesById(@RequestParam long seriesId){
		Optional<Serie> serie = serieRepository.findById(seriesId);
		if(serie.isPresent()) {
			return serie.get();
		} else {
			throw new RuntimeException();
		}
	}
	
	@GetMapping("/series/{seriesId}/{eventId}")
	public Event getReviewsByEventId(@RequestParam long seriesId, @RequestParam long eventId) {
		Optional<Event> event = eventRepository.findById(eventId);
		if(event.isPresent()) {
			return event.get();
		} else {
			throw new RuntimeException();
		}
	}
	
	@PostMapping("series/{seriesId}/{eventId}")
	public void postReviewForEvent(@RequestParam long seriesId, @RequestParam long eventId, @RequestBody Review review) {
		Review reviewToSave = new Review();
		
		reviewToSave.setRating(review.getRating());
		reviewToSave.setComment(review.getComment());
		reviewToSave.setUsername(review.getUsername());
		
		reviewRepository.save(reviewToSave);
	}
}

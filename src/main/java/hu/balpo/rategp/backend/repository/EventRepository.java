package hu.balpo.rategp.backend.repository;

import org.springframework.data.repository.CrudRepository;

import hu.balpo.rategp.backend.model.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}

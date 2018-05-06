package hu.balpo.rategp.backend.repository;

import org.springframework.data.repository.CrudRepository;

import hu.balpo.rategp.backend.model.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}

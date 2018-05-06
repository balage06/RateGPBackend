package hu.balpo.rategp.backend.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import hu.balpo.rategp.backend.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByUsername(String username);
}

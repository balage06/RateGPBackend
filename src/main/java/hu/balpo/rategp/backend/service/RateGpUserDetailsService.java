package hu.balpo.rategp.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import hu.balpo.rategp.backend.model.User;
import hu.balpo.rategp.backend.repository.UserRepository;

@Service
public class RateGpUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUsername(username);
		if(user.isPresent()) {
			return user.get();
		} else {
			throw new UsernameNotFoundException(username);
		}
	}

}

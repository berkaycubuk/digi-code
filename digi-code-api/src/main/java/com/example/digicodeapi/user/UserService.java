package com.example.digicodeapi.user;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements UserDetailsService {

	private final UserRepository userRepository;

	private final PasswordEncoder passwordEncoder;

	@Autowired
	public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public void save(User user) {
		Optional<User> userOptional = userRepository.findUserByEmail(user.getEmail());
		if (userOptional.isPresent()) {
			throw new IllegalStateException("email taken");
		}

		user.setPassword(this.passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
	}

	public void deleteUser(Long userId) {
		boolean exists = userRepository.existsById(userId);
		if (!exists) {
			throw new IllegalStateException("user with id " + userId + " does not exists");
		}
		userRepository.deleteById(userId);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return this.userRepository.findUserByEmail(username) // find this user from database
				.map(user -> new MyUserPrincipal(user)) // if found wrap the returned user instance with the MyUserPrincipal instance
				.orElseThrow(() -> new UsernameNotFoundException("username " + username + " is not found.")); // otherwise throw exception
	}

	/*
	@Transactional
	public void updateUser(Long userId, String name, String email) {
		User user = userRepository.findById(userId).orElseThrow(() -> new IllegalStateException("user with id " + userId + " does not exists"));

		if (name != null && !name.isEmpty() && !Objects.equals(user.getName(), name)) {
			user.setName(name);
		}

		if (email != null && !email.isEmpty() && !Objects.equals(user.getEmail(), email)) {
			Optional<User> userOptional = userRepository.findUserByEmail(email);
			if (userOptional.isPresent()) {
				throw new IllegalStateException("email taken");
			}
			user.setEmail(email);
		}
	}

	 */
}

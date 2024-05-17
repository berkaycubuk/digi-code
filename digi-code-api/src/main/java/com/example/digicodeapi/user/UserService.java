package com.example.digicodeapi.user;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public void addUser(User user) {
		Optional<User> userOptional = userRepository.findUserByEmail(user.getEmail());
		if (userOptional.isPresent()) {
			throw new IllegalStateException("email taken");
		}

		userRepository.save(user);
	}

	public void deleteUser(Long userId) {
		boolean exists = userRepository.existsById(userId);
		if (!exists) {
			throw new IllegalStateException("user with id " + userId + " does not exists");
		}
		userRepository.deleteById(userId);
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

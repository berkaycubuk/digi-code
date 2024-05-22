package com.example.digicodeapi.user;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User implements UserDetails {

	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;

	@CreatedDate
	private Date createdDate;

	@Enumerated(EnumType.STRING)
	private Role role;

	public User() {
	}

	public User(
		Long id,
		String firstName,
		String lastName,
		String email,
		String password,
		Role role
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = email;
		this.password = password;
		this.role = role;
	}

	public User(
			String firstName,
			String lastName,
			String email,
			String password,
			Role role
	) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = email;
		this.password = password;
		this.role = role;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", firstName=" + firstName + '\'' +
				", lastName=" + lastName + '\'' +
				", email=" + email + '\'' +
				", username=" + username + '\'' +
				", createdDate=" + createdDate +
				'}';
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority(role.name()));
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}

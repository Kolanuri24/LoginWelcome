package com.example.Registration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Registration.Entity.User;

public interface RegistrationRepository extends JpaRepository<User, Integer> {
	public User findByUsername(String username);

	public User findByUsernameAndPassword(String username, String password);
}

	

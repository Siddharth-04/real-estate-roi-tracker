package com.bridgelabz.real_estate_roi_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.real_estate_roi_tracker.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

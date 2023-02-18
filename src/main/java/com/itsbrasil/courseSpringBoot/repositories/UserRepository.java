package com.itsbrasil.courseSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsbrasil.courseSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

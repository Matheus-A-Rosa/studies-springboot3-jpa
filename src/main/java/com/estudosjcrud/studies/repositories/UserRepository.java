package com.estudosjcrud.studies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosjcrud.studies.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

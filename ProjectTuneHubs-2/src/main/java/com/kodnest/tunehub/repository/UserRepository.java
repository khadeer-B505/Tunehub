package com.kodnest.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.tunehub.entity.User;

//import com.kodnest.tunehub.serviceimpl.S;

public interface UserRepository extends JpaRepository<User, String>{

	public User findByEmail(String email);



}
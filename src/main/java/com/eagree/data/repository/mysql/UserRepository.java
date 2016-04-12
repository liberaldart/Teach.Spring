package com.eagree.data.repository.mysql;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eagree.data.domain.mysql.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailAddress(String emailAddress);
	
}

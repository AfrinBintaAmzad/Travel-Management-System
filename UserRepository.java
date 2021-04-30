
package com.afrin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.afrin.entity.User;



public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	User findByEmailAndPassword(String email, String password);
}



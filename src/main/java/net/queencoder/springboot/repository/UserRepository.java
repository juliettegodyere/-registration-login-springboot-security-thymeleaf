package net.queencoder.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.queencoder.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}

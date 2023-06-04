package net.queencoder.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.queencoder.springboot.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByName(String name);
}

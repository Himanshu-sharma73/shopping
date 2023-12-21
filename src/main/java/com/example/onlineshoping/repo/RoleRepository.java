package com.example.onlineshoping.repo;

import com.example.onlineshoping.entity.ERole;
import com.example.onlineshoping.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(ERole name);
}

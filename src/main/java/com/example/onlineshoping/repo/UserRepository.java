package com.example.onlineshoping.repo;

import com.example.onlineshoping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);

    Optional<User> findByIdAndPassword(int id,String pass);
}

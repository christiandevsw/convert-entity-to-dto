package com.dojo.springbootdtotutorial.repository;

import com.dojo.springbootdtotutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

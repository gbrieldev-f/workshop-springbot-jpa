package com.educandoweb.testeCourse.repositories;

import com.educandoweb.testeCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

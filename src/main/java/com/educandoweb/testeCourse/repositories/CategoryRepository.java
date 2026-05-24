package com.educandoweb.testeCourse.repositories;

import com.educandoweb.testeCourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

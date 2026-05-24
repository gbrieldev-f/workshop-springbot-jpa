package com.educandoweb.testeCourse.repositories;

import com.educandoweb.testeCourse.entities.Category;
import com.educandoweb.testeCourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

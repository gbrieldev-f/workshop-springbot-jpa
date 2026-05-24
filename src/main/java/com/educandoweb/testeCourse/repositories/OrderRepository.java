package com.educandoweb.testeCourse.repositories;

import com.educandoweb.testeCourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

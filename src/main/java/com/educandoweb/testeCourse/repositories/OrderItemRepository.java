package com.educandoweb.testeCourse.repositories;

import com.educandoweb.testeCourse.entities.Category;
import com.educandoweb.testeCourse.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

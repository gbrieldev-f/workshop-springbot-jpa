package com.educandoweb.testeCourse.services;

import com.educandoweb.testeCourse.entities.Order;
import com.educandoweb.testeCourse.entities.User;
import com.educandoweb.testeCourse.repositories.OrderRepository;
import com.educandoweb.testeCourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional obj = orderRepository.findById(id);
        return (Order) obj.get();
    }
}

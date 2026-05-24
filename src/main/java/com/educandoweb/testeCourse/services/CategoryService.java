package com.educandoweb.testeCourse.services;

import com.educandoweb.testeCourse.entities.Category;
import com.educandoweb.testeCourse.entities.Order;
import com.educandoweb.testeCourse.repositories.CategoryRepository;
import com.educandoweb.testeCourse.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional obj = categoryRepository.findById(id);
        return (Category) obj.get();
    }
}

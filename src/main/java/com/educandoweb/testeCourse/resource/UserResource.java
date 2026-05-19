package com.educandoweb.testeCourse.resource;

import com.educandoweb.testeCourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> FindAll() {
        User u = new User(1L, "Maria", "maria@gmail.com","1190737398","senha1");
        return ResponseEntity.ok().body(u);
    }
}

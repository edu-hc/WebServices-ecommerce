package com.webser.ecommerce.controller;

import com.webser.ecommerce.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    public ResponseEntity<User> findAll() {
        return ResponseEntity.ok(new User());
    }

}

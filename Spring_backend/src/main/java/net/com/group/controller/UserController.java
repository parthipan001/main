package net.com.group.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.com.group.model.User;
import net.com.group.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController


public class UserController {
	
	@Autowired
    private UserRepository userRepository;

    @GetMapping("students")
    public List < User > getUsers() {
        return this.userRepository.findAll();
    }

}

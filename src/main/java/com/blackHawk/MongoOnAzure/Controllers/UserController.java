package com.blackHawk.MongoOnAzure.Controllers;

import com.blackHawk.MongoOnAzure.Repository.UserRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.blackHawk.MongoOnAzure.Models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/users")
public class UserController {

    @Autowired
    private UserRepository repository;


    @GetMapping
    public ResponseEntity<List<User>> GetAllUser()
    {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping(value = "add/{name}")
    public String AddUser(@PathVariable String name)
    {
        User u = new User(name);
        repository.save(u);
        return "OK";
    }

}

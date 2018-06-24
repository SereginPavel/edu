package com.example.edu.rest;

import com.example.edu.model.User;
import com.example.edu.model.UsersRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UsersController {
    private UsersRepository repository;

    public UsersController(UsersRepository repository) {
        this.repository = repository;
        User user = new User();
        user.setName("Ivan");
        repository.save(user);
    }

    public List<UserDto> allUsers(){
        return repository.findAll().stream().map(user -> new UserDto(){{
            setId("" + user.getId());
            setName(user.getName());
        }}).collect(Collectors.toList());
    }
}

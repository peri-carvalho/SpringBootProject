package com.webgradleproject.course.services;

import com.webgradleproject.course.entities.User;
import com.webgradleproject.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Registar como um componente spring, para conseguir passar utilizar , @Component, @Repository neste caso @Service...
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
       Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}

package com.webgradleproject.course.services;

import com.webgradleproject.course.entities.Order;
import com.webgradleproject.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Registar como um componente spring, para conseguir passar utilizar , @Component, @Repository neste caso @Service...
@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
       Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}

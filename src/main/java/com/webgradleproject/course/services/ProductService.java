package com.webgradleproject.course.services;

import com.webgradleproject.course.entities.Product;
import com.webgradleproject.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Registar como um componente spring, para conseguir passar utilizar , @Component, @Repository neste caso @Service...
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
       Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}

package com.webgradleproject.course.services;

import com.webgradleproject.course.entities.Category;
import com.webgradleproject.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Registar como um componente spring, para conseguir passar utilizar , @Component, @Repository neste caso @Service...
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
       Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}

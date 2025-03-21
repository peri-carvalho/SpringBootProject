package com.webgradleproject.course.repositories;

import com.webgradleproject.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//Opcional @Repository , pois já esta herdando o JpaRepository que já esta registrado como um component spring
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

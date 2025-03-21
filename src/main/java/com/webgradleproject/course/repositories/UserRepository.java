package com.webgradleproject.course.repositories;

import com.webgradleproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Opcional @Repository , pois já esta herdando o JpaRepository que já esta registrado como um component spring
public interface UserRepository extends JpaRepository<User, Long> {

}

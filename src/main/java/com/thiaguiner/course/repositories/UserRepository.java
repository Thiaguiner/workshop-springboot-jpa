package com.thiaguiner.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiaguiner.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}


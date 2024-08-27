package com.thiaguiner.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiaguiner.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}


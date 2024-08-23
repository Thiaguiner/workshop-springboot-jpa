package com.thiaguiner.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiaguiner.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}


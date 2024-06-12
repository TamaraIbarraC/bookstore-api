package com.gandhi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gandhi.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}

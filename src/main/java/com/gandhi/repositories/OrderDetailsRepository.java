package com.gandhi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gandhi.models.OrderDetail;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetail, Long>{

}

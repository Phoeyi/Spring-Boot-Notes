package com.cathaybk.project.answer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cathaybk.project.answer.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{

}

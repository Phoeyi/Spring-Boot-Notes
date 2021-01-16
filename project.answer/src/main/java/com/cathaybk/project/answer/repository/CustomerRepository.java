package com.cathaybk.project.answer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cathaybk.project.answer.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{

}

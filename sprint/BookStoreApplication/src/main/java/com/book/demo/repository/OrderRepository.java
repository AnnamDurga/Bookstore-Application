package com.book.demo.repository;

import org.springframework.stereotype.Repository;

import com.book.demo.entity.Order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository

public interface OrderRepository extends JpaRepository<Order, Integer> ,IOrderCustomRepository {

}

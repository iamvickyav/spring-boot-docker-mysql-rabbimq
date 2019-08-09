package com.iamvickyav.sbootdocker.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}

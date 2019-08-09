package com.iamvickyav.sbootdocker;

import com.iamvickyav.sbootdocker.db.Order;
import com.iamvickyav.sbootdocker.db.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    @RequestMapping("/order/all")
    ResponseEntity<Order> getAllOrders(){
        List<Order> orderList = orderRepo.findAll();
        return new ResponseEntity(orderList, HttpStatus.OK);
    }
}

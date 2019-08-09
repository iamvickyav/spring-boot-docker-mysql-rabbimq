package com.iamvickyav.sbootdocker.rabbit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iamvickyav.sbootdocker.db.Order;
import com.iamvickyav.sbootdocker.db.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RabbitReceiver {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    ObjectMapper objectMapper;

    public void receiveMessage(String message) {
        try {
            Order orderReceived = objectMapper.readValue(message, Order.class);
            orderReceived = orderRepo.save(orderReceived);
            System.out.println("Order processed & persisted in DB " + orderReceived.getCustId());
        } catch (IOException e) {
            System.out.println("Problem in processing the order");
            e.printStackTrace();
        }
    }
}
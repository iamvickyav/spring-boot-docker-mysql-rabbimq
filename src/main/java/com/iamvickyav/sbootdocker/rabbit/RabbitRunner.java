package com.iamvickyav.sbootdocker.rabbit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iamvickyav.sbootdocker.db.Order;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/** Sample Code Taken from https://spring.io/guides/gs/messaging-rabbitmq/ & modified a little **/

@Component
public class RabbitRunner implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;

    public RabbitRunner(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order("Samsung 14inch LED TV", "SAMSUNG", "CUS_235");
        String jsonString = objectMapper.writeValueAsString(order);

        rabbitTemplate.convertAndSend(RabbitConfig.topicExchangeName, "foo.bar.baz", jsonString);
        System.out.println("Order posted in Queue...");
    }

}

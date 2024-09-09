package com.petize.product.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import com.petize.product.listener.dto.OrderCreatedEvent;


import static com.petize.product.config.RabbitMqConfig.ORDER_CREATED_QUEUE;






@Component
public class OrderListener {


    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message){
        System.out.println(message);
        //patchOrder(message);
    }
    
}

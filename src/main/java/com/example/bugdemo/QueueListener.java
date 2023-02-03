package com.example.bugdemo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class QueueListener {

    @RabbitListener(id = "queue-one", queues = "queue-one")
    public void receiveOne(String messageContent) {
        System.out.println("Received Message on queue one: " + messageContent);
    }

    // @RabbitListener(id = "queue-two", queues = "queue-two")
    // public void receivetwo(String messageContent) {
    //     System.out.println("Received Message on queue two: " + messageContent);
    // }
}

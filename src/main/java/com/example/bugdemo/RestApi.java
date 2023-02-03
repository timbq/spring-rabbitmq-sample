package com.example.bugdemo;

import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistry;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    RabbitListenerEndpointRegistry registry;

    public RestApi(RabbitListenerEndpointRegistry registry) {
        this.registry = registry;
    }

    @PostMapping("stoplistener")
    public void stopListener() {
        this.registry.getListenerContainer("queue-one").stop();
    }
}

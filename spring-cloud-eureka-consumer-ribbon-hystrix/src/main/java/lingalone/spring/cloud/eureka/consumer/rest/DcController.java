package lingalone.spring.cloud.eureka.consumer.rest;

import lingalone.spring.cloud.eureka.consumer.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletionService;

@RestController
public class DcController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ConsumerService consumerService;
    @Autowired
    LoadBalancerClient loadBalancerClient;


    @GetMapping("/consumer")
    public String dc() {

        return consumerService.consumer();
    }

    @GetMapping("/consumer2")
    public String dc2() {

        return consumerService.consumer2();
    }
}

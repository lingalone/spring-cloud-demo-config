package lingalone.spring.cloud.eureka.consumer.rest;

import lingalone.spring.cloud.eureka.consumer.rest.inf.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class DcController {

    @Autowired
    DcClient dcClient;


    @GetMapping("/consumer")
    public String dc() {
       return  dcClient.consumer();
    }
}

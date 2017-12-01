package lingalone.spring.cloud.config.client.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientDiscoveryController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {

        try {
            long time = (long) Math.floor(Math.random()*10000);
            logger.info("Stop time :{} ",time);
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}

package business.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Startup class.
 * @author Kahle
 */
@EnableFeignClients({"business.service.api"})
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    private static Logger log = LoggerFactory.getLogger(Application.class);

    /**
     * Program entry.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("Business web start success! ");
    }

}

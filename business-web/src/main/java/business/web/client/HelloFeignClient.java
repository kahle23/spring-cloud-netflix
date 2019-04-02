package business.web.client;

import business.service.api.HelloClient;
import business.service.pojo.input.HelloInput;
import business.service.pojo.result.HelloResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignClient {
    private Logger log = LoggerFactory.getLogger(HelloFeignClient.class);

    @Autowired
    private HelloClient helloClient;

    public String say() {

        return helloClient.say();
    }

    public HelloResult query(HelloInput helloInput) {

        return helloClient.query(helloInput);
    }

}

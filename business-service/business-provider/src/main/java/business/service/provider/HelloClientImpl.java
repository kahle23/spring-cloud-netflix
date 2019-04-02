package business.service.provider;

import business.service.api.HelloClient;
import business.service.pojo.input.HelloInput;
import business.service.pojo.result.HelloResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloClientImpl implements HelloClient {
    private Logger log = LoggerFactory.getLogger(HelloClientImpl.class);

    @Override
    public String say() {

        return "Hello, " + System.currentTimeMillis();
    }

    @Override
    public HelloResult query(HelloInput helloInput) {
        String name = helloInput.getName();
        HelloResult result = new HelloResult();
        result.setData("Hello, " + name);
        return result;
    }

}

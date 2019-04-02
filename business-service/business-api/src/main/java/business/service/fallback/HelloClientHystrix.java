package business.service.fallback;

import business.service.api.HelloClient;
import business.service.pojo.input.HelloInput;
import business.service.pojo.result.HelloResult;
import org.springframework.stereotype.Component;

@Component
public class HelloClientHystrix implements HelloClient {

    @Override
    public String say() {

        return "Failed. ";
    }

    @Override
    public HelloResult query(HelloInput helloInput) {
        HelloResult result = new HelloResult();
        result.setData("Failed. ");
        return result;
    }

}

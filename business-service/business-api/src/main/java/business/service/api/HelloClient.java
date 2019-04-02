package business.service.api;

import business.service.fallback.HelloClientHystrix;
import business.service.pojo.input.HelloInput;
import business.service.pojo.result.HelloResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "business-microservice", fallback = HelloClientHystrix.class)
public interface HelloClient {

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    String say();

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    HelloResult query(@RequestBody HelloInput helloInput);

}

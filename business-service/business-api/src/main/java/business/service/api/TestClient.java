package business.service.api;

import business.service.fallback.TestClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "business-microservice", fallback = TestClientHystrix.class)
public interface TestClient {

    @RequestMapping(value = "/test/first", method = RequestMethod.GET)
    String first();

}

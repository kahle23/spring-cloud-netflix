package business.web.client;

import business.service.api.TestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestFeignClient {
    private Logger log = LoggerFactory.getLogger(TestFeignClient.class);

    @Autowired
    private TestClient testClient;

    public String first() {

        return testClient.first();
    }

}

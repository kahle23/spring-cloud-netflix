package business.service.fallback;

import business.service.api.TestClient;
import org.springframework.stereotype.Component;

@Component
public class TestClientHystrix implements TestClient {

    @Override
    public String first() {

        return "Failed. ";
    }

}

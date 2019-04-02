package business.service.provider;

import business.service.api.TestClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClientImpl implements TestClient {

    @Override
    public String first() {

        return "Test-First-" + System.currentTimeMillis();
    }

}

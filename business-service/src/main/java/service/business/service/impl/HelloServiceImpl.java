package service.business.service.impl;

import org.springframework.stereotype.Service;
import service.business.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {

        return "Hello, " + System.currentTimeMillis();
    }

}

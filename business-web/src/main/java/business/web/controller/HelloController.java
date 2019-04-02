package business.web.controller;

import business.service.pojo.input.HelloInput;
import business.service.pojo.result.HelloResult;
import business.web.client.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private HelloFeignClient helloFeignClient;

    @ResponseBody
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say() {

        return helloFeignClient.say();
    }

    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public HelloResult query(HelloInput helloInput) {

        return helloFeignClient.query(helloInput);
    }

}

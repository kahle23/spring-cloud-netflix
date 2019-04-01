package service.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.business.service.HelloService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map<String, Object> hello(){
        Map<String, Object> result = new HashMap<>(4);
        result.put("data", helloService.hello());
        return result;
    }

}

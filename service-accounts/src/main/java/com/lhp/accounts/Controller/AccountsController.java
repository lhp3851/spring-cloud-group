package com.lhp.accounts.Controller;

import com.lhp.accounts.Bo.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountsController {

    @Autowired
    private FeignService feignService;

    @Value("${server.port}")
    private String port;
    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello " + port;
    }

    @RequestMapping(value = "/feign/{name}")
    public String feignHello(@PathVariable("name") String name){
        return feignService.hello(name);
    }

}

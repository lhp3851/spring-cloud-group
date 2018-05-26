package com.lhp.accounts.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountsController {

    @RequestMapping(value = "/hello")
    public String hello(String name){
        return "Hello " + name;
    }

}

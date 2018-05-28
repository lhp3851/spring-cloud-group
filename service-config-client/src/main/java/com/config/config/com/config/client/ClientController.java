package com.config.config.com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/config")
public class ClientController {
    @Value("${server.port}")
    private  String port;

    @RequestMapping(value = "/info")
    public String info(){
        return port;
    }

}

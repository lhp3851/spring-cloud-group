package com.lhp.study.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/study")
public class CourseController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello " + port;
    }

}

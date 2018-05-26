package com.lhp.file.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/file")
public class FileWriterController {

    @RequestMapping(value = "/hello")
    public String hello(String name){
        return "Hello " + name + "the time is " + new Date();
    }

}

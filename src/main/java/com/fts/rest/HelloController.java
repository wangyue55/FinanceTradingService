package com.fts.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WangYue on 2017/6/18.
 */
@RestController
public class HelloController {

    @RequestMapping("/greeting")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}

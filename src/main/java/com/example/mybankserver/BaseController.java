package com.example.mybankserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController extends BaseComponent {

    @Autowired
    private BaseService baseService;

    @GetMapping("/hello")
    public String hello() {
        return baseService.hello();
    }
}

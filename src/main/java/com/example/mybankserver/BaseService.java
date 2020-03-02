package com.example.mybankserver;

import org.springframework.stereotype.Service;

@Service
public class BaseService extends BaseComponent {

    public String hello() {
        return "hello";
    }
}

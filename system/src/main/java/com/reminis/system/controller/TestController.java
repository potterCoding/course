package com.reminis.system.controller;

import com.reminis.system.domain.Test;
import com.reminis.system.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/test")
    public List<Test> test() {
        return testService.list();
    }

}

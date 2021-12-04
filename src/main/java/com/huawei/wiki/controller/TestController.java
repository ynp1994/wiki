package com.huawei.wiki.controller;

import com.huawei.wiki.domain.Test;
import com.huawei.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ynp2012
 * @version 1.0
 * @date 2021/12/4 12:51
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!12";
    }

    @GetMapping("/test/listString")
    public String list2() {
        List<Test> list = testService.list();
        return list.stream().map(Test::toString).collect(Collectors.joining());
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}

package com.huawei.wiki.controller;

import com.huawei.wiki.domain.Demo;
import com.huawei.wiki.service.DemoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ynp2012
 * @version 1.0
 * @date 2021/12/4 12:51
 */
@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/demo/listString")
    public String list2() {
        List<Demo> list = demoService.list();
        return list.stream().map(Demo::toString).collect(Collectors.joining());
    }

    @GetMapping("/demo/list")
    public List<Demo> list() {
        return demoService.list();
    }

    @PostMapping("/demo/insert")
    public boolean insert(@RequestParam Long id, @RequestParam String username) {
        Demo demo = new Demo();
        demo.setId(id);
        demo.setUsername(username);
        demoService.insert(demo);
        return true;
    }
}

package com.huawei.wiki.controller;

import com.huawei.wiki.domain.Ebook;
import com.huawei.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/listString")
    public String list2() {
        List<Ebook> list = ebookService.list();
        return list.stream().map(Ebook::toString).collect(Collectors.joining());
    }

    @GetMapping("/list")
    public List<Ebook> list() {
        return ebookService.list();
    }
}

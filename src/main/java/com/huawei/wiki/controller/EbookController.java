package com.huawei.wiki.controller;

import com.huawei.wiki.request.EbookRequest;
import com.huawei.wiki.response.CommonResponse;
import com.huawei.wiki.service.EbookService;
import com.huawei.wiki.vo.EbookVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @GetMapping("/list")
    public CommonResponse<List<EbookVo>> list(EbookRequest request) {
        CommonResponse<List<EbookVo>> response = new CommonResponse<>();
        response.setContent(ebookService.list(request.getName()));
        return response;
    }
}

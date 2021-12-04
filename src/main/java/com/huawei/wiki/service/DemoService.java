package com.huawei.wiki.service;

import com.huawei.wiki.domain.Demo;
import com.huawei.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ynp2012
 * @version 1.0
 * @date 2021/12/4 18:15
 */
@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }

    public void insert(Demo demo) {
        demoMapper.insert(demo);
    }

}

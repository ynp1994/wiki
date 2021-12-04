package com.huawei.wiki.service;

import com.huawei.wiki.domain.Test;
import com.huawei.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ynp2012
 * @version 1.0
 * @date 2021/12/4 18:15
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}

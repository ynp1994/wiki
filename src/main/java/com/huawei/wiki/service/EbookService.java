package com.huawei.wiki.service;

import com.huawei.wiki.domain.Ebook;
import com.huawei.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ynp2012
 * @version 1.0
 * @date 2021/12/4 18:15
 */
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }

    public void insert(Ebook ebook) {
        ebookMapper.insert(ebook);
    }

}

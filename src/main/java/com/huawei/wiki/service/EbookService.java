package com.huawei.wiki.service;

import com.huawei.wiki.domain.Ebook;
import com.huawei.wiki.domain.EbookExample;
import com.huawei.wiki.mapper.EbookMapper;
import com.huawei.wiki.util.CopyUtils;
import com.huawei.wiki.vo.EbookVo;
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

    public List<EbookVo> list(String name) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + name + "%");
        List<Ebook> ebooks = ebookMapper.selectByExample(ebookExample);
        return CopyUtils.copyList(ebooks, EbookVo.class);
    }

    public void insert(Ebook ebook) {
        ebookMapper.insert(ebook);
    }

}

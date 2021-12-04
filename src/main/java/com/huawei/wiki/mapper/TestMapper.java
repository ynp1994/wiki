package com.huawei.wiki.mapper;

import com.huawei.wiki.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ynp2012
 * @version 1.0
 * @date 2021/12/4 18:06
 */
@Mapper
public interface TestMapper {
    /**
     *
     * @return
     */
    List<Test> list();
}

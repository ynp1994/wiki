package com.huawei.wiki.util;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ynp2012
 * @version 1.0
 * @date 2021/12/4 22:40
 */
public class CopyUtils {
    /**
     * 单体复制
     *
     * @param source 源
     * @param clazz 类
     * @param <T> 复制的类型
     * @return 实例
     */
    public static <T, R> R copy(T source, Class<R> clazz) {
        if (source == null) {
            return null;
        }
        R instance;
        try {
            instance = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        BeanUtils.copyProperties(source, instance);
        return instance;
    }

    public static <T, R> List<R> copyList(List<T> sources, Class<R> clazz) {
        return sources.stream().map(source -> {
            R r;
            try {
                r = clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            BeanUtils.copyProperties(source, r);
            return r;
        }).collect(Collectors.toList());
    }
}

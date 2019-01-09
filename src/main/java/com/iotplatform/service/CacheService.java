package com.iotplatform.service;


import java.io.IOException;
import java.util.List;

/**
 * @author liumingfang
 */
public interface CacheService {
    /**
     * @Description 当前缓存的类型
     * @author xiebifeng
     * @date 2019/1/3 13:41
     */
    String getType();

    /**
     * @Description 清空缓存内容
     * @author xiebifeng
     * @date 2019/1/3 13:41
     */
    void clear();

    /**
     * @Description 放入缓存
     * @author xiebifeng
     * @date 2019/1/3 13:41
     */
    void putString(String key, String value);

    /**
     * @Description 放入缓存+时间
     * @author xiebifeng
     * @date 2019/1/3 13:41
     */
    void putString(String key, String value, int seconds);

    /**
     * @Description 获取缓存值
     * @author xiebifeng
     * @date 2019/1/3 13:41
     */
    String getString(String key);

    /**
     * @Description 放入整个对象
     * @author xiebifeng
     * @date 2019/1/3 13:41
     */
    void putObject(String key, Object value) throws IOException;

    /**
     * @Description 放入+时间
     * @author xiebifeng
     * @date 2019/1/3 13:41
     */
    void putObject(String key, Object value, int seconds) throws IOException;

    /**
     * @Description 获取换粗值
     * @author xiebifeng
     * @date 2019/1/3 13:41
     */
    <T> T getObject(String key, Class<T> clazz) throws IOException;

    /**
     * @Description 获取缓存数据列表
     * @author xiebifeng
     * @date 2019/1/3 13:41
     */
    <T> List<T> getList(String key, Class<T> clazz) throws IOException;
}

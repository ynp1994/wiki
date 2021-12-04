package com.huawei.wiki.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 * @author ynp2012
 * @date 2021-12-4 12:50:16
 * @version 1.0
 */
@ComponentScan("com.huawei.wiki")
@SpringBootApplication
public class WikiApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOGGER.info("启动成功！！");
        LOGGER.info("地址：\thttp:127.0.0.1:{}", env.getProperty("server.port"));
    }

}

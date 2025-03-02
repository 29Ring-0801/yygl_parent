package com.siro.yyds.msm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 阿里云短信服务
 *
 * @author starsea
 * @date 2022-02-03
 */
@ComponentScan(basePackages = "com.siro.yyds")
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动配置
public class ServiceMsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMsmApplication.class, args);
    }

}

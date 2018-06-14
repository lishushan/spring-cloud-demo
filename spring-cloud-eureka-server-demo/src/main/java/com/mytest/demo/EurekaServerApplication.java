package com.mytest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka是一个高可用的组件，它没有后端缓存（因此可以在内存中完成），每一个实例注册之后需要向注册中心发送心跳。<br/>
 * 在默认情况下eureka server也是一个eureka client。<br/>
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
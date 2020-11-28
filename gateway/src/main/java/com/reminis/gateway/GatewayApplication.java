package com.reminis.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

    private static final Logger LOG = LoggerFactory.getLogger(GatewayApplication.class);
//    public static void main(String[] args) {
//        SpringApplication.run(EurekaApplication.class, args);
//    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GatewayApplication.class);
        ConfigurableEnvironment environment = app.run(args).getEnvironment();
        LOG.info("启动成功！！！");
        LOG.info("Gateway地址：\thttp://127.0.0.1:{}",environment.getProperty("server.port"));
    }
}

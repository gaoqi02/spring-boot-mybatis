package com.ecbusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//开启注解
@EnableTransactionManagement
//引入属性文件
@PropertySource("classpath:application.properties")
@Configuration
@ImportResource({ "classpath:captcha.xml"})
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        application.run(Application.class);

    }
}

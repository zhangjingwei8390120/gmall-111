package com.zhang.gmall.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
  1. 整合 dubbo
  2.整合 mybatisPlus
  3. 整合 logstash
   1) 导 jar
   2) 导 logback-spring.xml 配置
 */
@MapperScan(basePackages = "com.zhang.gmall.pms.mapper")

@EnableDubbo
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}

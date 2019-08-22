package com.wiggin.springboot.demo.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//123

//456

/**
 * copyright 2015-2020
 *
 * @author wiggin
 * @date 2017/9/26 22:40
 * @Description: 启动类
 */
@SpringBootApplication
@MapperScan(basePackages = "com.wiggin.springboot.demo.dao")
@ComponentScan("com.wiggin.springboot.demo.*")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
        System.out.println("v2");
        System.out.println("this is v2  呀呀呀");
    }
   public static void test(){
       System.out.println("this is 测试方法"); 
  }
}

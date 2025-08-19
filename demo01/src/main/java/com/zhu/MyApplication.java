package com.zhu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        //java10： 局部变量类型的⾃动推断
        var ioc = SpringApplication.run(MyApplication.class, args);
        //1、获取容器中所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();
        //2、挨个遍历：
        // dispatcherServlet、beanNameViewResolver、characterEncodingFilter、multipartResolver
        // SpringBoot把以前配置的核⼼组件现在都给我们⾃动配置好了。
        for (String name : names) {
            System.out.println(name);
        }
    }
}
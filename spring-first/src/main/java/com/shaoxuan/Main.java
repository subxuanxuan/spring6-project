package com.shaoxuan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ${USER}
 * ${DATE}
 */
public class Main {
    public void print() {
        System.out.println("Hello world!");
    }


    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context-bean.xml");
        //获取对象
        Main main = (Main) context.getBean("main");
        //使用对象调用方法进行测试
        main.print();
    }
}
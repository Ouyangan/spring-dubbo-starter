package com.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ouyangan on 2017/9/1.
 */
@Slf4j
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        int read = System.in.read();// 按任意键退出
        log.debug(read + "");
    }
}

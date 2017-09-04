package com.consumer;

import com.api.MsgService;
import com.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

/**
 * Created by ouyangan on 2017/9/1.
 */
@Slf4j
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        MsgService msgService = context.getBean(MsgService.class);// 获取远程服务代理
        for (int i = 0; i < 10; i++) {
            Result result = msgService.sendMsg(UUID.randomUUID().toString());// 执行远程方法
            log.debug(result.toString());
        }
        System.in.read();
    }
}

package com.tensquare.rabbit.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 张东
 * @create 2020-03-13 16:16
 * @desc
 */
@Component
@RabbitListener(queues = "zd")
public class Customer1 {

    @RabbitHandler
    public void getMsg(String msg) {
        System.out.println("zd：" + msg);
    }
}

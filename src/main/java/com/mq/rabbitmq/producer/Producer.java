package com.mq.rabbitmq.producer;

import com.mq.rabbitmq.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class Producer {

    private final static String QUEUE_NAME = "queue_simple";

    public static void main(String[] argv) throws Exception {
        // 获取连接
        Connection connection = ConnectionUtil.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();

        // 声明队列 (不存在则创建)
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        // 发送消息
        String message = "Hello World";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());

        // 关闭通道和连接
        channel.close();
        connection.close();
    }
}

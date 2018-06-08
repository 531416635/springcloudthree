package com.yao.rabbitConfig;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;

public class ConsumerConfig {

    private String queueName;
    private String routingKey;
    private int onOfConsumer;

    public int getOnOfConsumer() {
        return onOfConsumer;
    }

    public void setOnOfConsumer(int onOfConsumer) {
        this.onOfConsumer = onOfConsumer;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    public ConsumerConfig(String queueName, String routingKey, int onOfConsumer) throws Exception {
        this.queueName = queueName;
        this.routingKey = routingKey;
        this.onOfConsumer = onOfConsumer;
        ConsumerSimpleMessageListenerContainer container = new ConsumerSimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory());
        container.setQueueNames(this.queueName);
        container.setConcurrentConsumers(this.onOfConsumer);
        container.setMessageListener(new MessageListenerAdapter(new ConsumerHandler()));
        container.startConsumers();
    }

    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        return connectionFactory;
    }
}
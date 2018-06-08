package com.yao.rabbitConfig;

public class ConsumerHandler {
    public void handleMessage(String text) {
        System.out.println("Received--------------------------: " + text);
    }
}
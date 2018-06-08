package com.yao;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication  {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }

    @Bean
    public SampleFilterByUserName sampleFilterByUserName(){
        return new SampleFilterByUserName();
    }

    @Bean
    public SampleFilterByPassWord sampleFilterByPassWord(){
        return new SampleFilterByPassWord();
    }
}

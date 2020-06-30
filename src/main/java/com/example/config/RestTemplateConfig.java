package com.example.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        //resttemplateのインスタンスを作成するビルダークラス
        //リクエスト送信先のURLを指定して呼び出す
        return restTemplateBuilder.rootUri("http://localhost:8080").build();
    }
}

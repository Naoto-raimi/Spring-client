package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestOperations;

@SpringBootApplication
public class Delete {

    public static void main(String[] args) {
        // DIコンテナを作成
        SpringApplication application = new SpringApplication(Delete.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        ApplicationContext context = application.run(args);

        // RestOperationsを取得
        RestOperations operations = context.getBean(RestOperations.class);

        // DELETEリクエストを送信
        operations.delete("/employees/{id}", 110);
    }
}

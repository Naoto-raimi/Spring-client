package com.example;

import com.example.web.request.EmployeeRequest;
import com.example.web.response.EmployeeResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestOperations;

import java.time.LocalDate;

@SpringBootApplication
public class Update {

    public static void main(String[] args) {
        // DIコンテナを作成
        SpringApplication application = new SpringApplication(Update.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        ApplicationContext context = application.run(args);

        // RestOperationsを取得
        RestOperations operations = context.getBean(RestOperations.class);

        // 更新後のデータを作成
        EmployeeRequest employeeRequest = new EmployeeRequest("斎藤四郎", LocalDate.of(2019, 12, 31), 20);

        // PUTリクエストを送信
        operations.put("/employees/{id}", employeeRequest, 110);

        // GETリクエストを送信
        EmployeeResponse employeeResponse = operations
                .getForObject("/employees/{id}", EmployeeResponse.class, 110);
        System.out.println(employeeResponse);
    }
}

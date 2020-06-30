package com.example;

import com.example.web.response.EmployeeResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestOperations;

@SpringBootApplication
public class FindById {
        public static void main(String[] args) {
            SpringApplication application = new SpringApplication(FindById.class);
            application.setWebApplicationType(WebApplicationType.NONE);
            ApplicationContext context = application.run(args);

            // restoperationsを取得
            RestOperations operations = context.getBean(RestOperations.class);

            // getリクエスト
            EmployeeResponse employeeResponse = operations
                    .getForObject("/employees/{id}", EmployeeResponse.class, 102);
            System.out.println(employeeResponse);
        }
}

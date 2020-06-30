package com.example;

import com.example.web.response.EmployeeResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;

import java.util.List;

@SpringBootApplication
public class FindAll {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FindAll.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        ApplicationContext context = application.run(args);

        // restoperationsを取得
        RestOperations operations = context.getBean(RestOperations.class);

        // getリクエスト
        ResponseEntity<List<EmployeeResponse>> responseEntity =
                operations.exchange("/employees",
                        HttpMethod.GET, null, new ParameterizedTypeReference<>(){});
        List<EmployeeResponse> employeeResponseList = responseEntity.getBody();
        for(EmployeeResponse employeeResponse : employeeResponseList){
            System.out.println(employeeResponse);
        }
    }
}

package com.example;

import com.example.web.request.EmployeeRequest;
import com.example.web.response.EmployeeResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;

import java.time.LocalDate;

@SpringBootApplication
public class Insert {

    public static void main(String[] args) {
        // DIコンテナを作成
        SpringApplication application = new SpringApplication(Insert.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        ApplicationContext context = application.run(args);

        // RestOperationsを取得
        RestOperations operations = context.getBean(RestOperations.class);

        // POSTリクエストを送信
        EmployeeRequest employeeRequest = new EmployeeRequest("和田三郎", LocalDate.of(2019, 1, 1), 10);
        ResponseEntity entity = operations
                .postForEntity("/employees", employeeRequest, null);

        // LocationヘッダーのURLを利用して、作成した社員のデータをGETで取得
        EmployeeResponse employeeResponse = operations
                .getForObject(entity.getHeaders().getLocation(), EmployeeResponse.class);
        System.out.println(employeeResponse);
    }
}

package pl.devmeet.employeesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class EmployeesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeesServiceApplication.class, args);
    }

}

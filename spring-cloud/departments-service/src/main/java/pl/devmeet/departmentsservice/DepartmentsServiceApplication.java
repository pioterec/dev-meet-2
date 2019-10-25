package pl.devmeet.departmentsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DepartmentsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentsServiceApplication.class, args);
    }

}

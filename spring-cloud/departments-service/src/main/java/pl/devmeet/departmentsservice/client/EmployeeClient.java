package pl.devmeet.departmentsservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "employees-service", fallback = EmployeeClientFallback.class)
public interface EmployeeClient {

    @GetMapping(value = "employees")
    List getAllEmployees();


}

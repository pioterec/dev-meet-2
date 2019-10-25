package pl.devmeet.employeesservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "departments-service", fallback = DepartmentsClientFallback.class)
public interface DepartmentsClient {

    @GetMapping("/departments")
    List getAllDepartments();
}

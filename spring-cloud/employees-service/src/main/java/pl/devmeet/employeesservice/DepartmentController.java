package pl.devmeet.employeesservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.devmeet.employeesservice.client.DepartmentsClient;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentsClient departmentsClient;

    @GetMapping("/departments")
    List getAllDepartments() {
        return departmentsClient.getAllDepartments();
    }
}

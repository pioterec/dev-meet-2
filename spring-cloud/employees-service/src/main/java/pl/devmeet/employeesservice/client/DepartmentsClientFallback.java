package pl.devmeet.employeesservice.client;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DepartmentsClientFallback implements DepartmentsClient {
    @Override
    public List getAllDepartments() {
        return new ArrayList();
    }
}

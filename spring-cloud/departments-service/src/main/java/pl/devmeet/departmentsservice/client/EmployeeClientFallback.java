package pl.devmeet.departmentsservice.client;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClientFallback implements EmployeeClient {


    @Override
    public List getAllEmployees() {
        return new ArrayList();
    }
}

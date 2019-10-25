package pl.devmeet.departmentsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.devmeet.departmentsservice.dto.DepartmentDto;
import pl.devmeet.departmentsservice.model.Department;
import pl.devmeet.departmentsservice.repository.DepartmentRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DepartmentsController {

    private final DepartmentRepository departmentRepository;

    @Value("${message:Hello default}")
    private String message;

    @Autowired
    public DepartmentsController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }


    @PutMapping("/department/new")
    public void addDepartment(@RequestBody DepartmentDto departmentDto) {
        Department department = new Department();
        department.setName(departmentDto.getName());
        department.setCity(departmentDto.getCity());

        departmentRepository.save(department);
    }

    @GetMapping("/departments")
    public List<DepartmentDto> getDepartments() {
//        throw new RuntimeException();
        return departmentRepository.findAll().stream()
                .map(department -> new DepartmentDto(department.getId(), department.getName(), department.getCity()))
                .collect(Collectors.toList());
    }

}

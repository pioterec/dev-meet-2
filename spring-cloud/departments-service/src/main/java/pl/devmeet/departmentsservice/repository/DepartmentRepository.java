package pl.devmeet.departmentsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.devmeet.departmentsservice.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

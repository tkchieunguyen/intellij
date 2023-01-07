package rtr.packag.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rtr.packag.testing.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}

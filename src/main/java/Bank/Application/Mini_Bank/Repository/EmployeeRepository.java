
package Bank.Application.Mini_Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Bank.Application.Mini_Bank.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

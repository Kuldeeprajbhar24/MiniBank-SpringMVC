
package Bank.Application.Mini_Bank.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import Bank.Application.Mini_Bank.Model.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}

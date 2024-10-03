
package Bank.Application.Mini_Bank.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import Bank.Application.Mini_Bank.Model.Bank;
public interface BankRepository extends JpaRepository<Bank, Long> {
}

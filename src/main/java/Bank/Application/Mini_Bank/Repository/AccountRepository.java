
package Bank.Application.Mini_Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Bank.Application.Mini_Bank.Model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}

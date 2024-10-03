
package Bank.Application.Mini_Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Bank.Application.Mini_Bank.Model.DebitCard;

public interface DebitCardRepository extends JpaRepository<DebitCard, Long> {
}

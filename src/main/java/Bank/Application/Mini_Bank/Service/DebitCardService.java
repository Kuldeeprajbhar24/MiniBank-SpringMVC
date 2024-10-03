package Bank.Application.Mini_Bank.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bank.Application.Mini_Bank.Model.DebitCard;
import Bank.Application.Mini_Bank.Repository.DebitCardRepository;

import java.util.List;

@Service
public class DebitCardService {

    @Autowired
    private DebitCardRepository debitCardRepository;

    public DebitCard saveDebitCard(DebitCard debitCard) {
        return debitCardRepository.save(debitCard);
    }

    public List<DebitCard> getAllDebitCards() {
        return debitCardRepository.findAll();
    }

    public DebitCard getDebitCardById(Long id) {
        return debitCardRepository.findById(id).orElse(null);
    }

    public void deleteDebitCard(Long id) {
        debitCardRepository.deleteById(id);
    }

    public DebitCard updateDebitCard(Long id, DebitCard updatedDebitCard) {
        DebitCard debitCard = debitCardRepository.findById(id).orElse(null);
        if (debitCard != null) {
            debitCard.setCardNumber(((DebitCard) updatedDebitCard).getCardNumber());
            debitCard.setExpiryDate(((DebitCard) updatedDebitCard).getExpiryDate());
            debitCard.setCvv(updatedDebitCard.getCvv());
            return debitCardRepository.save(debitCard);
        }
        return null;
    }
}

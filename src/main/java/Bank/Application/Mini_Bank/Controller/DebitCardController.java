
package Bank.Application.Mini_Bank.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Bank.Application.Mini_Bank.Model.DebitCard;
import Bank.Application.Mini_Bank.Service.DebitCardService;

import java.util.List;

@RestController
@RequestMapping("/api/debit-cards")
public class DebitCardController {

    @Autowired
    private DebitCardService debitCardService;

    @PostMapping("/save")
    public DebitCard saveDebitCard(@RequestBody DebitCard debitCard) {
        return debitCardService.saveDebitCard(debitCard);
    }

    @GetMapping("/all")
    public List<DebitCard> getAllDebitCards() {
        return debitCardService.getAllDebitCards();
    }

    @GetMapping("/{id}")
    public DebitCard getDebitCardById(@PathVariable Long id) {
        return debitCardService.getDebitCardById(id);
    }

    @PutMapping("/update/{id}")
    public DebitCard updateDebitCard(@PathVariable Long id, @RequestBody DebitCard debitCard) {
        return debitCardService.updateDebitCard(id, debitCard);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDebitCard(@PathVariable Long id) {
        debitCardService.deleteDebitCard(id);
    }
}

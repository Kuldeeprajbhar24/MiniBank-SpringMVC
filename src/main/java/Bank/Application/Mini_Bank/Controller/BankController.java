package Bank.Application.Mini_Bank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Bank.Application.Mini_Bank.Model.Bank;
import Bank.Application.Mini_Bank.Service.BankService;

import java.util.List;

@RestController
@RequestMapping("/api/banks")
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping("/save")
    public Bank saveBank(@RequestBody Bank bank) {
        return bankService.saveBank(bank);
    }

    @GetMapping("/all")
    public List<Bank> getAllBanks() {
        return bankService.getAllBanks();
    }

    @GetMapping("/{id}")
    public Bank getBankById(@PathVariable Long id) {
        return bankService.getBankById(id);
    }

    @PutMapping("/update/{id}")
    public Bank updateBank(@PathVariable Long id, @RequestBody Bank bank) {
        return bankService.updateBank(id, bank);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteBank(@PathVariable Long id) {
        bankService.deleteBank(id);
    }
}

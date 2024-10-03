package Bank.Application.Mini_Bank.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bank.Application.Mini_Bank.Model.Bank;
import Bank.Application.Mini_Bank.Repository.BankRepository;

import java.util.List;

@Service
public class BankService {

    @Autowired
    private BankRepository bankRepository;

    public Bank saveBank(Bank bank) {
        return bankRepository.save(bank);
    }

    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    public Bank getBankById(Long id) {
        return bankRepository.findById(id).orElse(null);
    }

    public void deleteBank(Long id) {
        bankRepository.deleteById(id);
    }

    public Bank updateBank(Long id, Bank updatedBank) {
        Bank bank = bankRepository.findById(id).orElse(null);
        if (bank != null) {
            bank.setName(updatedBank.getName());
            bank.setAddress(updatedBank.getAddress());
            return bankRepository.save(bank);
        }
        return null;
    }
}

package Bank.Application.Mini_Bank.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bank.Application.Mini_Bank.Model.Account;
import Bank.Application.Mini_Bank.Repository.AccountRepository;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

    public Account updateAccount(Long id, Account updatedAccount) {
        Account account = accountRepository.findById(id).orElse(null);
        if (account != null) {
            account.setAccountHolderName(updatedAccount.getAccountHolderName());
            account.setBalance(updatedAccount.getBalance());
            return accountRepository.save(account);
        }
        return null;
    }
}

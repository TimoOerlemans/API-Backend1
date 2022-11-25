package com.example.backendproduct.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(AccountDTO account)
    {
        Account account1 = DTOconverter.convertToObject(account);
        return accountRepository.save(account1);
    }

    public AccountViewModel login(String emailID) {
        Account account = accountRepository.findByemailID(emailID);
        AccountViewModel vm = new AccountViewModel();
        if(account == null){
            vm.setLogged(false);
            return vm;
        }
        vm = AccountConvertor.convertAccountToViewModel(account);
        vm.setLogged(true);
        return vm;
    }

    public Account findByEmail(String Email) {
        return null;
    }
}

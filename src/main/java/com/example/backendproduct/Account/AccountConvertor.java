package com.example.backendproduct.Account;

import com.example.backendproduct.Account.Account;
import com.example.backendproduct.Account.AccountViewModel;

public class AccountConvertor {

    public static AccountViewModel convertAccountToViewModel(Account account)
    {
        AccountViewModel vm = new AccountViewModel();
        vm.setId((account.getId()));
        vm.setFirstname(account.getFirstName());
        vm.setLastname(account.getLastName());
        vm.setEmailID(account.getEmailID());
        vm.setPassword(account.getPassword());
        return vm;
    }
}

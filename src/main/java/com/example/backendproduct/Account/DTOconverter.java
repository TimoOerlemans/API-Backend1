package com.example.backendproduct.Account;

import com.example.backendproduct.Account.Account;

public class DTOconverter {

    public static Account convertToObject(AccountDTO accountDTO) {
        Account account = new Account();
        account.setEmailID(accountDTO.emailID);
        account.setFirstName(accountDTO.firstName);
        account.setLastName(accountDTO.lastName);
        account.setPassword(accountDTO.password);
        return account;
    }
}


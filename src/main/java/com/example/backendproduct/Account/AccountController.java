package com.example.backendproduct.Account;

import com.example.backendproduct.Account.Account;
import com.example.backendproduct.Account.AccountViewModel;

import com.example.backendproduct.Account.AccountRepository;
import com.example.backendproduct.Account.AccountService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/add")
    public String add(@RequestBody AccountDTO account) {
        accountService.saveAccount(account);
        return "New Account is added";
    }

    @GetMapping("/email/{emailID}")
    public AccountViewModel Login(@PathVariable String emailID) {
        return accountService.login(emailID);
    }
}



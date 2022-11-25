package com.example.backendproduct.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountViewModel {

    public Long Id;

    public String firstname;

    public String lastname;

    public String password;

    public String emailID;

    public boolean logged;
}


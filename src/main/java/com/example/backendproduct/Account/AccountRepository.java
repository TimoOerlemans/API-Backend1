package com.example.backendproduct.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
    Account findByemailID(String emailID);
}

package com.docker_demo.service;

import com.docker_demo.dto.AccountDetails;
import com.docker_demo.entity.Accounts;
import com.docker_demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    /**
     * @param accountNo
     * @return
     */
    public AccountDetails fetchAccountDetails(String accountNo) {
        Accounts accounts = accountRepository.findByAccountNo(accountNo);
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setAccountNumber(accountNo);
        accountDetails.setBalance(accounts.getBalance());
        accountDetails.setCustomerId(accounts.getCustomerId());
        return accountDetails;
    }
}

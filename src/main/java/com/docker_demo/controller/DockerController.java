package com.docker_demo.controller;

import com.docker_demo.dto.AccountDetails;
import com.docker_demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello-world from docker project";
    }

    @GetMapping(value = "/getAccount")
    public ResponseEntity<AccountDetails> getAccountDetails(@RequestParam String accountNo){
        AccountDetails accountDetails= accountService.fetchAccountDetails(accountNo);
        return ResponseEntity.status(HttpStatus.OK).body(accountDetails);
    }

}

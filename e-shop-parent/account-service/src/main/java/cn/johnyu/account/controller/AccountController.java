package cn.johnyu.account.controller;

import cn.johnyu.account.mapper.AccountMapper;
import cn.johnyu.commons.dto.AccountDto;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountMapper accountMapper;
    @DS(value = "slave")
    @GetMapping("/accounts/{aid}")
    public AccountDto loadAccount(@PathVariable("aid") int aid){
        return accountMapper.loadAccount(aid);
    }

    @DS(value = "master")
    @PostMapping(value = "/reduceBalance")
    public int reduceBalance(int aid,int balance){
        return accountMapper.reduceBalance(aid,balance);
    }
}

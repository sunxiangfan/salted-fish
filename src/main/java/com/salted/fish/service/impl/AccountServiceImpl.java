package com.salted.fish.service.impl;

import java.util.List;

import com.salted.fish.mapper.AccountMapper;
import com.salted.fish.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<User> getLoadOrderByOrderId() {
        return null;
    }
}

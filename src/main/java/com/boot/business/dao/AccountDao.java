package com.boot.business.dao;

import com.boot.business.dao.impl.AccountImpe;
import com.boot.business.entity.Account;

import javax.annotation.Resource;
import java.util.List;

public class AccountDao {

    @Resource
    private AccountImpe ai;


    /**
     * GL：通过id获取账户信息
     * @return
     */
    public String getId() {

        List<Account> accountList = ai.findAll();
        Account account = accountList.get(0);

        return account.getId();
    }


}

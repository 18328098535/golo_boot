package com.boot.business.dao.impl;

import com.boot.business.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 2019-07-23 GL:新增 创建Account表的简单查询接口
 */
public interface AccountImpe extends JpaRepository<Account, String> {

    /**
     * GL:通过账户id查找账户信息
     * @param id
     * @return
     */
    Account queryAccountById(String id);

    /**
     * GL:通过账户名称查找账户信息
     * @param userName
     * @return
     */
    Account queryAccountByUserName(String userName);

}

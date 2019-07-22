package com.boot.service;

import com.boot.dao.AccountDao;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {


    private AccountDao ad;


    /**
     * GL：创建服务层计数方法
     * @return
     */
    public int getSum() {
        // 声明结果变量
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result += i;
        }

        return result;
    }

    /**
     * GL:获取用户id
     * @return
     */
    public String getAccountId() {

        String id = ad.getId();

        return id;
    }

}

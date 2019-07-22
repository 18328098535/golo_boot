package com.boot.web;

import com.boot.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * GL：WEB控制层
 */
@RestController
@RequestMapping(value = "/web")
public class WebTest {

    /**
     * 依赖注入
     */
    @Autowired
    private ServiceTest st;


    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    public int getResult() {

        // 调用service层
        int sum = st.getSum();

        return sum;
    }

    @RequestMapping(value = "/accountId", method = RequestMethod.GET)
    public String getAccountId() {

        String id = st.getAccountId();

        return id;
    }

}

package com.boot.business.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/web")
public class WebControl {

    @RequestMapping(value = "/login")
    public String login() {
        return "Login";
    }


}

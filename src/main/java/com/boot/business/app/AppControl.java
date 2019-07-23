package com.boot.business.app;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app")
public class AppControl {

    @RequestMapping(value = "/login")
    public String login() {

        JSONObject json = new JSONObject();
        json.put("userName", "userPass");

        return json.toString();
    }



}

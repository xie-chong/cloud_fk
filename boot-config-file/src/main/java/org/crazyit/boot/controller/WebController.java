package org.crazyit.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    private Environment env;

    // 通过界面查看配置信息
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index2() {

        return "The Property jdbc.user : " + env.getProperty("jdbc.user");
    }
}


package com.mgb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    /**
     * 主页的显示
     * @return
     */
    @RequestMapping("/home")
    public  String home(){
        return  "index";
    }

    /**
     * 欢迎页面显示
     */
    @RequestMapping("/welcome")
    public  String welcome(){
        return "/welcome";
    }

}

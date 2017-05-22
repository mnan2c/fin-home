package com.mnan2c.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zmn on 2017/4/3.
 */
@RequestMapping("redirect")
@Controller
public class WebController {

    @RequestMapping("/chart")
    public String toChart(){
        return "public/echart";
    }

    @RequestMapping("/{demoCase}")
    public String demoCase1(@PathVariable String demoCase){
        return "web/" + demoCase;
    }
}

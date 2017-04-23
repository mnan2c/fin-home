package com.mnan2c.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zmn on 2017/4/2.
 */
@Controller
public class LoginController {

    @RequestMapping(value={"/login","/",""})
    public String login() {
        return "public/login";
    }

    @RequestMapping(value = "/loginPost", method = RequestMethod.POST)
    public String loginPost(@RequestParam(value = "name", required = false) String name,
                                  @RequestParam(value = "password", required = false) String password,
                                  HttpSession session,Model model) {
        Map<String, Object> map = new HashMap<>();
        if (!"123456".equals(password) || !"zmn@localhost".equals(name)) {
            map.put("success", false);
            map.put("message", "账号或密码错误！");
            model.addAttribute("map",map);
            return "public/login";
        }
        // 设置session
        session.setAttribute(WebSecurityConfig.SESSION_KEY, name);
        map.put("success", true);

        return "web/multiLevelMenu";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 移除session
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "public/login";
    }
}

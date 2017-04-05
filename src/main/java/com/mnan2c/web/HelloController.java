package com.mnan2c.web;

import com.mnan2c.entity.User;
import com.mnan2c.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zmn on 2017/3/31.
 */
@Controller
public class HelloController {

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @RequestMapping(value = "/userinfo")
    public String getAllUsers(Model model) {
        // This returns a JSON or XML with the users
        Iterable<User> iterable = userRepository.findAll();
        model.addAttribute("users", iterable);
        return "public/userinfo";
    }
}

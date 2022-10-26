package com.bao.controller;

import com.bao.pojo.User;
import com.bao.service.UserService;
import com.bao.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService = new UserServiceImpl();

    @RequestMapping("/allUser")
    public String list(Model model)
    {
        List<User> users = userService.queryAllUsers();
        model.addAttribute("users",users);
        return "alluser";
    }

    @RequestMapping("/goLogin")
    public String loginIndex() {return "login";}

    @RequestMapping("/login")
    public String login(HttpSession session,String username,String password,Model model)
    {
        User user = userService.queryUserByName(username);
        if(user.getPassword().equals(password))
        {
            session.setAttribute("userLoginInfo",username);
            return "redirect:/book/allBook";
        }
        model.addAttribute("error","username error");
        return "login";
    }
}
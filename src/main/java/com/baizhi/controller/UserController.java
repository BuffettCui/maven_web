package com.baizhi.controller;

import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 崔建昂
 * on 2019/4/8
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("selectAll")
    public String selectAll(ModelMap modelMap) {
        List list = userService.selectAll();
        modelMap.addAttribute("list", list);
        return "forward:/index1.jsp";
    }
}

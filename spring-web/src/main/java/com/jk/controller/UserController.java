package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findlist")
    @ResponseBody
    public List<UserBean> queryGoodsList(){
        List<UserBean> list = userService.findlist();
        return list;

    }

    @PostMapping("adduser")
    @ResponseBody
    public void adduser(UserBean userBean){
        userService.adduser(userBean);
    }

    @DeleteMapping("delete")
    @ResponseBody
    public void deleteGood(@RequestParam Integer id){
        userService.delete(id);
    }

    //回显
    @GetMapping("queryUserById")
    @ResponseBody
    public UserBean queryUserById(Integer id){
        return userService.queryUserById(id);
    }


}

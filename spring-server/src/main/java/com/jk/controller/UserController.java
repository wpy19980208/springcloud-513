package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //查询
    @GetMapping("findlist")
    @ResponseBody
    public List<UserBean> queryGoodsList(){
        List<UserBean> user = userService.findlist();
        return user;
    }

    //新增
    @PostMapping("adduser")
    @ResponseBody
    public void adduser(@RequestBody UserBean userBean){
        userService.addlist(userBean);
    }

    //删除
    @DeleteMapping("delete/{id}")
    @ResponseBody
    public void deleteGood(@RequestParam("id") Integer id){
        userService.delete(id);
    }
    //回显
    @GetMapping("queryUserById/{id}")
    @ResponseBody
    public UserBean queryGoodById(@PathVariable("id")Integer id){
        return userService.queryUserById(id);
    }
}

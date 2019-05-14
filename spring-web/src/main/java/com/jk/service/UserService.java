package com.jk.service;

import com.jk.model.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("spring-server")
public interface UserService {

    @GetMapping("findlist")
    List<UserBean> findlist();

    @PostMapping("adduser")
    void adduser(UserBean userBean);

    @DeleteMapping("delete/{id}")
    void delete(@RequestParam Integer id);

    @GetMapping("queryUserById/{id}")
    UserBean queryUserById(@PathVariable("id")Integer id);
}

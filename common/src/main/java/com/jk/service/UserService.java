package com.jk.service;

import com.jk.model.UserBean;

import java.util.List;

public interface UserService {


    List<UserBean> findlist();

    void addlist(UserBean userBean);

    void delete(Integer id);

    UserBean queryUserById(Integer id);
}

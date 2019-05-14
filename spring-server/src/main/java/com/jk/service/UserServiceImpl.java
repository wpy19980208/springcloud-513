package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserBean> findlist() {
        return userMapper.findlist();
    }

    @Override
    public void addlist(UserBean userBean) {
        if(userBean.getId() == null){
            userMapper.addlist(userBean);
        }else{
            userMapper.updateUserList(userBean);
        }


    }

    @Override
    public void delete(@RequestParam Integer id) {
        userMapper.delete(id);
    }

    @Override
    public UserBean queryUserById(Integer id) {
        return userMapper.queryUserById(id);
    }
}
